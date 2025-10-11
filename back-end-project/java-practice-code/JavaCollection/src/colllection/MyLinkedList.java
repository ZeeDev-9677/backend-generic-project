package colllection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyLinkedList {

	public static void main(String[] args) {
		
//		List<String> sList=new LinkedList<>();
//		Collections.addAll(sList,"Apple","Bnana","Grapes","Kiwi","Bnana");
//		Map<String,Integer> map=new HashMap<>();
//		for(String x:sList) {
////			map.put(x, map.getOrDefault(x, 0)+1);
//			map.put(x,map.getOrDefault(x, 0));
//		}
//		
//		System.out.println(map);
		
		
		LinkedList<String> sList=new LinkedList<>();
		sList.add("Apple");
		sList.add("Bnana");
		sList.add("Grapes");
		sList.add("Kiwi");
//		System.out.println("before :"+sList);
//		sList.addFirst("Papple");
//		sList.addLast("Fig");
//		System.out.println("after :"+sList);
		
		sList.remove(2); // remove by passing index position
//		sList.remove("Bnana"); // remove by passing element
//		sList.removeFirst(); // remove from first index position
//		sList.removeLast(); // remove from last index position
//		System.out.println("after delete :"+sList);
		
		
		//Collections.addAll() method:-
//		Collections.addAll(sList, "Apple","Mango","Kiwi","Fig","Mango");
//		Map<String,Integer> map=new HashMap<>();
//		
//		for(String x:sList) {
//			map.put(x, map.getOrDefault(x, 0)+1);
//		}
//
//		System.out.println(map);
		
		List<String> l=new LinkedList<>();
		l.add("Hello");
		l.add("World");
		List<String> l2=new LinkedList<>();
		l2.add("Bye");
		l2.add("Tata..");
		
		l.addAll(l2);
		System.out.println("new list :"+l);
	}
}
