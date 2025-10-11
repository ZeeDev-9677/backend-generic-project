package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreaMMethod {

	public static void main(String[] args) {
//<<<<<<<<<---------using normal method to print even numbers---------->>>>>>>>>>

//List<Integer> listSt = List.of(3, 6, 1, 8, 9, 4, 10);
//	List<Integer> lst = new ArrayList<>();
//	System.out.print("Even numbers are :");
//	for (Integer i : listSt) {
//		if(i%2==0) {
//		lst.add(i);
//		}
//	}
//System.out.println(lst);

//<<<<<<<<<---------using Stream Api method to print even numbers---------->>>>>>>>>>
//		List<Integer> list1 = List.of(3, 6, 1, 8, 9, 4, 10);
//		List<Integer> st = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//		System.out.println("New list is : " + st);

		// <<--using stream api printing each and every elemnts inside String array-->>
//		String[] str = new String[] { "abv", "sds", "jdsjj" };
//		Stream<String> strmObj = Stream.of(str); // creating stream object and passing args inside Stream.of() method of array of String object
//		strmObj.forEach(x -> {   //iterating each and every element.
//			System.out.println(x);
//		});

//<<<-----startWith method in stream api---->>>>>>>>>>>

//		List<String> listStream = List.of("ahaha", "shdueeu", "sssjj", "zzjjsjs");
//		List<String> nw = listStream.stream().filter(x -> x.startsWith("s")).collect(Collectors.toList());
//		System.out.println(nw);

//		List<String> stringList = Arrays.asList("A", "Bcbdd", "C", "Dasasc");
//		List<String> filterList = stringList.stream().filter(i->i.startsWith("E")).collect(Collectors.toList());
//		System.out.println(filterList);
		
		
		List<Integer> integerList = Arrays.asList(2, 3, 9, 1, 5, 99, 2, 5, 3, 70,40);
		List<Integer> collectedList = integerList.stream()
						.sorted()
						.distinct()
						.filter(i -> i % 2 == 0)
						.collect(Collectors.toList());
		System.out.println(collectedList);

	}

}
