package multiple_inheritance;

//Multiple inheritance can be done by a Class implementing multiple interface (here Animal class implementing AnimalBark 
// and AnimalEat)

public class Animal implements AnimalBark, AnimalEat {
	@Override
	public void eat() {
		System.out.println("I am eating");
	}

	@Override
	public void bark() {
		System.out.println("I am barking");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal al = new Animal();
		al.eat();
		al.bark();

		// OR we can write
		/* new Animal().bark(); */

	}
}

/*******************************************************************************************/
  
  
/*
 * Multiple inheritance is not support in java because of ambiguity which class
 * method should call(here Animal class extends A and B class having method
 * disp() method present in both when calling in main, compiler will get confuse
 * which method should call, so it will give compile time error)
 */
  

//public class Animal extends A,B{
//	public static void main(String[] args) {
//		
//	 new Animal().disp();
//	}
//}