package com.java.basics.linkedlist;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListBasics {
    
    
    public List<String> createLinkedList() {
        
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        return colors;
    }
    
    
    public void showValuesWithForEachLoop(List<String> list) {
        
        for (String value : list) {
            
            System.out.println(value);
        }
    }
    
    public void showValuesWithListIterator(List<String> list) {
        
        list.add(1, "Black");
        list.remove(0);
        
        ListIterator<String> listIterator = list.listIterator();
        
        while (listIterator.hasNext()) {
            
            System.out.println(listIterator.next());
        }
    }
    
    public void addValueToLinkedList(List<String> list, String value) {
        
        ListIterator<String> listIterator = list.listIterator();
        
        while (listIterator.hasNext()) {
            
            int comparisionValue = listIterator.next().compareTo(value);
            
            if (comparisionValue == 0) {
                
                System.out.println(value + " is exist");
                break;
            }
        }
        
        if (!listIterator.hasNext() && listIterator.hasPrevious()) {
            listIterator.add(value);
        }
        showValuesWithForEachLoop(list);
        
    }
    
    
}
