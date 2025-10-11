package stringQuestions;

public class CountVowelConsonant {

	public static void main(String[] args) {
		String str = "Apple";
		String str2 = str.toLowerCase();
		int v = 0, c = 0;
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					v++;
				} else {
					c++;
				}
			}
			
		}
		System.out.println("vowel count :" + v);
		System.out.println("consonant count :" + c);
	}
}
