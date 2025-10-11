package stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

			


public class Filter_zee {

	/* create list of integers (printing even number from a list of numbers) */ 
	
//	public static void main(String[] args) {
//
////		List<Integer> list = Arrays.asList(2, 6, 9, 11, 20, 30, 29);
////		List<Integer> strm = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
////		System.out.println(strm);
//		
//		List<Integer> lst=Arrays.asList(38,1,9,3,29,10);
//		List<Integer> collectList = lst.stream().sorted().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(collectList);
//	}
//
//}
 

	/* create list of strings and perform operation if string start with "Z" */



//	public static void main(String[] args) {
//
//		List<String> list = Arrays.asList("alpha", "Beta", "Zees");
//		List<String> str = list.stream().filter(e -> e.startsWith("Z")).collect(Collectors.toList());
//		System.out.println(str);
//	}
//
//}
 

	/* It will return individual string length of an array of elements */
	
//	public static void main(String[] args) {
//
//		List<String> list = Arrays.asList("alpha", "Beta", "Zees");
//		List<Integer> stringLength = list.stream().map(e -> e.length()).collect(Collectors.toList());
//		System.out.println(stringLength);
//	}
//
//}

	/* sort the number using sorted method of stream api */


//	public static void main(String[] args) {
//		List<Integer> ls = Arrays.asList(2, 3, 1, 5, 4);
//		List<Integer> my_lst = ls.stream().sorted().collect(Collectors.toList());
//		System.out.println(my_lst);
//	}
//}
 
			/*empty string creation*/



//	public static void main(String[] args) {
//		Stream<String> my_Stream = Stream.empty();
//		System.out.println(my_Stream);
//	}
//}



	public static void main(String[] args) {
		List<String> ls = Arrays.asList();
		List<String> my = ls.stream().filter(str -> str != null).collect(Collectors.toList());
		System.out.println(my);
	}
}
