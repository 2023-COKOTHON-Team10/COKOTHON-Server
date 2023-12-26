package com.example.team10.quiz.domain;

import com.example.team10.user.domain.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "quiz_contents", nullable = false)
    private String contents;

    @Column(name = "quiz_type", nullable = false)
    private String type;

    @Column(name = "quiz_choice1", nullable = false)
    private String choice1;

    @Column(name = "quiz_choice1_bool")
    @ColumnDefault("false")
    private boolean choice1_bool;

    @Column(name = "quiz_choice2", nullable = false)
    private String choice2;

    @Column(name = "quiz_choice2_bool")
    @ColumnDefault("false")
    private boolean choice2_bool;

    @Column(name = "quiz_choice3", nullable = false)
    private String choice3;

    @Column(name = "quiz_choice3_bool")
    @ColumnDefault("false")
    private boolean choice3_bool;

    @Column(name = "quiz_choice4", nullable = false)
    private String choice4;

    @Column(name = "quiz_choice4_bool")
    @ColumnDefault("false")
    private boolean choice4_bool;
}
