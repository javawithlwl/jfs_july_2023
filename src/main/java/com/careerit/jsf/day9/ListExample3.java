package com.careerit.jsf.day9;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(5);
        list.add(15);
        list.add(25);
        int big = list.get(0);
        for(int i=1;i<list.size();i++) {
        	if(list.get(i) > big) {
        		big = list.get(i);
        	}
        }
        System.out.println("Biggest element :"+big);
    }
}
