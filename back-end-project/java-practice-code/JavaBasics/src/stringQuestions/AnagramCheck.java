package stringQuestions;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
//		Anagram= should be same contents with same length

		String s1 = "SMOKE";
		String str1 = s1.toLowerCase();
		char[] ch1 = str1.toCharArray();
		String s2 = "EMOKSe";
		String str2 = s2.toLowerCase();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Yes,Its an Anagram");
		} else {
			System.out.println("No, Its not an Anagram!! ");
		}
		
		
		/*---------------------practice-----------------------------*/
//		String s1 = "Apple";
//		char[] ch1 = s1.toLowerCase().toCharArray();
//		String s2 = "PpleAa";
//		char[] ch2 = s2.toLowerCase().toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		if (ch1.length == ch2.length) {
//			if (Arrays.equals(ch1, ch2)) {
//				System.out.println("anagram..");
//			} else {
//				System.out.println("not an anagram..");
//			}
//		}
//		else {
//			System.out.println("Length not equal, so its not an anagram..");
//		}
	}

}
