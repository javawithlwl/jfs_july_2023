package com.careerit.jsf.day20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

interface I1 {
    boolean isPrime(int num);
    default List<Integer> generatePrimes(int lb, int ub){
        List<Integer> list = new ArrayList<>();
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    default  long countEvens(List<Integer> list){
        long count = 0;
        for(int ele:list){
            if(isEven(ele)){
                count++;
            }
        }
        return count;
    }

    private boolean isEven(int num){
        return num % 2 == 0;
    }
    public static LocalDate getSystemDate(){
        return LocalDate.now();
    }
    private static boolean isOdd(int num){
        return num % 2 != 0;
    }
    private boolean isDivisibleBy3(int num){
        return num % 3 == 0;
    }

}

class One implements I1 {
    @Override
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


public class InterfaceExample {

    public static void main(String[] args) {
        I1 obj = new One();
        List<Integer> list = obj.generatePrimes(1, 100);
        System.out.println(list);
    }
}
