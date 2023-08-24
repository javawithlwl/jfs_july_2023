package com.careerit.jsf.day8;

public class ArrayExample {

    public static void main(String[] args) {
        int[] arr = new int[]{70, 20, 30, 40, 95, 90, 50, 60};
        int big = biggest(arr);
        System.out.println("Biggest element in the array is :" + big);
    }

    // [1,2,3,4,5,6] n = 3 => [4,5,6,1,2,3]
    // [1,2,3,4,5,6] n = 5 => [6,1,2,3,4,5]
    public static int[] shift(int[] arr,int n){
            return null;
    }

    // lb = 10 and ub = 20 => [11,13,17,19]
    // lb = 1 and ub = 50 => [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47]
    public static int[] generatePrimes(int lb,int ub){
        return null;
    }

    // [1,2,3,4,5,6,7,8,9,10] => [2,3,5,7]
    public static int[] getPrimeNumbers(int[] arr){
        return null;
    }

    // [1,2,3,4,5,6,7,10] , [2,3,4,8,9] => [1,2,3,4,5,6,7,8,9,10]
    public static int[] getUniqueValues(int[] arr1,int arr2){
        return null;
    }

    public static int sum(int[] arr) {
        int res = 0;
        for (int ele : arr) {
            res += ele;
        }
        return res;
    }
    public static float average(int[] arr){
        return sum(arr)/(float)arr.length;
    }

    public static int biggest(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        return big;
    }

    public static int smallest(int[] arr) {
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;
    }

    // [1,2,3,4,5,6,7,8,9,10]  [2,3,4] [3,5,11]
    public static boolean isSubSet(int[] arr1, int[] arr2) {
        for (int ele : arr2) {
            if (!isPresent(arr1, ele)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllKeysPresent(int[] arr, int key1, int key2, int key3) {
        return isPresent(arr, key1) && isPresent(arr, key2) && isPresent(arr, key3);
    }

    private static boolean isPresent(int[] arr, int key) {
        for (int ele : arr) {
            if (ele == key) {
                return true;
            }
        }
        return false;
    }
}
