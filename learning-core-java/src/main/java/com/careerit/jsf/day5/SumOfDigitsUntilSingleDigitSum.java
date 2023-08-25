package com.careerit.jsf.day5;

public class SumOfDigitsUntilSingleDigitSum {

    public static void main(String[] args) {

        int num = 918162;
        int num1 = num;
        while (num > 9) {
            num = num % 10 + num / 10;
        }
        System.out.println("Sum of digits of " + num1 + " is " + num);

    }
}

// Q: what is armstrong number?
// A: 153 = 1^3 + 5^3 + 3^3 = 153
// 371 = 3^3 + 7^3 + 1^3 = 371
// 407 = 4^3 + 0^3 + 7^3 = 407
// 370 = 3^3 + 7^3 + 0^3 = 370


