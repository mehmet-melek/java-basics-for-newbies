package com.java.basics.collectionframework;

import java.util.*;

/**
 * Created by melek.
 */

public class HashMap_LinkedHashMap_TreeMap {

    private HashMap<Integer, String>       hashMap       = new HashMap<Integer, String>();
    private LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    private TreeMap<Integer, String>       treeMap       = new TreeMap<Integer, String>();


    private void createMapAndEntry(Map<Integer, String> map) {

        map.put(4, "Python");
        map.put(1, "Java");
        map.put(3, "C++");
        map.put(2, "Php");
        map.put(5, "Python");
        map.put(5, "Python"); // key is exist and value is same so didn't do anything.
        map.put(5, "Groovy"); // key is exist and value is different so updated.

        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


        //For only values
       /* Collection<String> collection = map.values();
        for (String value : collection) {
            System.out.println(value);
        }*/

        System.out.println("***************************");
    }

    public void perform() {
        createMapAndEntry(hashMap);
        createMapAndEntry(linkedHashMap);
        createMapAndEntry(treeMap);
    }
}
