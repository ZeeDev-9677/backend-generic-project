package functional_interface;

import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
interface Greeting{
	void sayName(String xx);
	default void sayCheck() {
		System.out.println("greeting from check..");
	}
	static void sayDisp() {
		System.out.println("greeting from disp..");
	}
}

public class Functional_Interface_Basics {

	public static void main(String[] args) {
//	     List<String> names = Arrays.asList("john", "alice", "bob");
//
//	        Function<String, String> toUpper = s -> s.toUpperCase();
//
//	        List<String> upperNames = names.stream()
//	                                       .map(toUpper)
//	                                       .collect(Collectors.toList());
//
//	        System.out.println(upperNames);
		
		
		
//			Greeting g = x -> System.out.println("Hello " + x);
//			g.sayName("hema"); // abstract method via lambda
//			g.sayCheck(); // default method
//			Greeting.sayDisp(); // static method
	
		
			/*---------------------------- predicate ->test condition and return true or false----------------------------*/
//		 Predicate<Integer> isEven = n -> n % 2 == 0;
//       System.out.println(isEven.test(10)); // true
//       System.out.println(isEven.test(7));  // false
       
			/*----------------------------function ->Takes one input and returns one output.-----------------*/ 
//		 Function<Integer, String> squareMsg = n -> "Square is " + (n * n);
//		 System.out.println(squareMsg.apply(4));

		/*----------------------------Consumer ->Takes input but doesn’t return anything.-----------------*/ 
//		Consumer<String> consumer = x -> System.out.println("name is:" + x);
//		consumer.accept("Apple");
		
		
		/*----------------------------Supplier ->No input, returns something.-----------------*/
		Supplier<String> supplier=() ->LocalTime.now().toString();
		System.out.println("Hi, Rahul current time is :"+supplier.get());
	}

}
