package com.doctor.appointment;

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
@ComponentScan({ "com.doctor" })
@EnableJpaRepositories(basePackages = "com.doctor")
@EntityScan(basePackages = "com.doctor")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Application.class);

		try {
			SpringApplication.run(Application.class, args);
		} catch (Throwable e) {
			if (e.getClass().getName().contains("SilentExitException")) {
				logger.debug("Spring is restarting the main thread - See spring-boot-devtools");
			} else {
				logger.error("Application crashed!", e);
			}
		}

	}

}
