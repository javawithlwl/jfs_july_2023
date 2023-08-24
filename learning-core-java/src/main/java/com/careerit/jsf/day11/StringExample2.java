package com.careerit.jsf.day11;

import java.util.List;

public class StringExample2 {

    public static void main(String[] args) {

        String name1 = "Core Java";
        System.out.println(name1.length());
        System.out.println(name1.charAt(0));
        for (int i = 0; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
        }

        for (int i = name1.length() - 1; i >= 0; i--) {
            System.out.println(name1.charAt(i));
        }

        // count no of vowels in the given string
        String name = "Ravindra Jadeja";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(ch)) {
                count++;
            }
        }
        System.out.println("No of vowels in the given string :" + count);
    }
}
