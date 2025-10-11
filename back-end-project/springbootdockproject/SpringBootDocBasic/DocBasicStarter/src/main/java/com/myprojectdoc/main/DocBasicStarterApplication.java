package com.myprojectdoc.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.myprojectdoc"})
@EnableJpaRepositories(basePackages = "com.myprojectdoc")
@EntityScan(basePackages = "com.myprojectdoc")
public class DocBasicStarterApplication {
	private static final Logger logger = LogManager.getLogger(DocBasicStarterApplication.class);

	public static void main(String[] args) {
		logger.info("DocBasicStarterApplication main start");
		SpringApplication.run(DocBasicStarterApplication.class, args);
		logger.info("DocBasicStarterApplication main end");
	}

}
