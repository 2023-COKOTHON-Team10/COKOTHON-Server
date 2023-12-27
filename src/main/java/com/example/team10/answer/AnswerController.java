package com.example.team10.answer;

import com.example.team10.answer.dto.AnswerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

    @PostMapping("/api/answer")
    public void save(@RequestBody AnswerRequest request) {
        answerService.save(request);
    }

}
