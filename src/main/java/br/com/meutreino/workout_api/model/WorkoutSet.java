package br.com.meutreino.workout_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Integer repetitions;
    private Double weight;
    private Integer setIndex;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;
}