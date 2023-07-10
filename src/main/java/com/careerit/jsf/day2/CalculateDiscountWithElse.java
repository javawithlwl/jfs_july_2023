package com.careerit.jsf.day2;

import java.util.Scanner;

// if bill amount is greater than or equal to 1000 then discount is 10% else discount is 5%
public class CalculateDiscountWithElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bill amount: ");
        double billAmount = sc.nextDouble();
        double discount = 0;
        if(billAmount >= 1000) {
            discount = billAmount * 0.1;
        }else{
            discount = billAmount * 0.05;
        }
        double netAmount = billAmount - discount;
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("Discount    :"+discount);
        System.out.println("Net Amount  :"+netAmount);
    }
}
