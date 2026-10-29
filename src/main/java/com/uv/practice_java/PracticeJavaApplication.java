package com.uv.practice_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.uv")
@EntityScan(basePackages = "com.uv.caching_java.entity")
@EnableJpaRepositories(basePackages = "com.uv.caching_java.repository")
public class PracticeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeJavaApplication.class, args);
	}

}
