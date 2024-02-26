package com.hempipat.linkedlist;

import java.util.LinkedList;

// NOTE: How to get the first element in the LinkedList.
// NOTE: How to get the last element in the LinkedList.
// NOTE: How to get the element at a given index in the LinkedList.
// NOTE: How to get all the elements from LinkedList.

public class RetrieveLinkedListElementsExample {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("Pinaple");

        // NOTE: Getting the first element in the LinkedList using getFirst()
        String firstelement = fruits.getFirst();
        System.out.println(" first element => " + firstelement);

        // NOTE: Getting the last element in the LinkedList using getFirst()
        String lastelement = fruits.getLast();
        System.out.println(" last element => " + lastelement);

        // NOTE: Getting the element at a given position in the LinkedList
        String element = fruits.get(1);
        System.out.println("element => " + element);

        for (String fruit : fruits )
            System.out.println(fruit);

    }
}
