package com.java.basics.oop.Polymorphism;

public class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void perform() {
        System.out.println("Execute on Dog class");
    }
}
