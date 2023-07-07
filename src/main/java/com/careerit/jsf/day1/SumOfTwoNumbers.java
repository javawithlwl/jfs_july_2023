package com.careerit.jsf.day1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + res);
    }
}
