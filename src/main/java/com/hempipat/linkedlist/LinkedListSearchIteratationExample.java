package com.hempipat.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteratationExample {

    public static void main(String[] args) {

        LinkedList<String> progLangs = new LinkedList<>();

        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Core Java");
        progLangs.add("Java EE");
        progLangs.add("Spring Framework");
        progLangs.add("Hibernate Framework");
        
        boolean result = progLangs.contains("C");
        System.out.println(" result = " + result);

        // NOTE: Find the index of the first occurrence of an element in the LinkedList
        int index = progLangs.indexOf("Core Java");
        System.out.println("index = " + index);

        // NOTE: Find the index of the last occurrence of an element in the LinkedList
        int lastIndex = progLangs.lastIndexOf("Spring Framework");
        System.out.println("lastIndex => " + lastIndex);

        // NOTE: iterator
        Iterator<String> iterator = progLangs.iterator();
        while (iterator.hasNext()) {
            String prog = (String) iterator.next();
            System.out.println(prog);
        }
        // NOTE: for Each 
        progLangs.forEach((element) -> {
            System.out.println(element);
        });
        // NOTE: for each advanced loop        
        for (String e: progLangs) 
            System.out.println(e);

        // simple for loop
    }
}
