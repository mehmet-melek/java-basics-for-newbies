package com.java.basics.collectionframework;

import java.util.*;

/**
 * Created by melek.
 */

// Each value can be added only once
public class HashSet_LinkedHashSet_TreeSet {

    public HashSet_LinkedHashSet_TreeSet() {

        //HasSet
        start_time = System.currentTimeMillis();
        hash.add("Java");
        hash.add(".Net");
        hash.add("C++");
        hash.add("Php");
        hash.add("Python");
        hash.add("Python"); // Each value can be added only once


        for (String value : hash) {
            System.out.println(value);
        }
        finis_time = System.currentTimeMillis();
        System.out.println(" *********** HasSet took " + (finis_time - start_time) + " ms and listed in randomly ");


        //LinkedHashSet
        start_time = System.currentTimeMillis();
        linkedHash.add("Java");
        linkedHash.add(".Net");
        linkedHash.add("C++");
        linkedHash.add("Php");
        linkedHash.add("Python");

        for (String value : linkedHash) {
            System.out.println(value);
        }
        finis_time = System.currentTimeMillis();
        System.out.println(" *********** LinkedHashSet took " + (finis_time - start_time) + " ms and listed in order ");


        //TreeSet
        start_time = System.currentTimeMillis();
        tree.add("Java");
        tree.add(".Net");
        tree.add("C++");
        tree.add("Php");
        tree.add("Python");

        for (String value : tree) {
            System.out.println(value);
        }
        finis_time = System.currentTimeMillis();
        System.out.println(" *********** TreeSet took " + (finis_time - start_time) + " ms and listed in alphabetically ");


        //Sample methods
        System.out.println("hash is empty ? > " + hash.isEmpty());
        System.out.println("LinkedHash contains Java ? > " + linkedHash.contains("Java"));


    }

    private Set<String> hash       = new HashSet<String>();
    private Set<String> linkedHash = new LinkedHashSet<String>();
    private Set<String> tree       = new TreeSet<String>();
    private Long        start_time;
    private Long        finis_time;


    public void differenceSet() {

        //Difference set
        System.out.println(tree.remove("C++"));
        System.out.println(tree.remove("Java"));

        Set<String> differenceSet = new java.util.HashSet<String>(linkedHash);
        System.out.println("Difference between linkedHash and tree ");

        System.out.println(differenceSet.removeAll(tree));
        for (String value : differenceSet) {
            System.out.println(value);
        }

    }

    public void intersectionSet() {

        //Intersection set
        System.out.println(tree.add("Go"));
        System.out.println(tree.add("Groovy"));

        Set<String> intersectionSet = new java.util.HashSet<String>(linkedHash);
        System.out.println(intersectionSet.retainAll(tree));

        System.out.println("Intersection between linkedHash and tree ");
        for (String value : intersectionSet) {
            System.out.println(value);
        }

    }


}
