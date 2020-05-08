package com.java.basics.exception_handling;

import java.util.Scanner;

/**
 * Created by melek.
 */

public class ThrowException {

    public ThrowException() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an number (number should be greater then zero)");
        int value = scanner.nextInt();

        if (value <= 0) {
            throw new ArithmeticException();
        }
        else {
            System.out.println(value + " is  greater then zero");
        }
    }
}
