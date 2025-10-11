package ArrayQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemove {

	public static void main(String[] args) {
		
//		**** remove duplicates using normal way******
//		
//		int[] arr=new int[] {3,5,1,3,2,5};
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr[j]=-1;
//				}
//			}
//		}
//			System.out.println("Array without duplicates: ");
//			for(int k=0;k<arr.length;k++) {
//				if(arr[k]!=-1) {
//					System.out.println(arr[k]);
//				}
//			}
//		
//	}
		
//		****************removed duplicates using HashSet***********
//	      int[] array = {3,1,8,4,1,3,9,5,4};
//
//	        Set<Integer> set = new HashSet<>();
//
//	        for (int num : array) {
//
//	            set.add(num);
//
//	        }
//
//	        System.out.println("Array without duplicates: " + set);
		
//		int[] arr= {2,1,6,2,6,17,9};
		
		List<String> arr = Arrays.asList("Apple","Banana","Banana","Kiwi");
		System.out.println("before remove : "+arr);
		Set<String> st=new TreeSet<String>();
		for(String x:arr) {
			st.add(x);
		}
		System.out.print("After remove: ");
		System.out.println(st);

		
	}
}
