package com.dependencyInjection.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contxt=SpringApplication.run(DependencyInjectionApplication.class, args);//initialization of container
		//ConfigurableApplicationContext can be find in run method (by pressing ctrl button and click in run method. 
		Car c=contxt.getBean(Car.class);
		c.show();
		
//		Car c1=contxt.getBean(Car.class);
//		c1.show();
		
		
	}

}
