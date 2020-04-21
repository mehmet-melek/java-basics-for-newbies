package com.java.basics.oop.composition;

public class Cpu {
    
    private String brand;
    private String model;
    private int    core;
    private double processorSpeed;
    
    public Cpu(String brand, String model, int core, double processorSpeed) {
        this.brand = brand;
        this.model = model;
        this.core = core;
        this.processorSpeed = processorSpeed;
    }
    
    public void overclock(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }
    
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getCore() {
        return core;
    }
    
    public void setCore(int core) {
        this.core = core;
    }
    
    public double getProcessorSpeed() {
        return processorSpeed;
    }
    
    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }
}
