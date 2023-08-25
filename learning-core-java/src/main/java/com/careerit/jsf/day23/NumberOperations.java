package com.careerit.jsf.day23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberOperations {

    public static void main(String[] args) {

        Predicate<Integer> predicate = (num) -> num % 3 == 0;

        List<Integer> list = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        /*List<Integer> divisbleBy3List = new ArrayList<>();
        for(int ele:list){
                if(ele % 3 == 0){
                    divisbleBy3List.add(ele);
                }
        }*/
        List<Integer> divisbleBy3List = list
                .stream()
                .filter(num -> num % 3 == 0)
                .toList();
        System.out.println(divisbleBy3List);

    }
}
