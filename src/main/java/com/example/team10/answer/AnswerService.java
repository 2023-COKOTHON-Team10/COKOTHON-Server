package com.example.team10.answer;

import com.example.team10.answer.domain.AnswerListResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnswerService {

    public void save(AnswerRequest request);
    public List<AnswerListResponse> findAllAnswer();
}
