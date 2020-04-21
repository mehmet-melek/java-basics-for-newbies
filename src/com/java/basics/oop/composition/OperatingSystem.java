package com.java.basics.oop.composition;

public class OperatingSystem {
    
    private String name;
    private int    version;
    private String licence;
    
    public OperatingSystem(String name, int version, String licence) {
        this.name = name;
        this.version = version;
        this.licence = licence;
    }
    
    public void upgradeOs(int version) {
        if (version > getVersion()) {
            this.version = version;
        }
        else {
            System.out.println("Version is up-to-date");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getVersion() {
        return version;
    }
    
    public void setVersion(int version) {
        this.version = version;
    }
    
    public String getLicence() {
        return licence;
    }
    
    public void setLicence(String licence) {
        this.licence = licence;
    }
}
