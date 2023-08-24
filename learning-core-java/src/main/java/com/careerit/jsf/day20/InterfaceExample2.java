package com.careerit.jsf.day20;

import java.util.ArrayList;
import java.util.List;

interface Math{
    boolean isPrime(int num);
    default int primeCount(int lb,int ub){
        return 0;
    }
    default List<Integer> generatePrime(int lb,int ub){
        return null;
    }
    // 1 + 1 / 2! + 1 / 3! .... 1 / n!
    default double sumOfSeries(int n){
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum += 1 / (double)factorial(i);
        }
        return sum;
    }
    default List<Integer> factorial(List<Integer> list){
        List<Integer> resList = new ArrayList<>();
        for(int ele:list){
            resList.add(factorial(ele));
        }
        return resList;
    }

    private int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }



}

class  MyMath implements  Math{

    @Override
    public boolean isPrime(int num) {
        return false;
    }
}
class NewMyMath implements Math{

    @Override
    public boolean isPrime(int num) {
        return false;
    }

}

public class InterfaceExample2 {
}
