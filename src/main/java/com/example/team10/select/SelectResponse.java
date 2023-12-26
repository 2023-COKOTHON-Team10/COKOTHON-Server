package com.example.team10.select;

import com.example.team10.answer.domain.AnswerListResponse;
import com.example.team10.quiz.dto.QuizResponse;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class SelectResponse {
    List<QuizResponse> quizResponses;
    List<AnswerListResponse> answerListResponses;

    public SelectResponse(List<QuizResponse> quizResponses, List<AnswerListResponse> answerListResponses){
        this.quizResponses = quizResponses;
        this.answerListResponses = answerListResponses;
    }
}
