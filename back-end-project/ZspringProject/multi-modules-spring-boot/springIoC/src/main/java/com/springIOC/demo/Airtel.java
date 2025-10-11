package com.springIOC.demo;

public class Airtel implements Sim {

	
	  public Airtel() { System.out.println("I am Constructor"); }
	 

	@Override
	public void calling() {
		System.out.println("calling using airtel sim");

	}

	@Override
	public void data() {
		System.out.println("browsing internet using airtel");

	}

}
