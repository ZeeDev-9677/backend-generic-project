package interview_questions;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int x = 7;
//		 list of prime number between (1-100)->2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
		int c = 0;
		for (int i = 1; i <= x / 2; i++) {
			int rem = x % i;
			if (rem == 0) {

				c++;
			}

		}
		if (c < 2) {
			System.out.println(" prime");
		} else {
			System.out.println("not prime");
		}
	}

}
