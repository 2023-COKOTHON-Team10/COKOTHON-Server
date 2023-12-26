package com.example.team10.quiz;

import com.example.team10.quiz.domain.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.team10.user.domain.User;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findAllByUser(User user);
}
