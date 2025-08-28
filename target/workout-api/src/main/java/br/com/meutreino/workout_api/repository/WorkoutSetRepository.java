package br.com.meutreino.workout_api.repository;

import br.com.meutreino.workout_api.model.WorkoutSet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkoutSetRepository extends JpaRepository<WorkoutSet, Long> {

    Optional<WorkoutSet> findTopByExerciseIdAndSetIndexOrderByDateDesc(Long exerciseId, Integer setIndex);
    // Busca o TOP 1 (mais recente) WorkoutSet para um dado exerciseId e setIndex,
    // ordenando pela data em ordem decrescente.
}
