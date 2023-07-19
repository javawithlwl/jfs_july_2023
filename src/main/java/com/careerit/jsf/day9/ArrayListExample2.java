package com.careerit.jsf.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {

        List<String> namesList1 = new ArrayList<>();
        namesList1.add("Krish");
        namesList1.add("Manoj");

        List<String> namesList2 = new ArrayList<>();
        namesList2.add("Aadhya");
        namesList2.add("Dhatri");

        List<String> namesList3 = new ArrayList<>();
        namesList3.addAll(namesList1);
        namesList3.addAll(namesList2);

        System.out.println(namesList3);
        System.out.println(namesList3.containsAll(namesList1));
        System.out.println(namesList3.containsAll(namesList2));

    }
}
