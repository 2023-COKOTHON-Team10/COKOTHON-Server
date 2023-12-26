package com.example.team10.quiz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizCreateRequest {
    private String contents;
    private Long user_id;
    private String type;
    private String choice1;
    private boolean choice1_bool;
    private String choice2;
    private boolean choice2_bool;
    private String choice3;
    private boolean choice3_bool;
    private String choice4;
    private boolean choice4_bool;
}
