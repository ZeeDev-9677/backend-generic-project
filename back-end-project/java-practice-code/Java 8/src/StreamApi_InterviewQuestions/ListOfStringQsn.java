package StreamApi_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfStringQsn {

	public static void main(String[] args) {
		/* converting list of strings into single list using flatMap() */
		
//		List<List<String>> lst=Arrays.asList(Arrays.asList("apple","mango"),Arrays.asList("Grps","bnana"),Arrays.asList("kiwi","dragon"));
//		
//		List<String> nl=lst.stream().flatMap(x->x.stream()).collect(Collectors.toList());
//		System.out.println(nl);
		
		/* print start with "K" */
		
//		List<String> collect = nl.stream().filter(x->x.startsWith("k")).collect(Collectors.toList());
//		System.out.println(collect);
		
		/* count the no of strings present in list */
//		List<String> ls=Arrays.asList("apple","mango","banana","pinaplle");
//		long count = ls.stream().count();
//		System.out.println(" answer:"+count);
		          /* OR */
//		Long collect = ls.stream().collect(Collectors.counting());
//		System.out.println("ANSWER :"+collect);
		
		/* splitting string */
		
//		String str="jksdjcd";
//		String[] split = str.split("");
//		System.out.println(split);
		
		
		/* count the length of each string using mapping */
		
//		List<String> fruitList=Arrays.asList("apple","mango","banana","pinaplle");
//		List<Integer> stringLength = fruitList.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
//		System.out.println("Length of each string are :"+stringLength);
					
		/*
			* partitioning into even and odd by using partitioningBy() method of stream
			* api.
		*/			
		
//		List<Integer> lst = Arrays.asList(23, 5, 12, 24, 30);
//		Map<Boolean, List<Integer>> collect = lst.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
//		System.out.println("Odd Even numbers are :" + collect);
		
		/*
			 *  partitioning into highest and lowest value by using partitioningBy()
			 * method of stream api.
		 */	
		
//		List<Integer> list = Arrays.asList(2093, 5000, 11002, 24090, 300909,8989);
//		Map<Boolean, List<Integer>> highestValue = list.stream().collect(Collectors.partitioningBy(x->x>10000));
//		System.out.println(highestValue);
		
		
		/* count each character occurence */
		
		String str="Aeroplane";
		Map<String, Long> countStringLength = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("answer :"+countStringLength);
		
		/* o/p-> answer :{p=1, a=1, A=1, r=1, e=2, l=1, n=1, o=1} */
		
		/* count each character occurence as well as convert to lower or upper case */
		
		String str1="umbrella";
		Map<String, Long> countStringLength2 = Arrays.stream(str1.split("")).map(String::toUpperCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("answer :"+countStringLength2);
		
		/* o/p-> answer :{A=1, R=1, B=1, E=1, U=1, L=2, M=1} */
		
		/* map the length of string with given string */	
		
		List<String> strList = List.of("Apple", "Banana", "Mangoo", "Kiwi");
		Map<String, Integer> result = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println("answer :" + result);
		
		/* o/p->answer :{Apple=5, Mangoo=6, Kiwi=4, Banana=6} */
	}

}
