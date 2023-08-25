package com.careerit.jsf.day23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Java8CollectionExample {

    public static void main(String[] args) {

        List<Integer> numList = IntStream.rangeClosed(1, 100).boxed().toList();
        List<Integer> evenList = getEvenNumbers(numList);
        System.out.println(evenList);
        List<Integer> evenGt50AndLt80 = getEvenAndGt50AndLt80(numList);
        System.out.println(evenGt50AndLt80);

    }

    private static List<Integer> getEvenNumbers(List<Integer> list) {
/*            List<Integer> evenList = new ArrayList<>();
            for(Integer ele:list){
                if(isEven(ele)){
                    evenList.add(ele);
                }
            }
            return evenList;*/
        return list.stream().filter(ele -> isEven(ele)).toList();
    }

    private static List<Integer> getEvenAndGt50AndLt80(List<Integer> list) {
       /* List<Integer> evenList = new ArrayList<>();
        for(Integer ele:list){
            if(isEven(ele) && ele > 50 && ele < 80){
                evenList.add(ele);
            }
        }
        return evenList;*/
        return list
                .stream()
                .filter(ele -> isEven(ele) && ele > 50 && ele < 80)
                .toList();
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
