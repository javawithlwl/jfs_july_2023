package com.careerit.jsf.day25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample4 {

    public static void main(String[] args) {

        List<String> cs = List.of("PKM","ALN","GLN","KVR","MVR");
        List<String> is = List.of("PKM","NVM","KVM","KVR","MVR");
        List<String> ec = List.of("PKM","GVR","KLV","KVR","MVR");

        // Get unique faculty names

        Set<String> facultyNames = new HashSet<>();
        facultyNames.addAll(cs);
        facultyNames.addAll(is);
        facultyNames.addAll(ec);

        System.out.println(facultyNames);

        // Get the faculty list who are working for 3 departments
        List<String> workingFor3DeptList = new ArrayList<>();

        for(String name:facultyNames){
            if(cs.contains(name) && is.contains(name) && ec.contains(name)){
                workingFor3DeptList.add(name);
            }
        }
        System.out.println("Faculties working for 3 departments :"+workingFor3DeptList);
    }
}
