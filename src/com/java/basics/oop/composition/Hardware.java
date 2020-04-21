package com.java.basics.oop.composition;

public class Hardware {
    
    private Cpu cpu;
    private Gpu gpu;
    
    public Hardware(Cpu cpu, Gpu gpu) {
        this.cpu = cpu;
        this.gpu = gpu;
    }
    
    public Cpu getCpu() {
        return cpu;
    }
    
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    
    public Gpu getGpu() {
        return gpu;
    }
    
    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }
    
}
