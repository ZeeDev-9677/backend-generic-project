package interview2;

public class ReplacterCharacter {

	public static void main(String[] args) {
		/* using normal way(using for loop) */
		
		String s = "Hello";
		char[] ns=s.toCharArray();
		char repl = '*';
		for (int i = 0; i < s.length(); i++) {
			if (ns[i] == 'a' || ns[i] == 'e' || ns[i] == 'i' || ns[i] == 'o' || ns[i] == 'u' || ns[i] == 'a'
					|| ns[i] == 'e' || ns[i] == 'i' || ns[i] == 'o' || ns[i] == 'u') {
				ns[i] = repl;
			}
		}
		System.out.println(ns);
		
		/* using in-built method replaceAll() method */
//		String ns=s.replaceAll("[AEIOUaeiou]", "*");
//		System.out.println(ns);

	}

}
