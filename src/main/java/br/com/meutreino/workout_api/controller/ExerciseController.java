package br.com.meutreino.workout_api.controller;

import br.com.meutreino.workout_api.model.Exercise;
import br.com.meutreino.workout_api.repository.ExerciseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
@CrossOrigin(origins = "*") // habilita chamadas do front
public class ExerciseController {

    private final ExerciseRepository repo;

    public ExerciseController(ExerciseRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Exercise> getAll() {
        return repo.findAll();
    }
}