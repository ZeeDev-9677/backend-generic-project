package basicodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayQuestions {

	public static void main(String[] args) {
		// Array Reverse
		/*
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[4];
		 * System.out.println("Enter the array elements");
		 * 
		 * for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt(); }
		 * System.out.println("Reverse array elements"); for (int i = (arr.length) - 1;
		 * i >= 0; i--) { System.out.println(arr[i] + " "); }
		 */

		// ArrayList demo by using forEach() method

		/*
		 * List<Integer> arr = new ArrayList<Integer>(); arr.add(1); arr.add(8);
		 * arr.add(89); arr.add(90); arr.add(18); arr.forEach(n -> {
		 * System.out.println(n); });
		 */

		// Number reverse without using array

		/*
		 * int num = 123456;
		 * 
		 * int rev = 0; while (num != 0) { int rem = num % 10; rev = rev * 10 + rem; num
		 * = num / 10; } System.out.println("Reverse numbers are:" + rev);
		 */

	}

}
