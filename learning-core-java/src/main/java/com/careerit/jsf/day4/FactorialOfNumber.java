package com.careerit.jsf.day4;

public class FactorialOfNumber {

    public static void main(String[] args) {

        int num = 6;
        int res = 1;
//        for (int i = num; i >= 2; i--) {
//            res *= i;
//        }
        int i = num;
        while(i >= 2){
            res *= i;
            i--;
        }
        System.out.println("Factorial of " + num + " is " + res);
    }
}
