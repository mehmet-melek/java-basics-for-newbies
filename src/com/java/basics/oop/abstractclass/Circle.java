package com.java.basics.oop.abstractclass;

public class Circle extends Figure {
    
    private int radius;
    
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void calculateArea() {
        
        System.out.println(Math.PI * getRadius() * getRadius());
    }
    
    public void calculateCircumference() {
    
        System.out.println(2 * Math.PI * getRadius());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
