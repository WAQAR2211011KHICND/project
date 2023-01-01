package com.test.project.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication {

	
	@GetMapping("/")
	public String helloWorld(){
		return "Hello World form aws";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
