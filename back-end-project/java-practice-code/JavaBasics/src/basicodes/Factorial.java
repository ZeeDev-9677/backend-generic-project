package basicodes;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
//		int fact = 5;
//		System.out.println("Factorial of a number is :");
//		for (int i = fact - 1; i >= 1; i--) {
//
//			fact = fact * i;
//		}
//		System.out.println(fact);
		
		
		/*----------------practice--------------------*/
		
		
//		 for big factorial value printing i.e:80,90,200
		
//		int num=700;
//		BigInteger bigInt=BigInteger.ONE;
//		for(int i=2;i<num;i++) {
//			bigInt=bigInt.multiply(BigInteger.valueOf(i));
//		}
//		System.out.println("big Integer value is :"+bigInt);
		
		int num=6;
		System.out.println("factorial is :");
		for(int i=num-1;i>=1;i--) {
			num=num*i;
		}
		System.out.println(num);
	}

}
