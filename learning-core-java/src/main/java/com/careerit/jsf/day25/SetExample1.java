package com.careerit.jsf.day25;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1001);
        set.add(1002);
        set.add(1002);
        set.add(1001);
        set.add(1004);
        set.add(1003);
        System.out.println(set);
    }
}
