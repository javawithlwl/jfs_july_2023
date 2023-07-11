package com.careerit.jsf.day3;

import java.util.Scanner;

public class ProfitAndLossExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the buying price: ");
        double buyingPrice = sc.nextDouble();
        System.out.println("Enter the selling price: ");
        double sellingPrice = sc.nextDouble();
        if(sellingPrice > buyingPrice) {
            double profit = sellingPrice - buyingPrice;
            System.out.println("You made profit of " + profit);
        }else if(sellingPrice < buyingPrice) {
            double loss = buyingPrice - sellingPrice;
            System.out.println("You made loss of " + loss);
        }else {
            System.out.println("No profit no loss");
        }
    }
}
