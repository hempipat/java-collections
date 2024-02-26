package com.hempipat.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// NOTE: 1. Create a HashSet from another collection using the HashSet(collection c) constructor.
// 2. Add all the elements from a collection to the HashSet using the addAll() method.

public class CreateHashSetFromCollectionExample {

    public static void main(String[] args) {

        // first 5 even numbers
        // Set<Integer> firstFiveEventNumbers = new HashSet<>();
        List<Integer> firstFiveEventNumbers = new ArrayList<>();
        firstFiveEventNumbers.add(2);        
        firstFiveEventNumbers.add(4);        
        firstFiveEventNumbers.add(6);        
        firstFiveEventNumbers.add(8);
        firstFiveEventNumbers.add(10);

        // Create a HashSet from another collection using the HashSet(collection c) constructor.
        Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveEventNumbers);

        System.out.println(tenEvenNumbers);
        
        // Set<Integer> nextFiveEventNumbers = new HashSet<>();
        List<Integer> nextFiveEventNumbers = new ArrayList<>();
        nextFiveEventNumbers.add(12);
        nextFiveEventNumbers.add(14);
        nextFiveEventNumbers.add(16);
        nextFiveEventNumbers.add(18);
        nextFiveEventNumbers.add(20);

        // Add all the elements from a collection to the HashSet using the addAll() method.
        tenEvenNumbers.addAll(nextFiveEventNumbers);

        System.out.println(tenEvenNumbers);
    }
    
}
