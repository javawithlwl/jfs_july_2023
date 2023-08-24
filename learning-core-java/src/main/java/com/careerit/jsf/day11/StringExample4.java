package com.careerit.jsf.day11;

public class StringExample4 {

    public static void main(String[] args) {
        String name = "learning";
        int n = 4;
        // lea ear arn rni nin ing
        for (int i = 0; i < name.length() - n + 1; i++) {
            System.out.println(name.substring(i, i + n));
        }

        String data = "Krish,Manoj,Ramesh,Suresh,Jayes,Allen,Akelesh";
        // Get the names which starts with A
        String[] names = data.split(",");
        for(String ele :names){
            if(ele.startsWith("A")){
                System.out.println(ele);
            }
        }
    }
}
