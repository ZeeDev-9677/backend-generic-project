package interview_questions;

import java.util.Arrays;
//Q-> find index position with frequency
//Example= i/p-->abcdadfd
//       = o/p--> a=2,d=3
public class PrintIndexPosition {

	public static void main(String[] args) {
		int i, j;
		String str = "abcdabkss";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println("elements with freq :");
		for (i = 0; i < ch.length -1; i++) {
			int count = 1;

			for (j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
				else {
					break;
				}

			}
			i = j-1 ;
			if (count > 1) {
				System.out.println(ch[i] + " = " + count);
			}
		}

	}

}
