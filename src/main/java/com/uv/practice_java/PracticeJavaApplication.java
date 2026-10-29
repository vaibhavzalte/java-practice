package com.uv.practice_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.uv")
@EntityScan(basePackages = "com.uv.caching_java.entity")
@EnableJpaRepositories(basePackages = "com.uv.caching_java.repository")
@EnableCaching
public class PracticeJavaApplication {

//	@Bean
//	public CacheManager cacheManager() {
//		return new ConcurrentMapCacheManager("inventory");
//	}

	public static void main(String[] args) {
		SpringApplication.run(PracticeJavaApplication.class, args);
	}

}
