package com.example.team10.answer;

import com.example.team10.answer.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    List<Answer> findByAns1();
    List<Answer> findByAns2();
    List<Answer> findByAns3();
    List<Answer> findByAns4();
    List<Answer> findByAns5();
}
