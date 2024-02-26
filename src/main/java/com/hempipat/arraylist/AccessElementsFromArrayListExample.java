package com.hempipat.arraylist;

import java.util.ArrayList;
import java.util.List;

// NOTE: How to check if an ArrayList is empty using the isEmpty() method.
// NOTE: How to find the size of an ArrayList using the size() method.
// NOTE: How to modify the element at a particular index in an ArrayList using get method.
// NOTE: How to modify the element at a particular index in an ArrayList using set method.
public class AccessElementsFromArrayListExample {

    public static void main (String[] args) {
        List<String> topProgrammingLanguages = new ArrayList<>(); 

        // INFO: Check if an ArrayList is empty
        System.out.println("Is the topProgrammingLanguages list empty? : "
                            + topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("C"); // 0
        topProgrammingLanguages.add("JAVA"); //1
        topProgrammingLanguages.add("C++"); //2
        topProgrammingLanguages.add("Python"); //3
        topProgrammingLanguages.add(".net"); //4

        // TODO: Find this size fo an ArrayList
        System.out.println("Here are the top " + topProgrammingLanguages.size()
                            + " Programming Languages in the world");
        // NOTE: Retrieve the element at a give index
        String bestProgrammingLang = topProgrammingLanguages.get(1);
        System.out.println("bestProgrammingLang => " + bestProgrammingLang);

        String secondBestProgrammingLang = topProgrammingLanguages.get(3);
        System.out.println("secondBestProgrammingLang => " + secondBestProgrammingLang);

        // NOTE: Modify the element at a give index

        topProgrammingLanguages.set(4, "C#");
        System.out.println(topProgrammingLanguages);

    }
    
}
