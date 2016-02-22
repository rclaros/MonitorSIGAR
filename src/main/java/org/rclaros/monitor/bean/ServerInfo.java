/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rclaros.monitor.bean;

import java.util.List;

/**
 *
 * @author Reynaldo Claros
 * @email reyiclaros@gmail.com
 */
public class ServerInfo {

    private String cpu_vendor;
    private String cpu_model;
    private int cpu_mgz;
    private int cpu_core;
    private int cpu_physical_cpu;
    private int cpu_core_per_cpu;
    private String cpu_used_percent;
    
    private String disk_used_percent;

    private String os_name;
    private String os_description;
    private String os_version;
    private String os_arch;
    private String os_patch_level;
    private String os_vendor;
    private String os_vendor_name;
    private String os_vendor_version;
    private String os_vendor_code;

    private long mem_total;
    private long mem_free;
    private long mem_free_percent;
    private long mem_used;
    private String mem_used_percent;
    private long mem_actual_used;
    private long mem_actual_free;

    List<CPUInfo> cpus;
    List<DiskInfo> disks;

    public String getCpu_vendor() {
        return cpu_vendor;
    }

    public void setCpu_vendor(String cpu_vendor) {
        this.cpu_vendor = cpu_vendor;
    }

    public String getCpu_model() {
        return cpu_model;
    }

    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model;
    }

    public int getCpu_mgz() {
        return cpu_mgz;
    }

    public void setCpu_mgz(int cpu_mgz) {
        this.cpu_mgz = cpu_mgz;
    }

    public int getCpu_core() {
        return cpu_core;
    }

    public void setCpu_core(int cpu_core) {
        this.cpu_core = cpu_core;
    }

    public int getCpu_physical_cpu() {
        return cpu_physical_cpu;
    }

    public void setCpu_physical_cpu(int cpu_physical_cpu) {
        this.cpu_physical_cpu = cpu_physical_cpu;
    }

    public int getCpu_core_per_cpu() {
        return cpu_core_per_cpu;
    }

    public void setCpu_core_per_cpu(int cpu_core_per_cpu) {
        this.cpu_core_per_cpu = cpu_core_per_cpu;
    }

    public String getOs_name() {
        return os_name;
    }

    public void setOs_name(String os_name) {
        this.os_name = os_name;
    }

    public String getOs_description() {
        return os_description;
    }

    public void setOs_description(String os_description) {
        this.os_description = os_description;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getOs_arch() {
        return os_arch;
    }

    public void setOs_arch(String os_arch) {
        this.os_arch = os_arch;
    }

    public String getOs_patch_level() {
        return os_patch_level;
    }

    public void setOs_patch_level(String os_patch_level) {
        this.os_patch_level = os_patch_level;
    }

    public String getOs_vendor() {
        return os_vendor;
    }

    public void setOs_vendor(String os_vendor) {
        this.os_vendor = os_vendor;
    }

    public String getOs_vendor_name() {
        return os_vendor_name;
    }

    public void setOs_vendor_name(String os_vendor_name) {
        this.os_vendor_name = os_vendor_name;
    }

    public String getOs_vendor_version() {
        return os_vendor_version;
    }

    public void setOs_vendor_version(String os_vendor_version) {
        this.os_vendor_version = os_vendor_version;
    }

    public String getOs_vendor_code() {
        return os_vendor_code;
    }

    public void setOs_vendor_code(String os_vendor_code) {
        this.os_vendor_code = os_vendor_code;
    }

    public long getMem_total() {
        return mem_total;
    }

    public void setMem_total(long mem_total) {
        this.mem_total = mem_total;
    }

    public long getMem_free() {
        return mem_free;
    }

    public void setMem_free(long mem_free) {
        this.mem_free = mem_free;
    }

    public long getMem_free_percent() {
        return mem_free_percent;
    }

    public void setMem_free_percent(long mem_free_percent) {
        this.mem_free_percent = mem_free_percent;
    }

    public long getMem_used() {
        return mem_used;
    }

    public void setMem_used(long mem_used) {
        this.mem_used = mem_used;
    }

    public String getMem_used_percent() {
        return mem_used_percent;
    }

    public void setMem_used_percent(String mem_used_percent) {
        this.mem_used_percent = mem_used_percent;
    }

    

    public long getMem_actual_used() {
        return mem_actual_used;
    }

    public void setMem_actual_used(long mem_actual_used) {
        this.mem_actual_used = mem_actual_used;
    }

    public long getMem_actual_free() {
        return mem_actual_free;
    }

    public void setMem_actual_free(long mem_actual_free) {
        this.mem_actual_free = mem_actual_free;
    }

    public List<CPUInfo> getCpus() {
        return cpus;
    }

    public void setCpus(List<CPUInfo> cpus) {
        this.cpus = cpus;
    }

    public List<DiskInfo> getDisks() {
        return disks;
    }

    public void setDisks(List<DiskInfo> disks) {
        this.disks = disks;
    }

    public String getCpu_used_percent() {
        return cpu_used_percent;
    }

    public void setCpu_used_percent(String cpu_used_percent) {
        this.cpu_used_percent = cpu_used_percent;
    }

    public String getDisk_used_percent() {
        return disk_used_percent;
    }

    public void setDisk_used_percent(String disk_used_percent) {
        this.disk_used_percent = disk_used_percent;
    }

   
   

}
