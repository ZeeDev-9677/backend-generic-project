package stringQuestions;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {

	public static void main(String[] args) {
		 /* Pangram check :- i.e those string contain all alphabets of english from a to z , i.e 26 total should be there.
		 */
			String s1 = "The quick brown fox jumps over the lazy dog";
			String s2 = s1.toLowerCase();
			Set<Character> st = new HashSet<Character>();
			for (int i = 0; i < s2.length(); i++) {
				char c = s2.charAt(i);
				if (c >= 'a' && c <= 'z') {
					st.add(c);
				}
			}

//		System.out.println(st);
			if (st.size() == 26) {
				System.out.println("Its, a Pangram..");
			} else {
				System.out.println("Its, not a Pangram..");
			}
		}

	}
