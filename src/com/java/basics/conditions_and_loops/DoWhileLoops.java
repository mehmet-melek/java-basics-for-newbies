package com.java.basics.conditions_and_loops;

import java.util.Scanner;

public class DoWhileLoops {
    
    public void perform() {
        
        
        //Calculating the sum of the numbers of the entered number
        
        int number;
        int sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        
        number = scanner.nextInt();
        
        do {
            sum += (number % 10);
            number /= 10;
        }
        while (number > 0);
        
        System.out.println("Sum = " + sum);
    }
}
