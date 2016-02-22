/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rclaros.monitor.bean;

/**
 *
 * @author Reynaldo Claros
 * @email reyiclaros@gmail.com
 */
public class CPUInfo {

    private long user;
    private long system;
    private long nice;
    private long idle;
    private long wait;
    private long irq;
    private long soft_irq;
    private long stolen;
    private long total;

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getSystem() {
        return system;
    }

    public void setSystem(long system) {
        this.system = system;
    }

    public long getNice() {
        return nice;
    }

    public void setNice(long nice) {
        this.nice = nice;
    }

    public long getIdle() {
        return idle;
    }

    public void setIdle(long idle) {
        this.idle = idle;
    }

    public long getWait() {
        return wait;
    }

    public void setWait(long wait) {
        this.wait = wait;
    }

    public long getIrq() {
        return irq;
    }

    public void setIrq(long irq) {
        this.irq = irq;
    }

    public long getSoft_irq() {
        return soft_irq;
    }

    public void setSoft_irq(long soft_irq) {
        this.soft_irq = soft_irq;
    }

    public long getStolen() {
        return stolen;
    }

    public void setStolen(long stolen) {
        this.stolen = stolen;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}
