package com.careerit.jsf.day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Krish", "Manoj", "Charan", "Rajesh", "Ramesh"));
        list.add("RK");

        // Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.equals("Charan")){
                iterator.remove();
            }
            System.out.println(name);
        }
        System.out.println(list);
        // ListIterator

        ListIterator<String> ltr = list.listIterator();
        while(ltr.hasNext()){
            String name = ltr.next();
            if(name.startsWith("R")){
                ltr.remove();
            }
        }
        while(ltr.hasPrevious()){
            String name = ltr.previous();
            System.out.println(name);
        }

    }
}
