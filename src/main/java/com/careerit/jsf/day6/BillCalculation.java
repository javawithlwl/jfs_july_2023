package com.careerit.jsf.day6;

import java.util.Scanner;

public class BillCalculation {

        // If day is week day 10% (1,2,3)
        // if day is midweek discount 20% (4,5)
        // if day is weekend 30% extra on bill amount (6,7)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double billAmount = sc.nextDouble();
        System.out.println("Enter the day number (1-7):");
        int day = sc.nextInt();

        double totalBillAmount = 0;

        switch (day) {

            case 1, 2, 3:
                System.out.println("Week you get 10% discount");
                totalBillAmount = billAmount - (billAmount * 0.1);
                break;
            case 4, 5:
                System.out.println("Mid week you get 20% discount");
                totalBillAmount = billAmount - (billAmount * 0.2);
                break;
            case 6, 7:
                System.out.println("Weekend you will be charged 30% extra");
                totalBillAmount = billAmount + (billAmount * 0.3);
                break;
            default:
                System.out.println("Invalid day number");
        }

        System.out.println("Total bill amount :"+totalBillAmount);

    }

}
