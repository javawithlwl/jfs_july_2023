package com.careerit.jsf.day26;

public class ExceptionExample4 {

    public static void main(String[] args) {

        System.out.println("Start of main method");
        try{
            String name = "Krish";
            System.out.println(name.substring(0,6).toUpperCase());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Exception");
        }finally{
            System.out.println("Finally block");
        }
        System.out.println("End of main method");
    }
}
