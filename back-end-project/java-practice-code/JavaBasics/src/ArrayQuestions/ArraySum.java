package ArrayQuestions;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		
//   <<-----printing without user input --->>>>
//			int sum=0;
//     <<-----given elements--->>>>
		
//		int[] arr=new int[] {2,1,6,3,4}; 
//			
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		System.out.println("summation is: "+sum);

		
//    <<-----printing with user input --->>>>
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
////     <<-----ask user to input of array size --->>>>
//		System.out.print("Enter size of array :");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.print("Enter array elements :");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//
//		}
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//
//		System.out.println("summation is :" + sum);

		
		
		/* -----------------------practice--------------- */
		
//		print sum of the array elements
		Integer sum = 0;
		int[] arr = { 3, 21, 5, 4 };

		/* using for loop */
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//
//		}
//		System.out.println("The summation of array is :" + sum);
		
		/* using for stream */
		System.out.println("sum of elements is :"+ Arrays.stream(arr).sum());
	}

}
