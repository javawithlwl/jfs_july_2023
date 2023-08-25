package com.careerit.jsf.day25;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Krish",23);
        map.put("Manoj",25);
        map.put("RK",28);
        map.put("RK",30);

        System.out.println(map.size());
        System.out.println(map.get("RK"));
        System.out.println(map.get("John"));

        map.putIfAbsent("John",35);
        System.out.println(map.get("John"));
        System.out.println(map.getOrDefault("Krish",30));

    }
}
