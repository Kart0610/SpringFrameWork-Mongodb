package com.example.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableMongoRepositories("com.example.project.repository")
public class projectApplication {

	public static void main(String[] args) {
		SpringApplication.run(projectApplication.class, args);
	}

}