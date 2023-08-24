package com.careerit.jsf.day6;

public class MethodExample {


    public static boolean isPrime(int num){
        if(num < 2 || (num % 2 == 0 && num != 2)){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int reverse(int num){
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int num){
         return num == reverse(num);
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
