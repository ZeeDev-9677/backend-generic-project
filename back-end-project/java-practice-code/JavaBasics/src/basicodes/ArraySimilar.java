package basicodes;

import java.util.Arrays;

//inp arr1=[4,2,5,1]
//    arr2=[1,2,4,5]
//    output= arrays similar because size and same elements are there in both the arrays.
public class ArraySimilar {

	public static void main(String[] args) {

		int[] arr1 = { 4, 2, 5, 9, 1, 89 };
		int[] arr2 = { 1, 2, 4, 5, 9, 89 };
		int n = arr1.length;
		int m = arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (n == m) {
			for (int i = 0; i < n; i++) {
				boolean flag = false;
				for (int j = 0; j < m; j++) {
					if (arr1[i] == arr2[j]) {
						flag = true;
						break;
					}

				}
				if (flag == false) {
					System.out.println("Arrays are not same..");
					break;
				}

			}

		} else {
			System.out.println("Arrays are different in size");
		}
	}
}
