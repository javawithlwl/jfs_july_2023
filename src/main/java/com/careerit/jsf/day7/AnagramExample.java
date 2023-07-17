package com.careerit.jsf.day7;

import java.util.Arrays;

public class AnagramExample {

    public static void main(String[] args) {
        String str1 = "caaatb";
        String str2 = "tacaab";
        if (isAnagram(str1, str2)) {
            System.out.println("Given strings are anagram");
        } else {
            System.out.println("Given strings are not anagram");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    }
}
