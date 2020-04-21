package com.java.basics.oop;

public class Constructors {
    
    private String carType;
    private int    carModelYear;
    private int    carHp;
    private String carColor;
    
    public Constructors(String carType, int carModelYear, int carHp, String carColor) {
        this.carType = carType;
        this.carModelYear = carModelYear;
        this.carHp = carHp;
        this.carColor = carColor;
    }
    
    public Constructors() {
        this("Not defined", 2000, 60, "Not defined");
    }
    
    public Constructors(int carModelYear, int carHp) {
        this("Default type", carModelYear, carHp, "Default color");
    }
    
    public String getCarType() {
        return carType;
    }
    
    public void setCarType(String carType) {
        this.carType = carType;
    }
    
    public int getCarModelYear() {
        return carModelYear;
    }
    
    public void setCarModelYear(int carModelYear) {
        this.carModelYear = carModelYear;
    }
    
    public int getCarHp() {
        return carHp;
    }
    
    public void setCarHp(int carHp) {
        this.carHp = carHp;
    }
    
    public String getCarColor() {
        return carColor;
    }
    
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
