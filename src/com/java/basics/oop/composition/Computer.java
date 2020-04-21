package com.java.basics.oop.composition;

public class Computer {
    
    private Hardware hardware;
    private Software software;
    
    public Computer(Hardware hardware, Software software) {
        this.hardware = hardware;
        this.software = software;
    }
    
    public Hardware getHardware() {
        return hardware;
    }
    
    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }
    
    public Software getSoftware() {
        return software;
    }
    
    public void setSoftware(Software software) {
        this.software = software;
    }
}
