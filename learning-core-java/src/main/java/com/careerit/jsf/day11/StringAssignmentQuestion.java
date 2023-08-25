package com.careerit.jsf.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Read names from names.txt file and store in the list and display first 3 characters in upper case
public class StringAssignmentQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(StringAssignmentQuestion.class.getResourceAsStream("/names.txt"));
        List<String> names = new ArrayList<>();
        while (sc.hasNext()) {
            names.add(sc.nextLine());
        }
        for (String name : names) {
            System.out.println(name.substring(0, 3).toUpperCase());
        }

    }
}
