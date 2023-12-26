package com.example.team10.answer.domain;


import com.example.team10.user.domain.User;
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

    @Column(nullable = false)
    private Long ans1;

    @Column(nullable = false)
    private Long ans2;

    @Column(nullable = false)
    private Long ans3;

    @Column(nullable = false)
    private Long ans4;

    @Column(nullable = false)
    private Long ans5;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String tester;
            ;



}
