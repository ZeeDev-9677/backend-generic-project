package com.springIOC.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		// BAD APPROACH###############(implementation class reference here we using)

		/*
		 * Airtel airtel=new Airtel(); airtel.calling(); airtel.data();
		 */

		/*
		 * Vodafon voda=new Vodafon(); voda.calling(); voda.data();
		 */

		// GOOD APPROACH###################(using interface reference)

		/*
		 * Sim sim =new Airtel(); sim.calling(); sim.data();
		 */

		/*
		 * Sim sim =new Vodafon(); sim.calling(); sim.data();
		 */

		// ####################To make Configuarable we use Spring IOC
		// container(Application Interface)

		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		// System.out.println("Working!!!");
		/*
		 * Airtel air = (Airtel) context.getBean("airtel"); air.calling(); air.data();
		 */

		
		//type casting, to get bean
		/*
		 * Vodafon air = (Vodafon) context.getBean("vodafon"); air.calling();
		 * air.data();
		 */
		
		//another way to get beans
		/*
		 * Vodafon voda=context.getBean("vodafon",Vodafon.class); voda.calling();
		 * voda.data();
		 */
		
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}

}
