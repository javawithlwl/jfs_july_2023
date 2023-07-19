package com.careerit.jsf.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateQuestions {

    public static void main(String[] args) {

            // 500 questions 1-500 => 50 random unique questions

        List<Integer> list = new ArrayList<>();
        while(list.size()!=50){
            int num = ThreadLocalRandom.current().nextInt(1,501);
            if(!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);

    }

}
