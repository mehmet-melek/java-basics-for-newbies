package com.java.basics.exception_handling;

/**
 * Created by melek.
 */

public class TryCatch {

    public TryCatch() {


        //Arithmetic exception"
        try {
            int variable = 30 / 0;
        }
        catch (Exception exception) {
            System.out.println("Arithmetic exception");
        }


        //ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[6]);

        }
        catch (Exception exception) {
            System.out.println("Out of bound exception");
        }


        // Different catch blocks for different exception types
        try {
            int variable = 30 / 0;

            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[6]);
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Out of bound exception");
        }
        catch (Exception exception) {
            System.out.println("Other exceptions");
            exception.printStackTrace();
        }




    }


}
