package colllection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayList_my {

	public static void main(String[] args) {
		// first list
//		List<String> ar = new ArrayList<String>();
//		ar.add("Hello");
//		ar.add("Bye");
//		ar.add("Cat");
//		ar.add("Dog");
//		ar.add("Egle");
//		ar.add("Frog");
////iterating list
//		for (String a : ar) {
//			System.out.println("Answer is =" + a);
//		}

		// for(String x:ar) { System.out.print(x); }

		// System.out.println(ar.get(3));
		// second list
//		List<String> ar1 = new ArrayList<String>();
//		ar1.add("fd");
//		ar1.add("mike");
//		ar1.add("trp");
//		ar1.add("mcd");
//		ar.addAll(ar1);
//
//		// printing the added first and second list together
//		for (String s : ar) {
//			System.out.print(" " + s);
//		}
	
	
		/* even odd print */
//		List<Integer> l=Arrays.asList(4,3,2,9,10,48);
//		List<Integer> list=l.stream().filter(i->i%2==0).collect(Collectors.toList());
//		List<Integer> list2=l.stream().filter(i->i%2!=0).collect(Collectors.toList());
//		System.out.println(list);
//		System.out.println(list2);
		
		
		
//	-------------------------------------practice GPT questions------------------------------
		/* 1. Reverse an ArrayList without using Collections.reverse() */
		
//		System.out.print("Rverse arraylist: ");
//		List<Integer> list=Arrays.asList(3,1,7,2,9);
//		for(int i=list.size()-1;i>=0;i--) {
//			
//			System.out.print(list.get(i)+" ");
//		}
//--------------------------------------------------		
//		pending qns:-
//		List<Integer> l=new ArrayList<>();
//		l.add(4);
//		l.add(2);
//		l.add(3);
//		l.add(9);
//		l.add(5);
//		
//		for(int i=l.size()-1;i>=0;i--) {
////			for(int j=l.size()-1;j>=0;j--) {
//				Integer tm=l.get(i);
//				l.set(i, tm);
////				l.set();
////			}
//				
//				System.out.println(l);
//		}
		
		
//-----------------------------------------------------------
		/* 2. Remove duplicates from an ArrayList */
//		Solution (Using LinkedHashSet to preserve order):
		//Integer case:-
//		ArrayList<Integer> l=new ArrayList<>();
//		l.add(7);
//		l.add(4);
//		l.add(2);
//		l.add(4);
//		l.add(1);
//		
//		ArrayList<Integer> list=new ArrayList<>(new LinkedHashSet<>(l)); //passing list inside HashSet constructor of
//												   //inside ArrayList constructor
//		System.out.println(list);
//		o/p-> [7, 4, 2, 1]
		
		
		//String case:-
//		ArrayList<String> l=new ArrayList<>();
//		l.add("Java");
//		l.add("Python");
//		l.add("Go");
//		l.add("Angular");
//		l.add("Go");
//		
//		ArrayList<String> list=new ArrayList<>(new LinkedHashSet<>(l)); //passing list inside HashSet constructor of
//																   //inside ArrayList constructor
//		System.out.println(list);
//		[Java, Go, Angular, Python]
		
		
//-------------------------------------------------------------------
		/* 3. Find frequency of elements in an ArrayList */
		//will print each item frequency
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list, "Apple","Mango","Apple","Grapes","Kiwi","Grapes");
		
		Map<String,Integer> mp=new HashMap<>();
		for(String s:list) {
			mp.put(s, mp.getOrDefault(s, 0)+1);
		}
		System.out.println(mp);
		
		//will print repeated item frequency(my code)
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(6);
//		list.add(3);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		for(int i=0;i<list.size();i++) {
//			int c=0;
//			for(int j=i+1;j<list.size();j++) {
//				if(list.get(i)==list.get(j)) {
//					c++;
//					list.set(j, -1);
//				}
//				
//			}
//			if(list.get(i)!=-1 && c>0) {
//					System.out.println(list.get(i)+" = "+i);
//			}
//		}
//----------------------------------------------------------------------------------------------------

		/* print in descending order below ArrayList one is Integer and second is String type example*/

		
//		using static method  Collections.addAll(list, 10, 5, 30, 20) of Collections class firstly 
//		collection need to be pass(here collection is list) where elements needs to be add into list.
		
//(1)Integer type:----------------------
//		 List<Integer> list = Arrays.asList(10, 5, 30, 20);
//		 List<Integer> list = new ArrayList<Integer>();
//	        Collections.addAll(list, 10, 5, 30, 20);
//
//	        list.sort(Collections.reverseOrder());
//	        System.out.println("Descending: " + list);
		
//(2)String type:----------------------
//		List<String> list = new ArrayList<>();
//		Collections.addAll(list, "Hema","Lakshmi", "Rekha", "Sahil","Rahul");
//
//		list.sort(Collections.reverseOrder());
//		System.out.println("Descending: " + list);
	}

}
