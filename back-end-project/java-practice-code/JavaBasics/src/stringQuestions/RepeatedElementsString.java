package stringQuestions;

import java.util.Arrays;

public class RepeatedElementsString {

	public static void main(String[] args) {
		String str="abdvdcc";
		int i,j;
		char[] cr=str.toCharArray();
		
		Arrays.sort(cr);
		System.out.print("Array after sorting : ");
		System.out.println(cr);
		System.out.println("Repeated elements are : ");
		for( i=0;i<cr.length;i++) {
			 int count=1;
			for( j=i+1;j<cr.length;j++) {
				if(cr[i]==cr[j]) {
					count++;
				}
				else {
					break;
				}
			}
			i=j-1;
			if(count>1)
//	for replacing the repeated elements with * or any character in given string and comment out the abv line 26 which is i=j-1
//			{
//				cr[i]='*';
//			}
//			System.out.print(cr[i]);
			System.out.println(cr[i]+"="+count);
			
		}
	}

}
