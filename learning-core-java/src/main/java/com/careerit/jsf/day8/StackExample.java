package com.careerit.jsf.day8;


class ArrayCRUDExample {
    private int[] arr;
    private int count;

    public ArrayCRUDExample() {
        arr = new int[4];
    }

    public void add(int ele) {
        if (count == arr.length) {
            int[] temp = new int[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[count++] = ele;
    }
    public void delete(int index){
        if(index < 0 || index >= count){
            System.out.println("Given index "+index+" is invalid");
        }else{
            for(int i=index;i<count-1;i++){
                arr[i] = arr[i+1];
            }
            count--;
        }
    }
    public void set(int index,int value){
        if(index < 0 || index >= count){
            System.out.println("Given index "+index+" is invalid");
        }else{
            arr[index] = value;
        }
    }

    public int get(int index){
        if(index < 0 || index >= count){
            System.out.println("Given index "+index+" is invalid");
            return -1;  // we should throw exception
        }else{
            return arr[index];
        }
    }
    public int search(int ele){
        for(int i=0;i<count;i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }

    public void showElements() {
        if (count == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < count; i++) {
                if (i == count - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
            System.out.println("]");
        }
    }
}

public class StackExample {

    public static void main(String[] args) {

        ArrayCRUDExample ref = new ArrayCRUDExample();
        ref.add(10);
        ref.add(20);
        ref.add(30);
        ref.add(40);
        ref.add(50);
        ref.showElements();
        ref.delete(0);
        ref.showElements();
        ref.set(0, 100);
        ref.set(1, 200);
        ref.showElements();
    }
}
