package br.com.meutreino.workout_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan; // 1. IMPORTE ISTO
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.meutreino.workout_api.repository")
@EntityScan("br.com.meutreino.workout_api.model") // 2. ADICIONE ESTA LINHA
public class WorkoutApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutApiApplication.class, args);
	}

}
