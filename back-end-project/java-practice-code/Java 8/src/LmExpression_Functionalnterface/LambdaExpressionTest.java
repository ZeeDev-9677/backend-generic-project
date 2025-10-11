package LmExpression_Functionalnterface;
//-------------------------basic lambda expression--------------------

//@FunctionalInterface
//interface Test {
//
//	void sayHello(String s);
//}
//public class LambdaExpressionTest {
//
//	public static void main(String[] args) {
//		
//	Test x=(s)->System.out.println("Hi there, "+s);
//	x.sayHello("Charlie..");
//	}
//
//}

//------------------------------other concept lambda expression-------------------------

@FunctionalInterface
interface Test {

	void sayHello(String s);
}

public class LambdaExpressionTest {

	public static void main(String[] args) {

//		Zebra z = new Zebra();
//		
//		Thread th=new Thread(z);
//		th.run();
		
		
		// below line without using implementation class of Test interface thats why
		// functional interface and lambda expression comes into picture
//		Test t = (s) -> {
//			System.out.println("Without implementation class..");
//		};
//		t.sayHello("Hyyyy");

		
		
		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Chck.." + i);
			}
			;
		};

		Thread thread1 = new Thread(r);
		thread1.run();

	}

}
