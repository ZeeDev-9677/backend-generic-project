package com.spring.hibernate.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@EnableCaching
@SpringBootApplication
public class SpringHibernateCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateCachingApplication.class, args);
	}

}
