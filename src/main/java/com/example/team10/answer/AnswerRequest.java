package com.example.team10.answer;

import com.example.team10.answer.domain.Answer;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AnswerRequest {

    private Long id;
    private Long userId;
    private Long ans1;
    private Long ans2;
    private Long ans3;
    private Long ans4;
    private Long ans5;
    private Long idNumber;

    public Answer toEntity() {
        return Answer.builder()
                .id(id)
                .userId(userId)
                .ans1(ans1)
                .ans2(ans2)
                .ans3(ans3)
                .ans4(ans4)
                .ans5(ans5)
                .idNumber(idNumber)
                .build();
    }

}
