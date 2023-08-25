package com.careerit.jsf.day25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {
        String data = "22-Krish,22-Manoj,22-Charan,23-RK,23-Tanvi,23-Aadhya,25-Rajesh,25-Mrudula";

        Map<Integer, List<String>> ageGroupMap = new HashMap<>();

        String[] arr = data.split(",");
        for(String ele:arr){
            String[] dataArr = ele.split("-");
            int age = Integer.parseInt(dataArr[0]);
            String name = dataArr[1];
            ageGroupMap.putIfAbsent(age,new ArrayList<>());
            List<String> existingNames = ageGroupMap.get(age);
            existingNames.add(name);
            ageGroupMap.put(age,existingNames);

        }
        System.out.println(ageGroupMap);
    }
}
