package stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		
		/*-------------------merging into one list from multiple list--------- */
		List<List<String>> nstList=Arrays.asList(Arrays.asList("Mango"),
				Arrays.asList("is"),
				Arrays.asList("a"),
				Arrays.asList("favourite"),
				Arrays.asList("fruit's"));
		System.out.println("before flatting :" + nstList);
		System.out.println();
		
//		flatten into one list
		List<String> newList = nstList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("after flatting :" + newList);

//		to print string length
		List<Integer> collect = newList.stream().map(String::length).collect(Collectors.toList());
		System.out.println("length of :" + collect);
		
		/* -------------------splitting single list into multiple list--------- */
		
//		List<String> list=Arrays.asList("Hi, bro how is your health.");
//		
//		List<String> list2 = list.stream().flatMap(x->Arrays.stream(x.split(" "))).collect(Collectors.toList());
//		System.out.println(list2.toString());
		
//		o/p -> [Hi,, bro, how, is, your, health.] 
		
		
	}

}
