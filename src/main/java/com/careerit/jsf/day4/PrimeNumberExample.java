package com.careerit.jsf.day4;

import java.util.Scanner;

public class PrimeNumberExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if(num == 2 || flag) {
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is not prime number");
        }
    }
}
