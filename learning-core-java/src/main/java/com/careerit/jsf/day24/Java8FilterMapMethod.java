package com.careerit.jsf.day24;

import java.util.ArrayList;
import java.util.List;

public class Java8FilterMapMethod {


    private List<Integer> getEvenNumbers(List<Integer> list) {
//            List<Integer> evenList = new ArrayList<>();
//            for(int ele:list){
//                if(ele % 2 == 0){
//                    evenList.add(ele);
//                }
//            }
//            return evenList;
        return list.stream()
                .filter(ele -> ele % 2 == 0)
                .toList();
    }

    public List<Integer> getNamesLength(List<String> list) {
           /*List<Integer> namesLenList = new ArrayList<>();
           for(String name:list){
               namesLenList.add(name.length());
           }
           return namesLenList;*/
          return list.stream()
                  .map(String::length)
                  .toList();
    }

    public List<Integer> getPowerOfEvenNumbersOnly(List<Integer> list) {
//           List<Integer> evenPowerList = new ArrayList<>();
//           for(int ele:list){
//               if(ele % 2 == 0){
//                   evenPowerList.add(ele * ele);
//               }
//           }
//           return evenPowerList;

            return list.stream()
                    .filter(ele -> ele % 2 == 0)
                    .map(ele-> ele * ele)
                    .toList();
    }
}
