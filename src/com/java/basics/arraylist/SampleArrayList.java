package com.java.basics.arraylist;

import java.util.ArrayList;

public class SampleArrayList {
    
    
    public ArrayList<String> addAndRemoveValueThenReturnArrayList() {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Dell");
        arrayList.add("HP");
        arrayList.add("Lenovo");
        arrayList.add("Asus");
        arrayList.add("HP");
        
        arrayList.remove("Asus");
        
        arrayList.set(0, "Apple"); // Changed HP with Apple
        
        return arrayList;
        
    }
    
    
    public void sizeAndIndex(ArrayList<String> arrayList) {
        
        addAndRemoveValueThenReturnArrayList();
        
        System.out.println(arrayList.get(0));
        System.out.println("Size =" + arrayList.size());
        
        System.out.println(arrayList.indexOf("HP")); // its return 1
        System.out.println(arrayList.lastIndexOf("HP")); // It returns 3
        System.out.println(arrayList.lastIndexOf("UnDefinedValue")); // its return -1
        
    }
    
    public void getValues(ArrayList<String> arrayList) {
        
        addAndRemoveValueThenReturnArrayList();
        for (String vale : arrayList) {
            System.out.println(vale);
        }
        
    }
    
    
}
