package com.java.basics.conditions_and_loops;

import java.util.Scanner;

public class ForLoops {
    
    public void perform() {
        
        int loopVariable;
        
        for (loopVariable = 0; loopVariable <= 5; loopVariable++) {
            System.out.println("Loop Variable = " + loopVariable);
        }
        
        
        
        // Sample app
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number = ?");
        int number = scanner.nextInt();
        int result = 1;
        
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
        
    }
}
