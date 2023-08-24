package com.careerit.jsf.day11;

import java.util.Scanner;

public class StringExample5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if(rev.equals(str)) {
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is not palindrome");
        }

    }
}
