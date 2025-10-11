package stringQuestions;

import java.util.Arrays;

public class StringPalindrome_GFG {

	public static void main(String[] args) {

		/* Java String program to check whether a string is a Palindrome */
//		String s1 = "noon";
//		String s2 = "";
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			s2 = s2 + s1.charAt(i);
//		}
////		System.out.println("checking reverse or not: "+s2);
//
//		if (s1.equalsIgnoreCase(s2)) {
//
//			System.out.println("Yes, its a palindrome");
//		}
//
//		else {
//			System.out.println("No, its not a Palindrome");
//		}
		
//		-------practice code----------------
		
		String s1 = "NOon";
		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("palindrome..");
		} else {
			System.out.println("not palindrome..");
		}

	}

}
