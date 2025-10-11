package java_beginners_code;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestions {

	public static void main(String[] args) {

		/* Frequencies of each elements */

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the array elements!!");
//		int[] arr = new int[5];
//		int m = 0;
//		int visited = -1;
//		while (m != arr.length) {
//			arr[m] = sc.nextInt();
//			m++;
//		}
//		System.out.println("The frequency of array elements is=");
//		for (int i = 0; i < arr.length; i++) {
//			int c = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					c++;
//					arr[j] = visited;
//					/*
//					 * visited elements will not be count again once OR To avoid counting same
//					 * element again
//					 */
//
//				}
//
//			}
//
//			if (arr[i] != visited)
//				System.out.println(arr[i] + " is " + c + " Times ");
//
//		}

//	Scanner sc=new Scanner(System.in);
//	int[] arr=new int[5];
//	for(int i=0;i<arr.length;i++)
//	{
//		arr[i]=sc.nextInt();
//	}
//	System.out.println("The greatest OR smallest element is: ");
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=0;j<arr.length;j++)
//		{
//			if(arr[i]>arr[j])
//			{
//				arr[i]=arr[j];
//				arr[j]=arr[i];
//			}
//		}
//	}
//	System.out.println(arr.length-1);
//	//System.out.println(arr[0]);

		/* using normal array to sort the elements */
//		int[] arr = { 7, 3, 6, 1, 5 };
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.print(arr[i]+" ");
//		}

		/* using ArrayList sorting elements */

//		List<Integer> list= Arrays.asList(5,1,6,2,8);
//		Collections.sort(list);
//		System.out.println(list);

		String str="apple";
		char[] ch=str.toCharArray();
		char[] tm=new char[ch.length];
		
		
//		char vistd=' ';
		for(int i=0;i<ch.length;i++) {
			int count =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
					}
			}
			if( count>1 && ch[i]!=' ') {
				System.out.println(ch[i]+" "+count);
			}
			
		}
//		System.out.print("repeated elements are:");
//		for(int k=0;k<tm.length;k++) {
//			if(tm[k]!=0)
//			System.out.print(tm[k]);
//		}

		
	}

}
