package com.careerit.jsf.day4;

import java.util.Scanner;

public class SumOfDigitsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int num1 = num;
        int sum = 0;
        while (num1 != 0) {
            int r = num1 % 10;
            sum += r;
            num1 /= 10;
        }
        System.out.println("Sum of digits of given number" + num + " is " + sum);
    }
}
