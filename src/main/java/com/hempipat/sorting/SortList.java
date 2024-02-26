package com.hempipat.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class SortList {

    public static void main(String[] args) {
        
        /* // create list
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);

        Collections.sort(list); // ascending order

        Collections.reverse(list); // descending order */
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramed", 29, 500000));

        Collections.sort(employees, new Comparator<Employee>() {

            // NOTE: to sorting by number.
            /* @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            } */

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getName().compareTo(o2.getName()));
            } 

        });

        Collections.sort(employees, (o1, o2) -> (o2.getName().compareTo(o1.getName())));
        System.out.println(employees);

        /* Collections.sort(employees,(o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        System.out.println(employees); // NOTE: ascending order */
    }
}

class MySrot implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
