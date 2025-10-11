package com.springcommonannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class My_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("collegeBean",College.class);
		System.out.println("The college object created by spring is:"+college);
		college.test();
	}

}
