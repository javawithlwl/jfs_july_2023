package com.careerit.jsf.day5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int generatedNumber = ThreadLocalRandom.current().nextInt(1, 7);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the number between 1 to 6 :");
            int guessedNumber = sc.nextInt();
            if (guessedNumber < generatedNumber) {
                System.out.println("Guessed number is less than generated number");
            } else if (guessedNumber > generatedNumber) {
                System.out.println("Guessed number is greater than generated number");
            } else {
                System.out.println("You guessed the number in attempt :" + i);
                break;
            }
            if (i == 3) {
                System.out.println("You reached max attempts, you lost the game. Generated number is :" + generatedNumber);
            }
        }
    }
}

