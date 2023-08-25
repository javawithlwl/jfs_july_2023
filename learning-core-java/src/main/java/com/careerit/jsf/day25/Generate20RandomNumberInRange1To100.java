package com.careerit.jsf.day25;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Generate20RandomNumberInRange1To100 {

    public static void main(String[] args) {
        Set<Integer> randomSet = new HashSet<>();
        while(randomSet.size()!=20){
            int num = ThreadLocalRandom.current().nextInt(1,101);
            randomSet.add(num);
        }
        System.out.println(randomSet);
    }
}
