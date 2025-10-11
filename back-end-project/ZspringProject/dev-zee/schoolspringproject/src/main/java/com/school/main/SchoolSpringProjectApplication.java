package com.school.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@Configuration
@EnableCaching
@ComponentScan({ "com.school", "spring_config" })
@EnableJpaRepositories(basePackages = "com.school")
@EntityScan(basePackages = "com.school")
@SpringBootApplication
public class SchoolSpringProjectApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SchoolSpringProjectApplication.class);
		try {
			SpringApplication.run(SchoolSpringProjectApplication.class, args);
		} catch (Throwable e) {
			if (e.getClass().getName().contains("SilentExitException")) {
				logger.debug("Spring is restarting the main thread - See spring-boot-devtools");
			} else {
				logger.error("Application crashed!", e);
			}
		}
	}

}
