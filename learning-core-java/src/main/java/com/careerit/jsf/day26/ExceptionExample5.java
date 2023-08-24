package com.careerit.jsf.day26;

import java.io.IOException;

public class ExceptionExample5 {

    public static void main(String[] args) {

        System.out.println("Start of main method");

        try(MyResource myResource = new MyResource()){
             System.out.println("Resource is opened for read");
        }catch (Exception e) {
            System.out.println("Exception while opening the resource");
        }
    }
}
