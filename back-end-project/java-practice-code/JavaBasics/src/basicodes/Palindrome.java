package basicodes;

public class Palindrome {

	public static void main(String[] args) {

		int n = 121, rem, rev = 0, temp=n;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (rev == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
