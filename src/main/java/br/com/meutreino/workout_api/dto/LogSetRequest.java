package br.com.meutreino.workout_api.dto;

import lombok.Data;

@Data
public class LogSetRequest {
    private Long exerciseId;
    private Integer setIndex;
    private Double weight;
    private Integer repetitions;
}