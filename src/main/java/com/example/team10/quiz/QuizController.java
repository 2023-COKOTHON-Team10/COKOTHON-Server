package com.example.team10.quiz;

import com.example.team10.quiz.dto.QuizCreateRequest;
import com.example.team10.quiz.dto.QuizResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
public class QuizController {

    private final QuizSerivce quizSerivce;

    @PostMapping("/api/quiz")
    public void saveQuiz(@RequestBody QuizCreateRequest request){
        quizSerivce.saveQuiz(request);
    }

    @GetMapping("/api/quizs")
    public List<QuizResponse> getAllQuizsByUniqueNum(@RequestParam String uniqueNum){
        return quizSerivce.getAllQuizSearchByUniqueNum(uniqueNum);
    }
}
