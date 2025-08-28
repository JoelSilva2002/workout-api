package br.com.meutreino.workout_api.repository;

import br.com.meutreino.workout_api.model.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Long> {
    Optional<WorkoutPlan> findByName(String name);
}
