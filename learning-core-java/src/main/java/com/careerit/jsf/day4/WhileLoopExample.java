package com.careerit.jsf.day4;

public class WhileLoopExample {

    public static void main(String[] args) {

        int num = 19;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " * " + i + " = " + (num * i));
//        }
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
