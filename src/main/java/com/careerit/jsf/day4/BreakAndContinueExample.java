package com.careerit.jsf.day4;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
