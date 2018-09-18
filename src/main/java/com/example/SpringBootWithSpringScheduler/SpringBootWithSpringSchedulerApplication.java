package com.example.SpringBootWithSpringScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootWithSpringSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithSpringSchedulerApplication.class, args);
	}
}
