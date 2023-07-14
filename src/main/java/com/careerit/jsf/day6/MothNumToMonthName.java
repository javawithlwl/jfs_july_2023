package com.careerit.jsf.day6;

import java.util.Scanner;

public class MothNumToMonthName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number (1-12):");
        int num = scanner.nextInt();
        String monthName = switch (num) {
            case 1 -> {
                System.out.println("Wish you happy new year");
                yield  "January";
            }
            case 2 -> "Feburary";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number";
        };
        System.out.println("Month number "+num+" and name "+monthName);
    }
}
