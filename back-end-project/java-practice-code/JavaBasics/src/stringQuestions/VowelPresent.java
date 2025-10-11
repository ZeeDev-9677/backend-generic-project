package stringQuestions;

public class VowelPresent {

	public static void main(String[] args) {
		String str = "fudgf";
		/*
		 * general way print vowel presence or not 
		 */	
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//				System.out.println("Vowel is present at index :" + i + " and value is :" + str.charAt(i));
//			}
//			
//		}
		
		/*
		 * advanced way print vowel presence or not
		 */		
		System.out.println(str.toLowerCase().matches(".*[aeiouAEIOU].*")?"yes vowel is present":"no vowel is present");
		
		/*--------------------------------practice-----------------*/
		
//		String  s="Hi Hello";
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//				System.out.println("It has a vowels..");
//				break;
//			}
//		}
	}

}
