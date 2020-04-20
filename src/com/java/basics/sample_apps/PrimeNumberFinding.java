package com.java.basics.sample_apps;

import java.util.Scanner;

public class PrimeNumberFinding {
    
    
    public void perform() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        
        for (int i = 1; i < number; i++) {
            if (control(i) == true) {
                System.out.println(i);
            }
        }
    }
    
    
    public Boolean control(int number) {
        
        for (int value = 2; value < number; value++) {
            if (number % value == 0) {
                return false;
            }
        }
        return true;
    }
}
