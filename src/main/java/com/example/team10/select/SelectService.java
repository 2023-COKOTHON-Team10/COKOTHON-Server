package com.example.team10.select;

import com.example.team10.answer.AnswerRepository;
import com.example.team10.answer.domain.AnswerListResponse;
import com.example.team10.quiz.QuizRepository;
import com.example.team10.quiz.dto.QuizResponse;
import com.example.team10.user.UserRepository;
import com.example.team10.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SelectService {

    private final QuizRepository quizRepository;
    private final UserRepository userRepository;
    private final AnswerRepository answerRepository;

    @Transactional
    public SelectResponse selectAllDataByUser(SelectRequest request){
        User user = userRepository.findByUniqueNumberAndName(request.getUnique_number(), request.getName());
        return new SelectResponse(selectAllByUser1(user), selectAllByUser2(user));
    }

    @Transactional
    public List<QuizResponse> selectAllByUser1(User user){
        return quizRepository.findAllByUser(user).stream()
                .map(QuizResponse::new).toList();
    }

    @Transactional
    public List<AnswerListResponse> selectAllByUser2(User user){
        return answerRepository.findAllByUser(user).stream()
                .map(AnswerListResponse::new).toList();
    }
}
