package it.sirfin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.rubrica"})
@EnableJpaRepositories(basePackages = {"it.sirfin.rubrica.repository"})
@EntityScan(basePackages = {"it.sirfin.rubrica.model"})

public class RubricaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubricaApplication.class, args);
	}

}
