package com.java.basics.exception_handling;


/**
 * Created by melek.
 */

public class FinallyBlocks {


    public FinallyBlocks() {

        try {

            String variable = null;
            System.out.println(variable.hashCode());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            System.out.println("It works in any situation and if we don't handle with catch block the program will stop.");
        }

    }
}
