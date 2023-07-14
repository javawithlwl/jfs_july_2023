package com.careerit.jsf.day6;

import java.util.Scanner;

public class NoOfDaysInTheGivenMonthAndYear {

    public static void main(String[] args) {

        // Q: what is leap year?
        // A: if year is divisible by 4 and not divisible by 100 or divisible by 400 then it is leap year

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number (1-12):");
        int month = sc.nextInt();
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        int noOfDays = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default-> -1;
        };
        System.out.println("No of days in the month " + numToMonth(month) + " and year " + year + " is " + noOfDays);

    }
    public static String numToMonth(int month){
        return switch (month) {
            case 1 -> "January";
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
    }
}
