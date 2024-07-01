package com.said.ems.entity;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.said.ems.repository.EmployeeRepository;

@Configuration
@Component
public class EmployeeConfig {
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository repository)
	{
		return args -> {
			Employee mariam = new Employee(5L,
			"Maryam",
			"carlo",
			"Maryam@gmail.com"
			);
			
			Employee alex = new Employee(6L,
			"alex",
			"marlo",
			"alex@gmail.com"
			);
			repository.saveAll(List.of(mariam,alex));
		};
	}
}