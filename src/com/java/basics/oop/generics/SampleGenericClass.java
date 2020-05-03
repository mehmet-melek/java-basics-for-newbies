package com.java.basics.oop.generics;

import java.util.ArrayList;

public class SampleGenericClass<E> {


    public void sampleSoutMethod(ArrayList<E> array) {

        for (E temp : array) {

            System.out.println(temp);
        }

    }

}
