/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rclaros.monitor.util;

import java.util.ArrayList;
import java.util.List;
import org.hyperic.sigar.Cpu;
import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.rclaros.monitor.bean.CPUInfo;
import org.rclaros.monitor.bean.DiskInfo;
import org.rclaros.monitor.bean.ServerInfo;
import org.rclaros.monitor.exception.STException;

/**
 *
 * @author Reynaldo Claros
 * @email reyiclaros@gmail.com
 */
public class STSigarInfo {

    private static Sigar sigar;

    /**
     *
     * @return @throws STException
     */
    public static ServerInfo info() throws STException {
        ServerInfo object = new ServerInfo();
        try {
            sigar = new Sigar();
            addGenericOSInfo(object);
            addGenericCPUInfo(object);
            addGenericMemory(object);
            addDiskInfo(object);
            addCPUInfo(object);
        } catch (SigarException e) {
            throw new org.rclaros.monitor.exception.SigarException(e.getMessage(), e);
        }
        sigar = null;
        return object;
    }

    /**
     *
     * @param object
     * @throws SigarException
     */
    private static void addGenericMemory(ServerInfo object) throws SigarException {
        Mem mem = null;
        mem = sigar.getMem();
        if (mem != null) {
            object.setMem_total(mem.getTotal());
            object.setMem_used(mem.getUsed());
            object.setMem_used_percent((int) mem.getUsedPercent() + "%");
            object.setMem_free(mem.getFree());
            object.setMem_free_percent((int) mem.getFreePercent());
            object.setMem_actual_free(mem.getActualFree());
            object.setMem_actual_used(mem.getActualUsed());
        }
        CpuPerc cpuperc = sigar.getCpuPerc();
        if (object != null) {
            object.setCpu_used_percent(CpuPerc.format(cpuperc.getCombined()));
        }
    }

    /**
     *
     * @param object
     * @throws SigarException
     */
    private static void addGenericOSInfo(ServerInfo object) throws SigarException {
        OperatingSystem os = OperatingSystem.getInstance();
        object.setOs_name(os.getName());
        object.setOs_description(os.getDescription());
        object.setOs_version(os.getVersion());
        object.setOs_arch(os.getArch());
        object.setOs_patch_level(os.getPatchLevel());
        object.setOs_vendor(os.getVendor());
        object.setOs_vendor_code(os.getVendorCodeName());
        object.setOs_vendor_name(os.getVendorName());
        object.setOs_vendor_version(os.getVendorVersion());
    }

    /**
     *
     * @param object
     * @throws SigarException
     */
    private static void addGenericCPUInfo(ServerInfo object) throws SigarException {
        CpuInfo[] infos = sigar.getCpuInfoList();
        CpuInfo info = infos[0];
        object.setCpu_vendor(info.getVendor());
        object.setCpu_model(info.getModel());
        object.setCpu_core(info.getTotalCores());
        object.setCpu_mgz(info.getMhz());
        if ((info.getTotalCores() != info.getTotalSockets())
                || (info.getCoresPerSocket() > info.getTotalCores())) {
            object.setCpu_physical_cpu(info.getTotalSockets());
            object.setCpu_core_per_cpu(info.getCoresPerSocket());
        }
    }

    private static void addDiskInfo(ServerInfo object) throws SigarException {
        org.hyperic.sigar.FileSystem[] list = sigar.getFileSystemList();
        List<DiskInfo> nwlist = new ArrayList<DiskInfo>();
        long total = 0;
        double total_used = 0;
        for (org.hyperic.sigar.FileSystem obj : list) {
            try {
                FileSystemUsage usage = sigar.getFileSystemUsage(obj.getDevName());
                if (usage.getTotal() > 0) {
                    DiskInfo aux = new DiskInfo();
                    aux.setDiskName(obj.getDevName());
                    aux.setDiskPath(obj.getDirName());
                    aux.setDiskType(obj.getTypeName());
                    aux.setFree(usage.getFree());
                    aux.setTotal(usage.getTotal());
                    aux.setUsedPercent((int) (usage.getUsePercent() * 100) + "%");
                    aux.setUsed(usage.getUsed());
                    aux.setAvailable(usage.getAvail());
                    total_used += usage.getUsed();
                    total += usage.getTotal();
                    nwlist.add(aux);
                }
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
        }
        /**
         * Calculate Percent %
         */
        if (total > 0 && total_used > 0) {
            int x = (int) ((100 * total_used) / total);
            object.setDisk_used_percent(x + "%");
        }

        object.setDisks(nwlist);
    }

    private static void addCPUInfo(ServerInfo object) throws SigarException {
        Cpu[] list = sigar.getCpuList();
        List<CPUInfo> nwlist = new ArrayList<CPUInfo>();
        for (Cpu obj : list) {
            CPUInfo aux = new CPUInfo();
            aux.setIdle(obj.getIdle());
            aux.setIrq(obj.getIrq());
            aux.setNice(obj.getNice());
            aux.setSoft_irq(obj.getSoftIrq());
            aux.setStolen(obj.getStolen());
            aux.setSystem(obj.getSys());
            aux.setTotal(obj.getTotal());
            aux.setUser(obj.getUser());
            aux.setWait(obj.getWait());
            nwlist.add(aux);
        }
        object.setCpus(nwlist);
    }
}
