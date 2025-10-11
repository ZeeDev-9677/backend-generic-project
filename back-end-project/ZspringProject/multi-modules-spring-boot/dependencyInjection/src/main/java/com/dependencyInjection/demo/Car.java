package com.dependencyInjection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component// spring will search class annotated with @Compnent and create a bean of that class(here Car bean will be created) 

//@Scope(value="prototype")//will give two object of car class by using value=prototype inside @Scope
public class Car {
	private String carName;
	private String carColor;
	private String carModel;
	@Autowired  //it will search by a type of object i.e BikeDInjection.Class in spring container
	@Qualifier("bike")	//it will search by a name of a object i.e "bike" in spring container
	private BikeDInjection bikeDInjection;
	
	
	public BikeDInjection getBikeDInjection() {
		return bikeDInjection;
	}
	public void setBikeDInjection(BikeDInjection bikeDInjection) {
		this.bikeDInjection = bikeDInjection;
	}
	public Car() {// it means object will be created even if we don't want to get it through getBean() method(by commenting out getBean method in main)
		super();
		System.out.println("Objecctttttt  Created");
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void show() { 
		System.out.println("Show me please!!");
		bikeDInjection.dsp();
	}
	
}
