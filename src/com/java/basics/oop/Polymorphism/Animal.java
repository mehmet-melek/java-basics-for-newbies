package com.java.basics.oop.Polymorphism;

public class Animal {
    
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void perform() {
        System.out.println("Execute on Animal Class");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
