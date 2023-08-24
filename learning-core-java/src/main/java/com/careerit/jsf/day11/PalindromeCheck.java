package com.careerit.jsf.day11;

public class PalindromeCheck {

    public static void main(String[] args) {

            String str = "madams";
            String rev = new StringBuilder(str).reverse().toString();
            if(str.equals(rev)) {
                System.out.println("Given string is palindrome");
            }else {
                System.out.println("Given string is not palindrome");
            }
    }
}
