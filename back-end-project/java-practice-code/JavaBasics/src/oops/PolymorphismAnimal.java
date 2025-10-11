package oops;

/*POLYMORPHISM is a core principle in java where a single task or action can perform in different ways.
 * polymorphism achieved through method overriding(runtime or dynamic polymorphism) 
 * and method overloading(compile-Time polymorphism)
 * 
 * 
*/

public class PolymorphismAnimal {
	public void animalSound() {
		System.out.println("The Animal Makes Sound");
	}
	
	
	public void testingAnimal() {
		System.out.println("TestingAnimal");
	}
	public void animalSound(String cat) {
		System.out.println("The Animal Makes Meowww..");
	}
	
	public void animalSound(int x) {
		System.out.println("The int value is :"+x);
	}
	
	public void animalSound(String cat,int x) {
		System.out.println("The value is :"+cat+x);
	}

	public void animalSound(int x,String cat) {
		System.out.println("The value is :"+x+cat);
	}
	
//	public int add(int x,int y) {
//		return x+y;
//	}
//	
//	public double add(int x,int y) {
//		return x+y;
//	}
	
	
	
}
