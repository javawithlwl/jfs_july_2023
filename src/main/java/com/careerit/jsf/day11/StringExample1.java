package com.careerit.jsf.day11;

public class StringExample1 {

    public static void main(String[] args) {

        String name1 = "Core Java";
        String name2 = "Core Java";

        String name3 = new String("Core Java");
        String name4 = new String("Core Java");

        System.out.println(name1.equals(name2));
        System.out.println(name3.equals(name4));

        // String is immutable
        int regNo = 1001;
        String name = "Manoj";
        double salary = 45000;
        String data = regNo + "," + name + "," + salary;
        System.out.println(data);
    }
}
