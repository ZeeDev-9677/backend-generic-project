package stringQuestions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLength_In_List {
	/* frequency of String in List */
	public static void main(String[] args) {
//		List<String> list=Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
//		Set<String> unique=new HashSet<String>(); //unique elements 
//		Set<String> duplicate=new HashSet<String>(); // duplicates elements
//		
//		for(String x:list) {
			/* advance way */
//			if(!unique.add(x)) {
//				
//				duplicate.add(x);
//			}
			
			/* beginners way */
//			if(unique.contains(x)) {
//				duplicate.add(x);
//			}
//			else {
//				unique.add(x);
//			}
//		}
		
//		System.out.println("origional list : "+list);
//		System.out.println("unique elements : "+unique);
//		System.out.println("duplicate elements : "+duplicate);
		
		
//		for(String x:list) {
//			if() {
//				
//			}
//		}
		
		
		/* frequency of string in list */
		
//		List<String> list=Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
//		Map<String,Integer> mp=new HashMap<String,Integer>();
//		
//		// Count frequencies
//		for (String x : list) {
//			mp.put(x, mp.getOrDefault(x, 0)+1);
//
//		}
//		System.out.println("frequency of each element are : " + mp);
//		
//		
//		/* Print only duplicates whole value greater than 1 */
//		
//		System.out.println("frequency having greater than 1 value are : ");
//		for(Map.Entry<String, Integer> t:mp.entrySet()) {
//			if(t.getValue()>1) {
//				System.out.println(t.getKey()+"->"+t.getValue());
//			}
//		}
		
		/* count each string length */
		List<String> list=Arrays.asList("apple", "banana", "apple", "orange");
//		System.out.println("length of each element is:");
//		for(String x:list) {
//			System.out.println(x+" = " +x.length());
//		}
		
//		Map<Integer,Integer> mp=new HashMap<>();
//		for(String x:list) {
//			int len=x.length();
//			mp.put(len, mp.getOrDefault(len, 0)+1);
//		}
//		for(Map.Entry<Integer, Integer> en:mp.entrySet()) {
//			
//			System.out.println(en.getKey()+" = "+en.getValue());
//		}
		
		Map<Integer, Long> ln = list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
//		System.out.println(collect);
        System.out.println("Frequency of word lengths:");
        ln.forEach((len, count) ->
                System.out.println("Length " + len + " → " + count + " words"));
		
	}

}
