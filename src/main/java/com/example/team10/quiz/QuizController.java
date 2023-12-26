package com.example.team10.quiz;

import com.example.team10.quiz.dto.QuizCreateRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class QuizController {

    private final QuizSerivce quizSerivce;

    @PostMapping("/api/quiz")
    public void saveQuiz(@RequestBody QuizCreateRequest request){
        quizSerivce.saveQuiz(request);
    }
}
