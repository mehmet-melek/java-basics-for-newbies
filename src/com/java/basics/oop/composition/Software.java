package com.java.basics.oop.composition;

public class Software {
    
    private OperatingSystem operatingSystem;
    private OtherApps       otherApps;
    
    
    public Software(OperatingSystem operatingSystem, OtherApps otherApps) {
        this.operatingSystem = operatingSystem;
        this.otherApps = otherApps;
    }
    
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }
    
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    
    public OtherApps getOtherApps() {
        return otherApps;
    }
    
    public void setOtherApps(OtherApps otherApps) {
        this.otherApps = otherApps;
    }
}


