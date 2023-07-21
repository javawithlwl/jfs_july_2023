package com.careerit.jsf.day11;

public class StringExample3 {
    public static void main(String[] args) {

        String name = "Core Java";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(5));
        System.out.println(name.contains("Java"));
        System.out.println(name.equalsIgnoreCase("core java"));
        System.out.println(name.startsWith("Core"));
        System.out.println(name.endsWith("Java"));
        System.out.println(name);
    }
}
