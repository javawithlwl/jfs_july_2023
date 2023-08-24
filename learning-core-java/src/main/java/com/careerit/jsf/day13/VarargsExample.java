package com.careerit.jsf.day13;

class Sample{

    public static String joiner(String delimeter,String... arr){
        if(arr.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String ele:arr){
            sb.append(ele).append(delimeter);
        }
        return sb.substring(0, sb.length()-1);
    }
}
public class VarargsExample {

    public static void main(String[] args) {
      //  "-","a", "b", "c", "d" => a-b-c-d

        System.out.println(Sample.joiner("-", "a", "b", "c", "d"));
        System.out.println(Sample.joiner(",", "a", "b", "c", "d","e","f","g","h","i","j","k","l","m","n"));
    }
}
