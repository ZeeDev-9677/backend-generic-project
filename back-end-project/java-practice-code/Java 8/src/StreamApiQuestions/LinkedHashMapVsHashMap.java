package StreamApiQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapVsHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("zee", 105);
		hm.put("mm", 103);
		hm.put("hmm", 101);
		hm.put("kk", 102);
		System.out.println("not maintained the order of insertion in HashMap :"+hm);

		
		
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
		lhm.put("zee", 100);
		lhm.put("mm", 103);
		lhm.put("hmm", 101);
		lhm.put("kk", 102);
 		System.out.println("maintained the order of insertion in LinkedHashMap :"+lhm);
 	
 		
// 		####note:-
 		
// 		LinkedHashMap maintained the order of insertion while Hashmap does not maintained the order of insertion
 		

	}

}
