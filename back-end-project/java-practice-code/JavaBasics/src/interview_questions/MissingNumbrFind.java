package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbrFind {
	public static void main(String[] args) {

		/* find missing number in an array from internet */

		/*
		 * public static int getMissingNo(int[] nums, int n) { int sum = ((n + 1) * (n +
		 * 2)) / 2; for (int i = 0; i < n; i++) sum -= nums[i]; return sum; }
		 * 
		 * // Driver code public static void main(String[] args) { int[] arr = { 1,
		 * 2,3,5};
		 * 
		 * int N = arr.length;System.out.println(getMissingNo(arr, N)); }
		 */
		
		
		/*
		 * my way of coding for finding missing number from an array
		 */		
		int[] arr = { 2, 1, 4, 5 };
		int n = arr.length;
		int totalsum = 0;
		int totalNnumbrsum = 0;
		int ans = 0;
	
		for (int i = 1; i <=5; i++) {
			totalNnumbrsum = totalNnumbrsum + i;
		}
		System.out.println("the summation of Nnumbrsum = " + totalNnumbrsum);
		for (int i = 0; i < n; i++) {
			totalsum = totalsum + arr[i];
		}
		System.out.println("the totalsum of given array is = " + totalsum);
		ans = totalNnumbrsum - totalsum;
		System.out.println("Missing number is = " + ans);
		
		
//		for(int i=0;i<n;i++) {
//			totalsum=totalsum+i;
//		}
//		System.out.println(totalsum);		
	}
}
