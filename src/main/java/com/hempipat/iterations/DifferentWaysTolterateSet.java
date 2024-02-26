package com.hempipat.iterations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysTolterateSet {

    public static void main(String[] args) {

        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");

        // Enhanced for loop
        /* for (String course : courses)
            System.out.println(course);

        // Basic loop with iterator 
        for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // While loop with iterator
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            String course = (String) iterator.next();
            System.out.println(course);
        } */

        // JDK 8 forEach() method with lambda
        // courses.forEach(course -> System.out.println(course));
        
        // JDK 8 streaming + forEach() + lambda expression 
        courses.stream().filter(course -> !"Java".equals(course))
            .forEach(course -> System.out.println(course));
    }
}
