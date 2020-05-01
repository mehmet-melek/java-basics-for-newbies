package com.java.basics.oop.inner_class;

public class LocalInnerClass {
    
    
    public void figureMethod() {
        
        
        class LocalSquare {
            
            public void calculateSquare(int radius) {
                System.out.println(2 * java.lang.Math.PI * radius);
            }
        }
        
        
        LocalSquare localSquare = new LocalSquare();
        localSquare.calculateSquare(8);
    }
    
    
    public void sampleMethod() {
        
        //LocalSquare localSquare = new LocalSquare();
        
    }
    
}
