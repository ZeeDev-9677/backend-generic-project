package optional_class;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
	
		String[] str=new String[5];
		/* Optional class is nothing but a container of object which may or may not hold a
		 * non-null value. So, code can execute without crashing.
		 */
		
		/* BEFORE optional class facing NullPointerException */
//		String s=str[3].toLowerCase();
//		System.out.println(s+"null is there..");
		
		/* AFTER optional class handle NullPointerException */
		Optional<String> x = Optional.ofNullable(str[4]);
		if(x.isPresent()) {
			String ns = str[4].toLowerCase();
			System.out.println("words is present..");
		}
		else {
			System.out.println("no word is present..");
		}
	}

}
