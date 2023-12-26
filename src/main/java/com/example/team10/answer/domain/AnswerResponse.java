package com.example.team10.answer.domain;

import com.example.team10.user.domain.User;
import lombok.Getter;

@Getter
public class AnswerResponse {

    private Long id;
    private Long user_id;
    private Long ans1;
    private Long ans2;
    private Long ans3;
    private Long ans4;
    private Long ans5;

//    public AnswerResponse(Answer answer) {
//        this.id = answer.getId();
//        this.user_id = answer.getUser_id();
//        this.ans1 = answer.getAns1();
//        this.ans2 = answer.getAns2();
//        this.ans3 = answer.getAns3();
//        this.ans4 = answer.getAns4();
//        this.ans5 = answer.getAns5();
//    }
}
