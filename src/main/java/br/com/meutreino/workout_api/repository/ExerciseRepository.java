package br.com.meutreino.workout_api.repository;

import br.com.meutreino.workout_api.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> { }