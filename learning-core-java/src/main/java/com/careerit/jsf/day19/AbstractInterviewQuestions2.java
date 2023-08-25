package com.careerit.jsf.day19;

import java.util.ArrayList;
import java.util.List;

abstract class MyMath {
    int a = 10;
    public List<Integer> getPrimeInRange(int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public abstract boolean isPrime(int num);
}

class MyMathImpl extends MyMath {
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

public class AbstractInterviewQuestions2 {

    public static void main(String[] args) {

        MyMath obj = new MyMathImpl();
        List<Integer> list = obj.getPrimeInRange(1, 100);
        System.out.println(list);
    }
}
