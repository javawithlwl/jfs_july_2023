package com.careerit.jsf.day12;

import java.util.Arrays;
import java.util.List;

public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(isAnagram(str1, str2));

    }

    //abccba => baccab => cbaabc
    private static List<String> possiblePalindromes(String str) {
        return null;
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
