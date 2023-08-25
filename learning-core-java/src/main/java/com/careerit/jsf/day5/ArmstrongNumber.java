package com.careerit.jsf.day5;

public class ArmstrongNumber {

    public static void main(String[] args) {
            int num = 407;
            int num1 = num;
            int sum = 0;
            while(num1 != 0){
                int r = num1 % 10;
                sum = sum + r * r * r;
                num1 /= 10;
            }
            if(num == sum){
                System.out.println("Given number "+num+" is armstrong number");
            }else{
                System.out.println("Given number "+num+" is not armstrong number");
            }
    }
}
