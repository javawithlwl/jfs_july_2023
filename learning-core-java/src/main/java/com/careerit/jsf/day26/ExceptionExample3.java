package com.careerit.jsf.day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class ExceptionExample3 {

    public static void main(String[] args) {

     try(BufferedReader br = new BufferedReader(new FileReader(
                new File(Objects.requireNonNull(ExceptionExample3.class.getResource("/hello.txt")).getFile())));) {
            String str = null;
            while ((str = br.readLine()) != null) {
                String name = str;
                System.out.println(name.substring(0,3).toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
