package com.careerit.jsf.day21;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample1 {

    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("Krish");
        list.add("Manoj");
        list.add("Charan");
        list.add("Krish");
        list.add("Manoj");
        list.add("Charan");
        list.add("RK");
        List<String> uniqueNameList = new ArrayList<>();
        for(String name: list){
            if(!uniqueNameList.contains(name)){
                uniqueNameList.add(name);
            }
        }
        System.out.println(uniqueNameList);
    }
}
