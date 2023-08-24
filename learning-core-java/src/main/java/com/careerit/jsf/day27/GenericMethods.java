package com.careerit.jsf.day27;

public class GenericMethods {


    public static void main(String[] args) {

            Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
            Integer ele = 5;
            int count = greaterThanCount(arr, ele);
            System.out.println("The count of elements greater than "+ele+" is "+count);
    }

        public static <T extends Comparable<T>> int greaterThanCount(T[] arr, T ele){
                int count = 0;
                for(T obj : arr){
                    if(obj.compareTo(ele) > 0){
                        count++;
                    }
                }
                return count;
        }
}
