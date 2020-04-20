package com.java.basics.oop;


public class Encapsulation {
    
    private String carType;
    private int    carModelYear;
    private int    carHp;
    private String carColor;
    
    public String getCarType() {
        return carType;
    }
    
    public void setCarType(String carType) {
        if (carType == "SUV" || carType == "Sedan" || carType == "HatchBack") {
            this.carType = carType;
        }
        else {
            System.out.println(carType + " is not defined");
        }
    }
    
    public int getCarModelYear() {
        return carModelYear;
    }
    
    public void setCarModelYear(int carModelYear) {
        if (carModelYear >= 2000 && carModelYear <= 2020) {
            this.carModelYear = carModelYear;
        }
        else {
            System.out.println("It can only between 2000 and 2020.");
        }
    }
    
    public int getCarHp() {
        return carHp;
    }
    
    public void setCarHp(int carHp) {
        if (carHp > 60) {
            this.carHp = carHp;
        }
        else {
            System.out.println("It can only 60+");
        }
    }
    
    public String getCarColor() {
        return carColor;
    }
    
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
