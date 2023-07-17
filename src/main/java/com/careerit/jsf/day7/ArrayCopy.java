package com.careerit.jsf.day7;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        String[] boys = new String[]{"Manoj", "Charan", "Sai", "Suresh"};
        String[] girls = new String[]{"Manasa", "Siri", "Sowmya", "Sindhu"};

        String[] students = new String[boys.length + girls.length];
        System.out.println(Arrays.toString(students));
//        int c = 0;
//        for (String name : boys) {
//            students[c++] = name;
//        }
//        for (String name : girls) {
//            students[c++] = name;
//        }
//        for (String name : students) {
//            System.out.println(name);
//        }

        System.arraycopy(boys, 0, students, 0, boys.length);
        System.arraycopy(girls,0, students, boys.length, girls.length);
        System.out.println(Arrays.toString(students));
    }
}
