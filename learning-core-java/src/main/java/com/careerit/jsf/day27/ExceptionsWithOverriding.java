package com.careerit.jsf.day27;

import lombok.SneakyThrows;

class E1Exception extends Exception{}
class E2Exception extends E1Exception{}
class E3Exception extends E2Exception{}

class One{
    void m1()throws E2Exception{
        System.out.println("One m1");
    }
}
class  Two extends One{
    @Override
    void m1(){
        System.out.println("Two m1");
    }
}
public class ExceptionsWithOverriding {
    @SneakyThrows
    public static void main(String[] args) {

            One obj = new Two();
            obj.m1();
    }
}
