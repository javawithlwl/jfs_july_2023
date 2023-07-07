package com.careerit.jsf.day1;

public class SwapOfTwoNumber {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swap a = " + num1 + " and b = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap a = " + num1 + " and b = " + num2);
    }
}
