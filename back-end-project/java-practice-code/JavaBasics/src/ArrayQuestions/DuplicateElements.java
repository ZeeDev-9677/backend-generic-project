package ArrayQuestions;

import java.util.Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 4, 2, 5, 5, 1 };
		Arrays.sort(arr);
		System.out.println("Array sorted elements : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("duplicate elements are :");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}

				if (count > 0) {
					System.out.println(arr[j] + " at index : " + j);
				}
			}

		}

		
		
		/*---------------------practice------------------*/
		// duplicate print with index position
		
//		int[] a1= {2,1,5,4,3,5,1,4,1};
//		System.out.println("duplicate elements : ");
//		for(int i=0;i<a1.length;i++) {
//			for(int j=i+1;j<a1.length;j++) {
//				if(a1[i]==a1[j]) {
//					System.out.println(a1[j] +" at index "+ j);
//				}
//			}
//		}

	}

}
