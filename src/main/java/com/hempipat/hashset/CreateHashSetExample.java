package com.hempipat.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

    public static void main(String[] args) {
        
        // NOTE: create a HashSet usign the HashSet() constructor
        // and new element to it using the add() method.
        
        // unordered collection
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Scala");
        programmingLanguages.add("JavaScript");

        System.out.println(programmingLanguages);

        // let's add duplicate element
        programmingLanguages.add("Java");

        System.out.println(programmingLanguages);

    }
}
