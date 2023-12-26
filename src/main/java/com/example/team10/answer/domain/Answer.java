package com.example.team10.answer.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long ans1;

    private Long ans2;

    private Long ans3;

    private Long ans4;

    private Long ans5;

    // 고유번호
    @Column(nullable = false)
    private Long idNumber;


}
