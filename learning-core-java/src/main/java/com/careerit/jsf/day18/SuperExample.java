package com.careerit.jsf.day18;
class C1 {
    int a = 11;
    C1() {
        System.out.println("C1");
    }
}
class One extends C1 {
    int a = 10;
    One(int a) {
        System.out.println("One");
    }
}

class Two extends One {
    int a = 20;
    Two() {
        super(10);
        System.out.println("Two");
    }
    void show() {
        System.out.println(a);
        System.out.println(super.a);

    }
}

public class SuperExample {

    public static void main(String[] args) {
        Two obj = new Two();
    }
}
