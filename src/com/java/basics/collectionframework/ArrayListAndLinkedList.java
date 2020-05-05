package com.java.basics.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {


    private LinkedList<Integer>          linkedList = new LinkedList<Integer>();
    private java.util.ArrayList<Integer> arrayList  = new java.util.ArrayList<Integer>();
    private Long                         start_time;
    private Long                         finis_time;

    public void perform() {

        //addingValueToListInOrder("LinkedList", linkedList);
        //addingValueToListInOrder("ArrayList", arrayList);

        addValueToFirstIndexOfTheList("LinkedList", linkedList);
        addValueToFirstIndexOfTheList("ArrayList", arrayList);


    }

    public void addingValueToListInOrder(String dataType, List<Integer> list) {


        start_time = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            list.add(i);
        }

        finis_time = System.currentTimeMillis();
        System.out.println(dataType + " took " + (finis_time - start_time) + " ms");

    }


    public void addValueToFirstIndexOfTheList(String dataType, List<Integer> list) {

        start_time = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            list.add(0, i);
        }

        finis_time = System.currentTimeMillis();
        System.out.println(dataType + " took " + (finis_time - start_time) + " ms");

    }


}
