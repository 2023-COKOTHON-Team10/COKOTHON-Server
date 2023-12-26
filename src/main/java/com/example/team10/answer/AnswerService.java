package com.example.team10.answer;

import org.springframework.stereotype.Service;

@Service
public interface AnswerService {

    public Long save(AnswerRequest request);
}
