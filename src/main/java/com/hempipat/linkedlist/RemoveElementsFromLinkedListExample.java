package com.hempipat.linkedlist;

import java.util.LinkedList;

// NOTE: How to remove the first element in the LinkedList.
// NOTE: How to remove the first element in the LinkedList.
// NOTE: How to remove the first element in the LinkedList.
// NOTE: How to remove the first element in the LinkedList.

public class RemoveElementsFromLinkedListExample {

    public static void main(String[] args) {
        
        LinkedList<String> fruitsList = new LinkedList<>();
        fruitsList.add("Banana");
        fruitsList.add("Apple");
        fruitsList.add("mango");
        fruitsList.add("Pinaple");

        System.out.println("Initial LinkedList = " + fruitsList);

        // NOTE: Remove the first element in the LinkedList
        String element = fruitsList.removeFirst();
        System.out.println(" after removing first element => " + element);

        // NOTE: Remove the last element in the LinkedList
        fruitsList.removeLast();
        System.out.println(" after removing last element => " + fruitsList);
        
        fruitsList.remove("banana");
        System.out.println(fruitsList);

        fruitsList.clear();

        System.out.println(fruitsList);


    }

    
}
