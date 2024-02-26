package com.hempipat.linkedlist;

import java.util.LinkedList;

// add()
// add(2, element)
// addFirst()
// addLast()
public class CreateLinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana"); // 0
        fruits.add("Apple");
        fruits.add("mango");

        // NOTE: Adding an element at the specified position in the LinkedList.
        System.out.println("initial linkedlist -> " + fruits);

        // NOTE: Adding an element at the beginnig of the LinkedList.
        fruits.addFirst("Strawberry");

        System.out.println(" after adding Strawberry => " + fruits);

        // NOTE: Adding an element at the end of the LinkedList
        fruits.addLast("Orange");

        System.out.println(" after adding Orange => " + fruits);


    }
}
