package com.careerit.jsf.ref;

import java.io.Serializable;

public class MyMath implements Serializable,Cloneable {

        public int add(int a,int b){
            return a+b;
        }
        public int sub(int a,int b){
            return a-b;
        }
        public int pow(int a,int b){
            return (int)Math.pow(a, b);
        }
        private int biggest(int a,int b){
            return a > b ? a : b;
        }
        int biggest(int... arg){
            int max = arg[0];
            for(int ele:arg){
                if(ele > max){
                    max = ele;
                }
            }
            return max;
        }

}
