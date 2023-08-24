package com.careerit.jsf.day13;
import static java.lang.Math.*;
import static java.lang.System.out;
import static com.careerit.jsf.day13.NumberExample.*;
public class StaticExample {

    public float sum(float a, float b){
        return a + b;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public float sum(int a, float b){
        return a+b;
    }
    public float sum(float a, int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a + b + c;
    }
    public int sum(int a,int b, int c,int d){
        return a + b + c + d;
    }
    public int sum(int... args){
        int res = 0;
        for(int ele:args){
            res += ele;
        }
        return res;
    }
    public int sum(float a, int b,int... args){

        return 0;
    }


    // Writing two or methods with same name and different parameter list, we call it as overloading

        // no of parameters
        // Order of parameters
        // Type of the parameters
    // Return, access specifier, exception doesn't matter


    public final static void main(final String... args) {

        int num1 = 10, num2 = 30, num3 = 20;
        int max = max(num1, num2, num3);
        out.println("Max of "+num1+" "+num2+" "+num3+" is "+max);
        out.println(sqrt(9));
        out.println(pow(2,3));
        out.println((int)(random()*10+1));
        StaticExample obj = new StaticExample();
        out.println(obj.sum(1,2));
        out.println(obj.sum(1));
        out.print(obj.sum(1,2,3,4,5,6,7,8,9,10));

    }



    // usage static in java
    // 1. static variable
    // 2. static method
    // 3. static block
    // 4. static inner class
    // 5. static import

    // private > default > protected > public

    // java StaticExample "1001" "Krish" "5.6" "89000" => StaticExample.main(new String[]{"1001", "Krish", "5.6", "89000" });
}
