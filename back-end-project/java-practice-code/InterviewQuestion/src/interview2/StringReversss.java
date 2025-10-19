package interview2;

public class StringReversss {

	public static void main(String[] args) {

		// Reverse A string

		/*
		 * Scanner sc = new Scanner(System.in); String str = sc.nextLine(); char[] arr =
		 * str.toCharArray(); for (int i = arr.length - 1; i >= 0; i--) {
		 * System.out.print(arr[i]); }
		 */

		
		/*Reverse a String without affecting the special characters*/
		/* e.g input ->String str si#mn$o*/
		/* output ->on#mi$s */
//
//		String str = "si#m@$o";
//		char[] arr = str.toCharArray();
//
//		int i = 0;
//		int j = arr.length - 1;
//		while (i < j) {
//			if (!Character.isAlphabetic(arr[i]))
//
//				i++;
//
//			else if (!Character.isAlphabetic(arr[j]))
//
//				j--;
//
//			else {
//				char c;
//				c = arr[i];
//				arr[i] = arr[j];
//				arr[j] = c;
//				i++;
//				j--;
//			}
//
//		}
//
//		System.out.print(arr);
		
		/* Reverse words in a string without using library functions. */
		    /* Input: "Infosys interview coding" */
		   /* Output: "coding interview Infosys" */
		
		
//			String s = "IBM interview coding";
////			char[] ch = s.toCharArray();
//			for(int i=s.length()-1;i>=0;i--) {
//				char c=s.charAt(i);
//				if(c!=' ') {
//					
//				}
//			}

		
//		String s1="pApple";
//		String s2=s1.toLowerCase();
//		char[] ch = s2.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			int c=1;
//			for(int j=i+1;j<ch.length;j++) {
//				if(ch[i]==ch[j]) {
//					c++;
//				}
//			}
//			if(c<2) {
//				System.out.println("First non rept is: "+ch[i]+", at index = "+i);
//				break;
//			}
//		}
	}

}
