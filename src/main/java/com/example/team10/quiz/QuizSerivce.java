package com.example.team10.quiz;

import com.example.team10.quiz.domain.Quiz;
import com.example.team10.quiz.dto.QuizCreateRequest;
import com.example.team10.quiz.dto.QuizResponse;
import com.example.team10.user.UserRepository;
import com.example.team10.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QuizSerivce {

    private final QuizRepository quizRepository;
    private final UserRepository userRepository;

    @Transactional
    public void saveQuiz(QuizCreateRequest request){
        Optional<User> user = userRepository.findById(request.getUser_id());
        Quiz quiz = Quiz.builder()
                .contents(request.getContents())
                .type(request.getType())
                .user(user.get())
                .choice1(request.getChoice1())
                .choice2(request.getChoice2())
                .choice3(request.getChoice3())
                .choice4(request.getChoice4())
                .choice1_bool(request.isChoice1_bool())
                .choice2_bool(request.isChoice2_bool())
                .choice3_bool(request.isChoice3_bool())
                .choice4_bool(request.isChoice4_bool())
                .build();

        quizRepository.save(quiz);
    }

    @Transactional
    public List<QuizResponse> getAllQuizSearchByUniqueNum(String uniqueNum){
        User user = userRepository.findByUniqueNumber(uniqueNum);
        return quizRepository.findAllByUser(user).stream()
                .map(QuizResponse::new).toList();
    }
}
