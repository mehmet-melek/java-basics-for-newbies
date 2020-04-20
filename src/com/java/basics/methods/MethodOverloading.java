package com.java.basics.methods;

public class MethodOverloading {
    
    public void perform(int firstInt) {
        
        System.out.println("Result = " + firstInt);
    }
    
    
    public void perform(int firstInt, int secondInt, int thirdInt) {
        
        System.out.println("Result = " + firstInt + secondInt + thirdInt);
    }
    
    public void perform(String firstString) {
        
        System.out.println("String variable = " + firstString);
    }
    
}
