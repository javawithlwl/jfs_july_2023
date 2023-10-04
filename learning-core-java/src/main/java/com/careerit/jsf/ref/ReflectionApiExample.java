package com.careerit.jsf.ref;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionApiExample {
    public static void main(String[] args) {

        try {
            Class cls = Class.forName("com.careerit.jsf.ref.MyMath");
            Method[] methods = cls.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println(cls.getSuperclass());
            System.out.println(Arrays.toString(cls.getInterfaces()));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
