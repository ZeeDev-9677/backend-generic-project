package com.java.constructr;

public class Contructor1 {

	public static void main(String[] args) {
		Constructor2 c2 = new Constructor2();
		int s = c2.x = 89;
		int t = c2.y = 90;
		System.out.println(s + " " + t);

	}

}
