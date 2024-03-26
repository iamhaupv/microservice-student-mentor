package com.example.MentorService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MentorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorServiceApplication.class, args);
	}

}
