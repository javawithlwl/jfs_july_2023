package com.careerit.jsf.day9;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {2, 3, 4},
                {4, 5, 6}
        };
        System.out.println(Arrays.toString(colSum(arr)));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int diagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    private static int biggest(int[][] arr) {
        int big = arr[0][0];
        for (int[] subArr : arr) {
            for (int ele : subArr) {
                if (ele > big) {
                    big = ele;
                }
            }
        }
        return big;
    }

    private static int[] colSum(int[][] arr) {
        int[] res = new int[arr[0].length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            res[count++] = sum;
        }
        return res;
    }
    private static int[] rowSum(int[][] arr){
        int[] res = new int[arr[0].length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            res[count++] = sum;
        }
        return res;
    }
}
