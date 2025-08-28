package br.com.meutreino.workout_api.controller;

import br.com.meutreino.workout_api.model.WorkoutPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.meutreino.workout_api.repository.WorkoutPlanRepository;

import java.util.List;

@RestController
@RequestMapping("/api/workout-plans")
@CrossOrigin(origins = "*")
public class WorkoutPlanController {


    @Autowired
    private WorkoutPlanRepository workoutPlanRepository;

    @GetMapping
    public ResponseEntity<List<WorkoutPlan>> getAllPlans() {
        List<WorkoutPlan> plans = workoutPlanRepository.findAll();
        return ResponseEntity.ok(plans);
    }

    @GetMapping("/{name}")
    public ResponseEntity<WorkoutPlan> getPlanByName(@PathVariable String name) {
        return workoutPlanRepository.findByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
