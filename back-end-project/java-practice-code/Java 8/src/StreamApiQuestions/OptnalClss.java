package StreamApiQuestions;

import java.util.Optional;

public class OptnalClss {

	public static void main(String[] args) {
		Optional<String> check = Hello(2);

		/*-----------------------------------------------------------------*/
		
		if (check.isPresent()) { // Optional class method----->"isPresent()"
			System.out.println(check.get());
		}

		/*-----------------------------------------------------------------*/
//		String newstr=check.isPresent()?check.get():"sdgs"; //to check if empty instance of optional is returning will apply this method
		
//		String orElse = check.orElse("NA"); //to check if empty instance of optional return will apply this method 
//		System.out.println(orElse);
		
		
		/*-----------------------------------------------------------------*/
		
//		check.ifPresent(e->System.out.println(e)); //Optional class method----->"ifPresent()"
//		check.ifPresent(System.out::println); //Optional class method----->"ifPresent()" and method reference-->"System.out::println"
	}

	private static Optional<String> Hello(int a) {
		/*-----------------------------------------------------------------*/
//		String s = null;
//		Optional<String> str1 = Optional.ofNullable(s);
//		return str1;
		/*-----------------------------------------------------------------*/

		// both cases will not throw any NullPointerException
//		
//		String s = "dgtrgbv";
//		return Optional.ofNullable(s); 
		
		String s = null;
		return Optional.ofNullable(s);
		/*-----------------------------------------------------------------*/
//		String s = null;
//		return Optional.of(s); // will throw NullPointerException
		
//		String s = "ffdfdrgrtgrt";
//		return Optional.of(s); // will not throw any NullPointerException
		/*-----------------------------------------------------------------*/
//		return Optional.empty(); //Returns an empty Optional instance. No value is present for this Optional.
	}
}
