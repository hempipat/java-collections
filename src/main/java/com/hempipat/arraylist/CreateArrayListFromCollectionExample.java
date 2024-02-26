package com.hempipat.arraylist;

import java.util.ArrayList;
import java.util.List;

// NOTE: How to create an ArrayList from another collection using the
// NOTE: ArrayList(Collection c) constructor.

// NOTE: How to add the elements from an existing collection to the new
// NOTE: ArrayList using the addAll() method.
public class CreateArrayListFromCollectionExample {

    public static void main(String[] args) {
        
        // create arraylist object
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(4);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
        
    }
    
}
