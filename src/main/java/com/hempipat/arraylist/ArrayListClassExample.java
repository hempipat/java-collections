package com.hempipat.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayListClassExample
 */
//How to create an ArrayList using the ArraList() constructor.
//Add new elements to an ArraList using the add(0 method.
public class ArrayListClassExample {

    public static void main(String[] args) {

        // created arraylist object
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);
        
    }

    
}
