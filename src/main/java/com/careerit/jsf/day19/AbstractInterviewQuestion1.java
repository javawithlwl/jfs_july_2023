package com.careerit.jsf.day19;

abstract class One{
    One() {
        super();
        System.out.println("One");
    }
}
abstract class Two extends One{
    Two() {
        super();
        System.out.println("Two");
    }
}
class Three extends Two{
    Three() {
        super();
        System.out.println("Three");
    }
}
public class AbstractInterviewQuestion1 {
    public static void main(String[] args) {
        One obj = new Three();
    }
}
