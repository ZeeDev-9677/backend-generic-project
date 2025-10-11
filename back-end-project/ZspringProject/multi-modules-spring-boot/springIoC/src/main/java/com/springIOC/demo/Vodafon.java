package com.springIOC.demo;

public class Vodafon implements Sim{

	@Override
	public void calling() {
		System.out.println("calling using vodafon sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using vodafon");
		
	}

}
