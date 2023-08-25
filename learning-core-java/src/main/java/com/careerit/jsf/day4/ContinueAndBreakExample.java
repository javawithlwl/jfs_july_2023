package com.careerit.jsf.day4;

public class ContinueAndBreakExample {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 4, 5, 6, 7};
        int key = 5;
        boolean flag = false;
        for(int ele:arr){
            if(ele == key){
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

        // print all array elements except 5 or greater than 7

        for(int ele:arr){
            if(ele == 5 || ele > 7){
                continue;
            }
            System.out.print(ele+" ");
        }


    }
}
