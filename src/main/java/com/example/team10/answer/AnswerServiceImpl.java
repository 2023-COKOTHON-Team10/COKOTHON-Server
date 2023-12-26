package com.example.team10.answer;

import com.example.team10.answer.domain.Answer;
import com.example.team10.answer.domain.AnswerListResponse;
import com.example.team10.answer.dto.AnswerRequest;
import com.example.team10.user.UserRepository;
import com.example.team10.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;
    private final UserRepository userRepository;

    @Transactional
    @Override
    public void save(AnswerRequest request) {

        Optional<User> user = userRepository.findById(request.getUser_id());

        Answer answer = Answer.builder()
                .id(request.getId())
                .user(user.get())
                .tester(request.getTester())
                .ans1(request.getAns1())
                .ans2(request.getAns2())
                .ans3(request.getAns3())
                .ans4(request.getAns4())
                .ans5(request.getAns5())
                .build();

        answerRepository.save(answer);
    }

    @Override
    public List<AnswerListResponse> findAllAnswer() {

        List<AnswerListResponse> responses = new ArrayList<>();
        return responses;
    }

}
