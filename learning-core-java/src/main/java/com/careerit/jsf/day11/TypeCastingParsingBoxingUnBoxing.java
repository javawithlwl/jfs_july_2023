package com.careerit.jsf.day11;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingParsingBoxingUnBoxing {

    public static void main(String[] args) {

        int a = 10;
        float b = a; // Implicit type casting

        float c = 10.5f;
        int d = (int) c; // Explicit type casting

        // Parsing

        String str = "100";
        int num = Integer.parseInt(str);

        String str1 = "100.5";
        float num1 = Float.parseFloat(str1);


        // Boxing and Unboxing

        Integer ele = 100; // Boxing
        int num2 = ele; // Unboxing

        // byte, short, int, long, float, double, char, boolean
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean
        // int a = 100;
        System.out.println(Integer.toBinaryString(100));

        List<Integer> ints = new ArrayList<>();
    }
}
