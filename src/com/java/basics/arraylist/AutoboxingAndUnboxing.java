package com.java.basics.arraylist;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {
    
    
    private ArrayList<Integer> arrayList = new ArrayList<Integer>(); // We using Integer class. Beacuse int is primitive data type.
    
    
    public void autoBoxing() {
        
        for (int i = 0; i < 10; i++) {
            
            //arrayList.add(Integer.valueOf(i*3));  //Autoboxing
            
            arrayList.add(i * 3);
        }
        
        
    }
    
    
    public void unboxing() {
        
        autoBoxing();
        for (int i = 0; i < arrayList.size(); i++) {
            
            //System.out.println(arrayList.get(i).intValue()); // Unboxing
            
            System.out.println(arrayList.get(i));
            
        }
    }
}
