package com.springcommonannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcommonannotations")

public class CollegeConfig {
	@Bean
	public College collegeBean() //bean_id or bean_name
	{
		College college = new College();
		return college;
	}
}
