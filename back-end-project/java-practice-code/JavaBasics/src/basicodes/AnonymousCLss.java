package basicodes;

//by using interface
/*interface Demo {
	void meth();

}
*/
//by using abstract class
abstract class Person {
	abstract void disp();
}

// This is the scenario where the Anonymous class comes into the picture. With
// the help of the Anonymous class, we can declare and instantiate a class at
// the same time. Let's see how it is done

/*
 * Ways to create an Anonymous Java class : The Anonymous class in Java can be
 * created by two ways :
 * 
 * By extending a class By implementing an interface
 */

public class AnonymousCLss {

	public static void main(String[] args) {

		/*
		 * Demo de = new Demo() {
		 * 
		 * public void meth() { System.out.println("Hello I am de"); } }; de.meth();
		 */
		// d.meth1();

		// by using abstract class

		Person p = new Person() {
			public void disp() {
				System.out.println("Hi I am p");
			}
		};
		p.disp();

	}

}