package com.careerit.jsf.day2;

import java.util.Scanner;

public class CalculateDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bill amount: ");
        double billAmount = sc.nextDouble();

        double discount = 0;
        if(billAmount >= 1000){
            discount = billAmount * 0.1;
        }
        double netAmount = billAmount - discount;
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("Discount    :"+discount);
        System.out.println("Net Amount  :"+netAmount);
    }
}
