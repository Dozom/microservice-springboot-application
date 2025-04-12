package com.microservice.dani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class DaniApplication {

	@GetMapping("/weatherforecast")
	public String getMessage() {
		return "Today is a great Sunny day for a Java Service.";
	}
	public static void main(String[] args) {
		SpringApplication.run(DaniApplication.class, args);
	}

}
