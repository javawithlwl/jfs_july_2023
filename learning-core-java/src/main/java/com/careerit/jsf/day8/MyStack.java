package com.careerit.jsf.day8;

public class MyStack {

    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[4];
        top = -1;
    }

    public void push(int ele) {
        if (top == arr.length - 1) {
            int[] temp = new int[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[++top] = ele;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i < arr.length-1; i++) {
                    arr[i] = arr[i + 1];
            }
            top--;
        }
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }

    public void showElements() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("[");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {

        MyStack obj = new MyStack();
        System.out.println(obj.isEmpty());
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.showElements();
        obj.pop();
        obj.showElements();
        obj.pop();
        obj.showElements();
        System.out.println(obj.peek());
        System.out.println(obj.isEmpty());
    }
}
