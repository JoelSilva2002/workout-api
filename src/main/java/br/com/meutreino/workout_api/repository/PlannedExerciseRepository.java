package br.com.meutreino.workout_api.repository;

import br.com.meutreino.workout_api.model.PlannedExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannedExerciseRepository extends JpaRepository<PlannedExercise, Long> { }