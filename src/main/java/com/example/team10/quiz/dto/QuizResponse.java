package com.example.team10.quiz.dto;

import com.example.team10.quiz.domain.Quiz;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizResponse {
    private String contents;
    private String type;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private Long user_id;

    public QuizResponse(Quiz quiz){
        this.contents = quiz.getContents();
        this.type = quiz.getType();
        this.choice1 = quiz.getChoice1();
        this.choice2 = quiz.getChoice2();
        this.choice3 = quiz.getChoice3();
        this.choice4 = quiz.getChoice4();
        this.user_id = quiz.getUser().getId();
    }
}
