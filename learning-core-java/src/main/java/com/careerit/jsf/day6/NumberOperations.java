package com.careerit.jsf.day6;

import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("-".repeat(100));
            System.out.println("1. Check prime number");
            System.out.println("2. Reverse the number");
            System.out.println("3. Check palindrome number");
            System.out.println("4. Sum of digits");
            System.out.println("5. Exit");
            System.out.println("-".repeat(100));
            System.out.println("Enter the choice:");
            int choice = sc.nextInt();
            if(choice == 5){
                System.out.println("Thanks for using our app");
                break;
            }
            System.out.println("Enter the num:");
            int num = sc.nextInt();

            switch (choice) {
                case 1:
                    if (MethodExample.isPrime(num)) {
                        System.out.println("Given number " + num + " is prime number");
                    } else {
                        System.out.println("Given number " + num + " is not prime number");
                    }
                    break;
                case 2:
                    System.out.println("Reverse of " + num + " is " + MethodExample.reverse(num));
                    break;
                case 3:
                    if (MethodExample.isPalindrome(num)) {
                        System.out.println("Given number " + num + " is palindrome number");
                    } else {
                        System.out.println("Given number " + num + " is not palindrome number");

                    }
                    break;
                case 4:
                    System.out.println("Sum of digits of " + num + " is " + MethodExample.sumOfDigits(num));
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
