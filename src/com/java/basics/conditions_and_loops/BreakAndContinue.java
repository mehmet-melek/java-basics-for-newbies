package com.java.basics.conditions_and_loops;

import java.util.Scanner;

public class BreakAndContinue {
    
    public void perform() {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        // Break
        
        while (true) {
            System.out.println("Please enter operation");
            int operation = scanner.nextInt();
            if (operation == 0) {
                System.out.println("Canceled");
                break;
            }
            System.out.println("Operation is = " + operation);
        }
        
        
        // Continue
        
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 5 || i == 7) {
                continue;
            }
            System.out.println("i = " + i);
        }
        
        
        int y = 0;
        while (y < 10) {
            if (y == 3 || y == 5 || y == 7) {
                y++;                            // Important for while loops
                continue;
            }
            System.out.println("y = " + y);
            y++;
        }
    }
}
