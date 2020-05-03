package com.java.basics.oop.generics;

import java.util.ArrayList;

public class PerformGenericClass {

    SampleGenericClass<String>  stringSampleGenericClass  = new SampleGenericClass<String>();
    SampleGenericClass<Integer> integerSampleGenericClass = new SampleGenericClass<Integer>();

    public void perform() {

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add(0,"first");
        stringArrayList.add(1,"second");

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(0,1);
        integerArrayList.add(1,2);

        stringSampleGenericClass.sampleSoutMethod(stringArrayList);
        integerSampleGenericClass.sampleSoutMethod(integerArrayList);

    }


}
