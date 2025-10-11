package stringQuestions;

public class ReverseString {

	public static void main(String[] args) {
//		String str = "ajdg";
//		String nws = str.toUpperCase();
//		int n = nws.length();
//		for (int i = n - 1; i >= 0; i--) {
//			System.out.print(nws.charAt(i)+" ");
//		}
		
		
//		-----------practice code--------------
		String str="Mathematics";
		System.out.print("Reverse string is: ");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+" ");
		}

	}
}
