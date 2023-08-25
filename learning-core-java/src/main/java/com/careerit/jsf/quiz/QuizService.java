package com.careerit.jsf.quiz;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class QuizService {

    Map<TopicName, String> topicAndFileMap = Map.of(TopicName.JAVA, "/quiz/java_quiz.json",
            TopicName.GK, "/quiz/gk_quiz.json");

    @SneakyThrows
    public void startQuiz(String username, TopicName topicName) {
        Scanner sc = new Scanner(System.in);
        Map<Long, Integer> answerKeyMap = new HashMap<>();
        Map<Long, Integer> userAnswerMap = new HashMap<>();
        System.out.println("Hello " + username + ", Welcome to Quiz world");
        System.out.println("Your quiz is going to start in few seconds.....");
        TimeUnit.SECONDS.sleep(5);
        QuizTopic quizTopic = getQuizTopic(topicName);
        System.out.println("-".repeat(100));
        for (QuestionInfo questionInfo : quizTopic.getQuestions()) {
            System.out.println(questionInfo.getId() + "." + questionInfo.getQuestion());
            System.out.println();
            int c = 1;
            for (String opt : questionInfo.getOptions()) {
                System.out.println(c + ") " + opt);
                c++;
            }
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            answerKeyMap.put(questionInfo.getId(), questionInfo.getAnswer());
            userAnswerMap.put(questionInfo.getId(), ch);
        }
        validateAndShowResult(username, answerKeyMap, userAnswerMap);

    }
    @SneakyThrows
    private void validateAndShowResult(String username, Map<Long, Integer> answerKeyMap, Map<Long, Integer> userAnswerMap) {
        System.out.println("Hi "+username+", Please wait your result will be shown in few seconds...");
        TimeUnit.SECONDS.sleep(5);
        int correctAnswerCount = 0;
        Set<Map.Entry<Long, Integer>> entrySet = answerKeyMap.entrySet();
        for(Map.Entry<Long,Integer> entry:entrySet){
                if(Objects.equals(answerKeyMap.get(entry.getKey()), userAnswerMap.get(entry.getKey()))){
                    correctAnswerCount++;
                }
        }
        System.out.println("Total question: "+answerKeyMap.size());
        System.out.println("No of correct answers :"+correctAnswerCount);
        System.out.println("Thank you taking quiz with us");
    }

    @SneakyThrows
    private QuizTopic getQuizTopic(TopicName topicName) {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<QuizTopic> type = new TypeReference<QuizTopic>() {
        };
        QuizTopic quizTopic = objectMapper.readValue(QuizService.class.getResourceAsStream(topicAndFileMap.get(topicName)), type);
        System.out.println("Quiz name :" + topicName + " has " + quizTopic.getQuestions().size() + " questions");
        return quizTopic;
    }
}
