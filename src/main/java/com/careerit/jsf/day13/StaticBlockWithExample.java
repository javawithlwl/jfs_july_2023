package com.careerit.jsf.day13;

class Account{
    public static final String BANK_NAME = "SBI";
    static{
        System.out.println("This is static block of Account class");
    }
    public static void showInfo(){
        System.out.println("This is showInfo method");
    }
}
public class StaticBlockWithExample {
    static{
        System.out.println("This is static block of StaticBlockWithExample class");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        Account.showInfo();

    }
}
