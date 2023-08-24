package com.careerit.jsf.day20;

import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

class NumberOperations implements Serializable,Cloneable{
    public int result(BinaryOperator<Integer> obj, int a, int b) {
        return obj.apply(a, b);
    }
}

// Functional interface and lambda expression
public class InterfaceObjectCreation {

    public static void main(String[] args) {
        NumberOperations obj = new NumberOperations();
        int res = obj.result((a, b) -> a + b, 30, 20);
        System.out.println(res);

        Predicate<Integer> predictate = (num) -> num > 0;
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 * num2;

        BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) ->{
            System.out.println("BiFunction");
            return num1 + num2;
        };
    }

}
