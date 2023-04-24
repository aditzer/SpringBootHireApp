package com.aditi.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class JoblistingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

}
