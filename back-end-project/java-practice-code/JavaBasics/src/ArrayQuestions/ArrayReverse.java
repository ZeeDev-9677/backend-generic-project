package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {

		// <<<<-----without using arraylist------>>>>>

//		int[] arr=new int[] {2,6,1,8,9};
//		int n=arr.length;
//		for(int i=n-1;i>=0;i--) {
//			System.out.print(arr[i]);
//			
//		}

		
		
		
		// <<<<-----reverse array elements with using arraylist type 1------>>>>>

		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(34);
		arrList.add(12);
		arrList.add(67);
		arrList.add(89);
		arrList.add(77);
//		arrList.remove(1); //1 is index position of 12 (deleted using index position)
//		arrList.remove(Integer.valueOf(67)); //67 value of 3 index position(deleted using value) 
		
		
		
		
		
//		List<Integer> arrList = Arrays.asList(3,1,6,12,11); //for testing purpose Arrays.asList()
		
		/* reverse using for loop only reverse output but not reverse list*/
//		int n = arrList.size();
//		System.out.print("elements are :");
//		for (int i = n - 1; i>=0; i--) {
//			System.out.print(arrList.get(i)+" ");
//		}
		
		
		
		
		
		/* reverse using for loop, Actually reverse (swap elements inside the list)*/
//		for(int i=0;i<arrList.size()/2;i++) {
//			Integer temp = arrList.get(i);
//			arrList.set(i, arrList.get(arrList.size()-1-i)); //i=0, value=77
//			arrList.set(arrList.size()-1-i, temp); //arrList.size()-1-i=4, value=34
//			
//		}
//		System.out.println(arrList);

		/* reverse using in-built Collections.reverse() method which is inside ArrayList, will return list*/
//		System.out.println("before reverse :"+arrList);
//        Collections.reverse(arrList);
//        System.out.println("after reverse :"+arrList);
        
        
		
		
		
		
//		<<<<-----with using arraylist type 2------>>>>>

//		List<Integer> arrList1 = new ArrayList<Integer>();
//		for (int i = 5; i>0; i--) {
//			arrList1.add(i);
//		}
//		System.out.println("elements are :" + arrList1);
		
		
		
//	----------------------it will print those value added one by one through arraylist-----------------


	    List<Integer> ar= Arrays.asList(2,5,1);
//		int[] arr = { 4, 8, 9, 1, 3 };
//		int n = arr.length();
	    
//		int tem;
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] > arr[j]) {
//					tem = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tem;
//				}
//			}
//			System.out.println(arr[i]);
//		}
//
//		char[] ch = new char[n];
//		for (int i = 0; i < ch.length; i++) {
//			ch[i] = String.valueOf(arr[i]).charAt(0);
//		}
//		System.out.println(Arrays.toString(ch));
		
		
		
		/*---------------------normal for loop sorting by swapping greater among------------*/
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//					
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			
//			System.out.print(arr[i]+" ");
//		}
		
//--------------------------------------------------------------preparation-------------------------		
		/* reverse done */
		
//		int[] arr= {10,9,11,8,12};
//		Arrays.sort(arr);	
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		/* duplicate array elements check */
		
//		Integer[] ar = { 2, 4, 1, 5 ,4};
//		Set<Integer> st = new HashSet<Integer>();
//		for (int x : ar) {
//			if (st.add(x) == false) {
//				System.out.println(x+" present duplicated");
//
//			}
//		}
	}
}
