package com.careerit.jsf.day13;

public class StaticBlocks {

    static{
        System.out.println("This is static block 1");
    }
    static{
        System.out.println("This is static block 2");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static{
        System.out.println("This is static block 3");
    }
}
