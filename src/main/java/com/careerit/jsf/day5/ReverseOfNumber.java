package com.careerit.jsf.day5;

public class ReverseOfNumber {

    public static void main(String[] args) {

            int num = 36563;
            int rev = 0;
            int num1 = num;
            while(num1 != 0){
                int r = num1 % 10;
                rev = rev * 10 + r;
                num1 /= 10;
            }
            System.out.println("Reverse of "+num+" is "+rev);
            if(num == rev){
                System.out.println("Given number is palindrome");
            }else{
                System.out.println("Given number is not palindrome");
            }

    }
}
