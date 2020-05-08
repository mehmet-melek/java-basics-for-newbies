package com.java.basics.exception_handling;

import java.io.IOException;

/**
 * Created by melek.
 */

public class CheckedAndUnCheckedException {

    public void checkedException() throws IOException { // we have to add "throws" for checked exceptions
        if (false) {
            throw new IOException();
        }
    }

    public void unCheckedException() {
        if (false) {
            throw new ArithmeticException();
        }
    }


}
