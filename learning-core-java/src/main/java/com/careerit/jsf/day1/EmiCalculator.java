package com.careerit.jsf.day1;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount :");
        double amount = scanner.nextDouble();
        System.out.println("Enter the months :");
        int months = scanner.nextInt();
        System.out.println("Enter the rate of interest (%) :");
        double rateOfInterest = scanner.nextDouble();
        double r = rateOfInterest / (12 * 100); // one month interest
        double emi = amount * r * Math.pow(1 + r, months) / (Math.pow(1 + r, months) - 1);
        double totalAmount = emi * months;
        double interestAmount = totalAmount - amount;
        System.out.println("Amount : " + amount);
        System.out.println("EMI : " + emi);
        System.out.println("Months : " + months);
        System.out.println("Total amount : " + totalAmount);
        System.out.println("Interest amount : " + interestAmount);

    }
}
