package com.hempipat.arraylist;

import java.util.ArrayList;
import java.util.List;

// remove()
// removeAll()
// clear()
public class RemoveElementsArrayList {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); 
        // NOTE: Adding new elements to the ArrayList
        fruits.add("Banan"); // 0
        fruits.add("Apple"); // 1
        fruits.add("Mango"); // 2
        fruits.add("Orange"); // 3 
        fruits.add("Pineapple"); //4
        fruits.add("Grapes"); //5

        System.out.println(fruits);

        fruits.remove(4);
        System.out.println(" after removing element at index 4 => " + fruits);

        fruits.remove("Mango");

        System.out.println(" after removing Mango element at index 2 => " + fruits);
    
        // NOTE: Remove all the elements the exist in a given collection
        List<String> subfruitsList = new ArrayList<>();
        subfruitsList.add("Apple");
        subfruitsList.add("Banana");

        fruits.removeAll(subfruitsList);
        System.out.println(fruits);

        fruits.clear();

        System.out.println(fruits);
    }
    
}
