package br.com.meutreino.workout_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class PlannedSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int setIndex;
    private String type; // Warmup,  feeders, reservas ou  maximas
    private String targetReps;
    private int restTimeSeconds;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "planned_exercise_id")
    @JsonIgnore
    @ToString.Exclude
    private PlannedExercise plannedExercise;
}