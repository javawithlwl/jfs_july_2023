package com.careerit.jsf.day3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int generatedNumber = ThreadLocalRandom.current().nextInt(1,7);
        System.out.println("Guess the number between 1 to 6");
        int guessedNumber = scanner.nextInt();
        if(generatedNumber == guessedNumber){
            System.out.println("You won the game");
        }else{
            System.out.println("You lost the game, the number is "+generatedNumber);
        }
    }
}
