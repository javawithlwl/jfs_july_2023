package com.careerit.jsf.day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class InterviewQuestion {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(List.of("Rajesh","John","Manoj","Ramesh","Jayesh","RK"));

        // 1. if name RK replace with Rama Krishna
        // 2. If name starts with J remove the name
        // 3. If name is Ramesh add Latha next to Ramesh

        ListIterator<String> ltr = namesList.listIterator();
        while(ltr.hasNext()){
            String name = ltr.next();
            if(name.startsWith("J")){
                ltr.remove();
            }
            if(name.equals("RK")){
                ltr.set("Rama Krishna");
            }
            if(name.equals("Ramesh")){
                ltr.add("Latha");
            }
        }

        System.out.println(namesList);
    }
}
