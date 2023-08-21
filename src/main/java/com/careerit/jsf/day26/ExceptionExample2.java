package com.careerit.jsf.day26;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ExceptionExample2 {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Object object = objectMapper.readValue(ExceptionExample2.class.getResourceAsStream("/currncy.json"), Object.class);
            System.out.println(object);
        }catch (IOException | IllegalArgumentException e) {
            System.out.println("Can't read the file");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
        System.out.println("End of main method");
    }
}
