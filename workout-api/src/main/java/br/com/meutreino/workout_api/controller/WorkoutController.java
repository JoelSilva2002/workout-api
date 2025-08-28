package br.com.meutreino.workout_api.controller;

import br.com.meutreino.workout_api.repository.ExerciseRepository;
import br.com.meutreino.workout_api.dto.LogSetRequest;
import br.com.meutreino.workout_api.model.Exercise;
import br.com.meutreino.workout_api.model.WorkoutSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.meutreino.workout_api.repository.WorkoutSetRepository;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/workouts")
@CrossOrigin(origins = "*")
public class WorkoutController {

    @Autowired
    private WorkoutSetRepository workoutSetRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    // ENDPOINT ATUALIZADO para registrar uma série
    @PostMapping("/log")
    public ResponseEntity<WorkoutSet> logSet(@RequestBody LogSetRequest logRequest) {
        Exercise exercise = exerciseRepository.findById(logRequest.getExerciseId())
                .orElseThrow(() -> new RuntimeException("Exercício não encontrado!"));

        WorkoutSet workoutSet = new WorkoutSet();
        workoutSet.setExercise(exercise);
        workoutSet.setDate(LocalDate.now());
        workoutSet.setSetIndex(logRequest.getSetIndex());
        workoutSet.setWeight(logRequest.getWeight());
        workoutSet.setRepetitions(logRequest.getRepetitions());

        WorkoutSet savedSet = workoutSetRepository.save(workoutSet);
        return ResponseEntity.ok(savedSet);
    }

    //  buscar a performance da "Última Vez"
    @GetMapping("/exercise/{exerciseId}/last-performance")
    public ResponseEntity<WorkoutSet> getLastPerformance(
            @PathVariable Long exerciseId,
            @RequestParam Integer setIndex) {

        return workoutSetRepository.findTopByExerciseIdAndSetIndexOrderByDateDesc(exerciseId, setIndex)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build()); // Retorna 404 se nunca foi feito
    }
}
