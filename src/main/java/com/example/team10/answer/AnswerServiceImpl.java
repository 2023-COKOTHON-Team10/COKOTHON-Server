package com.example.team10.answer;

import com.example.team10.answer.domain.Answer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    @Transactional
    @Override
    public Long save(AnswerRequest request) {
        Answer answer = answerRepository.save(request.toEntity());

        return answer.getIdNumber();
    }

}
