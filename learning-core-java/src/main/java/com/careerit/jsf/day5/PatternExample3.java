package com.careerit.jsf.day5;

/*
9 18 27
36 45 54
63 72 81
 */
public class PatternExample3 {

    public static void main(String[] args) {
        int num = 9;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(num + " ");
                num += 9;
            }
            System.out.println();
        }
    }
}
