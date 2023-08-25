package com.careerit.jsf.quiz;

import java.util.Scanner;

public class QuizManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String username = sc.nextLine();
        System.out.println("1.Java 2.GK 3.Exit");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();
        QuizService quizService = new QuizService();
        switch (ch) {
            case 1 -> quizService.startQuiz(username, TopicName.JAVA);
            case 2 -> quizService.startQuiz(username, TopicName.GK);
            case 3 -> System.exit(0);
            default -> System.out.println("Enter valid quiz type");
        }
    }
}
