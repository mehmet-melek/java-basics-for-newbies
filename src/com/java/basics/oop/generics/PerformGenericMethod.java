package com.java.basics.oop.generics;

import java.util.logging.Logger;

public class PerformGenericMethod {


    private String[]  string;
    private Integer[] integers;

    public PerformGenericMethod() {
        this.string = new String[]{"first", "second"};
        this.integers = new Integer[]{0, 1, 2, 3};
    }

    public String[] getString() {
        return string;
    }

    public void setString(String[] string) {
        this.string = string;
    }

    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }

    public <E> void sampleGenericMethod(E[] array) {

        for (E temp : array) {
            System.out.println(temp);
        }

    }

}
