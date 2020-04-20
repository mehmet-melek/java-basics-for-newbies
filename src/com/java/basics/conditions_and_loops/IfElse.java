package com.java.basics.conditions_and_loops;

import java.util.Scanner;

public class IfElse {
    
    
    public void perform() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        
        int number = scanner.nextInt();
        
        if (number == 0) {
            System.out.println(number + " is starting point");
        }
        else if (number > 0) {
            System.out.println(number + " is positive");
        }
        else {
            System.out.println(number + " is negative");
        }
        
        
    }
}
