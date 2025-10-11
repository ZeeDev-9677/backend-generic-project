package java_beginners_code;

import java.util.Scanner;

public class ElementsReplc {

	public static void main(String[] args) {

		/*
		 * String str1=str.toLowerCase(); char[] arr=str1.toCharArray();
		 * System.out.println("New Array Elemets are:"); for(int i=0;i<arr.length;i++) {
		 * int c=1; for(int j=i+1;j<arr.length;j++) { if(arr[i]==arr[j]) { c++;
		 * arr[j]='*'; } } System.out.print(arr[i]); }
		 */

		/* Duplicate character print below */

//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		char[] arr = str.toCharArray();
//
//		System.out.println("Duplicate Elemets are:");
//		for (int i = 0; i < arr.length; i++) {
//			int c = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					c++;
//					arr[j] = '0';
//				}
//
//			}
//			if (c > 1 && arr[i] != '0') {
//
//				System.out.print(arr[i]);
//			}
//		}
		
		

		/* Practice mode */
		/* remove repeated elements with '*' */
		String str="Mathematics";
		String str1=str.toLowerCase();
		char[] ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[i]=ch[j];
					ch[j]='*';
				}
			}
			/* only specific character needs to replace */
			/*
			 * if(ch[i]=='l') { ch[i]='#'; }
			 */
			System.out.print(ch[i]+" ");
		}
	}

}
