package com.careerit.jsf.day2;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if( num % 2 == 0){
            System.out.println("Given number "+num+" is even");
        }else{
            System.out.println("Given number "+num+" is odd");
        }

    }
}
