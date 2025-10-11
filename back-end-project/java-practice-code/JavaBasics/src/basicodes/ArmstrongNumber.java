package basicodes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// number palindrome -> i.e 1³ + 5³ + 3³ = 1 + 125 + 27 = 153.

		int n = 153, rem, sr=0, temp = n, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sr = rem * rem * rem;
			sum = sum + sr;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Armstrong number!");
		} else {
			System.out.println("Not a Armstrong number!");
		}

		// String palindrome

//		String str = "123";
//		int n = str.length();
//		String rev = "";
//		for (int i = n - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		if (str.equals(rev)) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("not palindrome");
//		}
	}

}
