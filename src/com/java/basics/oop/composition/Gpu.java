package com.java.basics.oop.composition;

public class Gpu {
    
    private String brand;
    private String model;
    private int    videoMemory;
    private String videoMemoryType;
    
    public Gpu(String brand, String model, int videoMemory, String videoMemoryType) {
        this.brand = brand;
        this.model = model;
        this.videoMemory = videoMemory;
        this.videoMemoryType = videoMemoryType;
    }
    
    public void upgradeGpuMemory(int videoMemory) {
        if (videoMemory > getVideoMemory()) {
            this.videoMemory = videoMemory;
        }
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
    
    public int getVideoMemory() {
        return videoMemory;
    }
    
    public void setVideoMemory(int videoMemory) {
        this.videoMemory = videoMemory;
    }
    
    public String getVideoMemoryType() {
        return videoMemoryType;
    }
    
    public void setVideoMemoryType(String videoMemoryType) {
        this.videoMemoryType = videoMemoryType;
    }
}
