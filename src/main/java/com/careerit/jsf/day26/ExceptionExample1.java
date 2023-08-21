package com.careerit.jsf.day26;

public class ExceptionExample1 {

    public static void main(String[] args) {

        System.out.println("Start of main method");
        int a = 10, b = 0;
        String operator = "div";
        try {
            int res = calculate(a, b, operator);
            System.out.println("Result : " + res);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
            e.printStackTrace();
        }
        System.out.println("End of main method");
    }

    private static int calculate(int a, int b, String operator) {
        return
                switch (operator) {
                    case "add" -> a + b;
                    case "sub" -> a - b;
                    case "mul" -> a * b;
                    case "div" -> a / b;
                    case "mod" -> a % b;
                    default -> throw new IllegalArgumentException("Invalid operator");
                };
    }

}
