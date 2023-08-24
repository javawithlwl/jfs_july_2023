package com.careerit.jsf.day2;

import java.util.Scanner;

class IncomeTaxCalculator {
    public static void main(String args[]) {
        double taxAmount = 0, totalIncome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income :");
        totalIncome = sc.nextDouble();
        if (totalIncome <= 300000) {
            taxAmount = 0;
        } else if (totalIncome <= 500000) {
            taxAmount = 0.1 * (totalIncome - 300000);
        } else if (totalIncome <= 1000000) {
            taxAmount = (0.2 * (totalIncome - 500000)) + (0.1 * 200000);
        } else {
            taxAmount = (0.3 * (totalIncome - 1000000)) + (0.2 * 500000) + (0.1 * 200000);
        }

        System.out.println("For income " + totalIncome + " tax is " + taxAmount + " and net income is " + (totalIncome - taxAmount));
    }
}