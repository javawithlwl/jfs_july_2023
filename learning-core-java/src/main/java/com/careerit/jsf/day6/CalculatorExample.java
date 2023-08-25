package com.careerit.jsf.day6;

import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("Enter the num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2:");
            int num2 = sc.nextInt();
            System.out.println("Enter the operation (+,-,*,/):");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Result is :" + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result is :" + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result is :" + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Result is :" + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.println("Do you want to continue (y/n):");
            char choice = sc.next().charAt(0);
            if (choice == 'n') {
                break;
            }
        }
    }
}
