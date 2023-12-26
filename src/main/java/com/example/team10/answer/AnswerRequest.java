package com.example.team10.answer;

import com.example.team10.answer.domain.Answer;
import com.example.team10.user.domain.User;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AnswerRequest {

    private Long id;
    private Long user_id;
    private String tester;
    private Long ans1;
    private Long ans2;
    private Long ans3;
    private Long ans4;
    private Long ans5;


}
