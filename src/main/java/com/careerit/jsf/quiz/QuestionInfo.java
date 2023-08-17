package com.careerit.jsf.quiz;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionInfo {

    private long id;
    private String question;
    private List<String> options;
    private int answer;

}
