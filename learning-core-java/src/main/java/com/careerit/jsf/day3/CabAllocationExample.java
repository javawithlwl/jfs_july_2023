package com.careerit.jsf.day3;

import java.util.Scanner;

public class CabAllocationExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int num = sc.nextInt();
        System.out.println("Enter the cab capacity: ");
        int cabCapacity = sc.nextInt();
        int noOfCabs = 0;
        if(num % cabCapacity == 0) {
            noOfCabs = num / cabCapacity;
        }else {
            noOfCabs = (num / cabCapacity) + 1;
        }
        System.out.println("For "+num+" persons with cab capacity "+cabCapacity+ " required cabs are "+noOfCabs);

    }
}
