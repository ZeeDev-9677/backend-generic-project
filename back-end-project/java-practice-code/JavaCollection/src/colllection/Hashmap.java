package colllection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {

//		HashMap<Integer, String> m = new HashMap<Integer, String>();
//		m.put(1, "abc");
//		m.put(2, "addf");
//		m.put(null,null);///print null key and value
//		m.put(3, "dddd");
//		m.put(4, "alpha");
//		m.put(5, "vdgvfd");
//		m.put(6, "alpha");   //Hashmap one key contains multiple values like id 3,6-->alpha
//		//System.out.println("My First hashmap code =");
//		/*
//		 * for (Map.Entry var_name : m.entrySet()) { //Map.Entry contains getKye() and
//		 * getValue() method...Entry is interface //present inside Map Interface
//		 * System.out.println(var_name.getKey() + " " + var_name.getValue()); }
//		 */
//		if(m.containsKey("dddd"));
//		{
//			System.out.println(m.get("dddd"));
//		}
		
		
		/*find first non-repeating character using linkedHashmap*/
//		o/p->'w'
		String str = "swiss";
		Map<Character, Integer> mp = new LinkedHashMap<>();
		char[] c = str.toCharArray();
		for (char x : c) {
			mp.put(x, mp.getOrDefault(x, 0) + 1);
		}

		for (Map.Entry<Character, Integer> e : mp.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println("Frequency is :" + e.getKey());
				return; // if remove this will print all non-repeating character.
			}

			/* if we need to print first non repeating character from end */

//		for(int i=mp.size()-1;i>=0;i--) {
//			char c = str.charAt(i);
//			if(mp.get(c)==1) {
//				System.out.println("non-rept from end is :"+c);
//				return;  // if remove this will print all non-repeating character.
//			}
//		}

		}
		System.out.println("nothing tp print non repeating character in given string..");

	}

}
