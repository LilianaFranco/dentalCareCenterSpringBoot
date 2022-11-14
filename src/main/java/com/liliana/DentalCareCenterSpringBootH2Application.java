package com.liliana;

import com.liliana.controller.DentistController;
import com.liliana.domain.Dentist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DentalCareCenterSpringBootH2Application {

	public static void main(String[] args) {

		SpringApplication.run(DentalCareCenterSpringBootH2Application.class, args);

	}

	@GetMapping
	public String Welcome(){
		return "Welcome to the Dental Care center";
	}
}
