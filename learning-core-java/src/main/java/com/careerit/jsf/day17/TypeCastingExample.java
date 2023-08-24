package com.careerit.jsf.day17;

import java.util.concurrent.ThreadLocalRandom;

class A {
    int a = 100;

    void m1() {
        System.out.println("M1 method from A");
    }
}

class B extends A {
    int a = 999;

    void m1() {
        System.out.println("M1 method from B");
    }

    void m2() {
        System.out.println("M2 method from B");
    }
}

class C extends A {
    int a = 999;

    void m1() {
        System.out.println("M1 method from C");
    }

    void m2() {
        System.out.println("M2 method from C");
    }
    void m3(){
        System.out.println("M3 method from C");
    }
}

public class TypeCastingExample {
    public static void main(String[] args) {
        A obj1 = getSubClassObject();
        obj1.m1();
        if(obj1 instanceof B){
            B obj2 = (B)obj1;
            obj2.m2();
        }else if(obj1 instanceof C){
            C obj2 = (C)obj1;
            obj2.m2();
            obj2.m3();
        }
    }

    public static A getSubClassObject() {

        if (ThreadLocalRandom.current().nextInt(1, 10) % 2 == 0) {
            return new B();
        } else {
            return new C();
        }
    }
}
