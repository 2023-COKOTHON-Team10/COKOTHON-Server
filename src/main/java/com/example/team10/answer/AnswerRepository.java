package com.example.team10.answer;

import com.example.team10.answer.domain.Answer;
import com.example.team10.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findAllByUser(User user);
}
