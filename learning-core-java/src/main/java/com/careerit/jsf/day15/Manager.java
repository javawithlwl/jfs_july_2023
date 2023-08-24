package com.careerit.jsf.day15;

class C1 {

    void show() {
        System.out.println("C1");
    }
}

class C2 extends C1 {
    void display() {
        System.out.println("C2");
        show();
    }
}

public class Manager {
}
