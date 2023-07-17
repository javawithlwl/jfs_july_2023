package com.careerit.jsf.day7;

public class ArrayExample1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Length of array :" + arr.length);
        System.out.println("Elements of array :" + arr[0]);
        System.out.println("Elements of array :" + arr[arr.length - 1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Print array elements in reverse order
        System.out.println("Reverse order");

        for (int i = arr.length - 1; i >=0; i--) {
            System.out.println(arr[i]);
        }

        for(int ele: arr){
            System.out.println(ele);
        }

    }
}
