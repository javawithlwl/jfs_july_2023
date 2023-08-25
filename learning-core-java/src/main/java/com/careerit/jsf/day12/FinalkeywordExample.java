package com.careerit.jsf.day12;

import java.util.Arrays;

final class C1{
    public  void m1(){
        System.out.println("M1 method");
    }
}
class C2 {
    public void m1(){
        System.out.println("This is m1 method from C2 class and overriden from C1 class");
    }
}
public class FinalkeywordExample {
    public  static  void main(final String[] args) {
        final int NO_OF_DAYS_IN_WEEK = 7;
        System.out.println(args.length + " " + Arrays.toString(args));
        args[2] = "Kiran";
        System.out.println(args.length + " " + Arrays.toString(args));

    }
}



