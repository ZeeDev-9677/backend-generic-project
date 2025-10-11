package com.dependencyInjection.demo;

import org.springframework.stereotype.Component;
//@Component  spring will search class annotated with @Compnent and create a bean of that class(here Car bean will be created)
@Component("bike")
public class BikeDInjection {
 private String name;
 private String color;
 private String model;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
@Override
public String toString() {
	return "BikeDInjection [name=" + name + ", color=" + color + ", model=" + model + "]";
}
	
	public void dsp() {
		System.out.println("Hey I am Bike class");
	}
 
 
}
