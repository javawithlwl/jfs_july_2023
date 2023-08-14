package com.careerit.jsf.day23;

import java.util.List;

public class ListIterationExample {

    public static void main(String[] args) {

        List<String> list = List.of("Krish", "Manoj", "Charan", "Ramesh", "Jayesh");

        for (String name : list) {
            System.out.println(name);
        }

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }

        // Java-8
        System.out.println("Iterating elements using forEach");
        list.forEach(System.out::println);


    }
}
