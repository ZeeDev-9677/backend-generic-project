package stringQuestions;

import java.util.Arrays;

public class AnagramsCheck_GFG {

	public static void main(String[] args) {
		String s1="Silent";
		String s2="listen";
		
		char[] c1=s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		
		char[] c2=s2.toLowerCase().toCharArray();
		Arrays.sort(c2);
		
		if(c1.length==c2.length) {
			if(Arrays.equals(c1, c2)){
				System.out.println("Yes Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not a Anagram");
		}

	}

}
