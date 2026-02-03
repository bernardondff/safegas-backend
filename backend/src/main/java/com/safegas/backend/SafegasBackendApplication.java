package com.safegas.backend;

import com.safegas.backend.entity.User;
import com.safegas.backend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SafegasBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafegasBackendApplication.class, args);
	}
}