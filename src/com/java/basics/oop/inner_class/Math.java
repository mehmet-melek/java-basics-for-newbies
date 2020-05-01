package com.java.basics.oop.inner_class;

public class Math {
    
    private double pi = java.lang.Math.PI;
    
    public class Factorial {
        
        public int factorial(int num) {
            
            int result = 1;
            
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            
            System.out.println(result);
            
            return result;
        }
    }
    
    public class Circumference {
        
        public double circumference(int radius) {
            System.out.println(2 * pi * radius);
            return (2 * pi * radius);
        }
    }
    
    public static class Quadrangular {
        
        
        public int calculateArea(int firstEdge, int secondEdge) {
            
            System.out.println(firstEdge * secondEdge);
            return (firstEdge * secondEdge);
            
        }
        
        public static int calculateSquareEdge(int edgeLength) {
            
            int sum = 4 * edgeLength;
            System.out.println(sum);
            return sum;
        }
    }
}
