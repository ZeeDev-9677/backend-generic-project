package stringQuestions;

import java.util.Scanner;

public class InsertString_GFG {

	public static void main(String[] args) {
		/*Java String Program to Insert a String into Another String*/
		/* Explanation: Adding the new String to orignal String at the index given. */
		
		
//-----------------using Buffer.insert() method------------------------------------		
//		String str="GeeksGeeks";
//		int indexNum=4;
//		
//		StringBuffer sb=new StringBuffer(str);
//		sb.insert(indexNum + 1,"For");
//		System.out.println(sb);
		
//---------------------without using any pre-defined method---------------------------------
//		String oldStr = "GeeksGeeks";
//		int indexNum = 4;
//		String newStr = "";
////		String stringToBeInserted="Hi";
//
//		for (int i = 0; i < oldStr.length(); i++) {
//			newStr = newStr + oldStr.charAt(i);
//			if (i == indexNum) {
//				newStr = newStr + "In";
//			}
//		}
//		System.out.println(newStr);
		
		/*---------------------practice------------------------*/
		
//		insert character in string
		String s = "Appe";
		int index = 3;
		char ch = 'l';

		String str = s.substring(0, index) + ch + s.substring(index);
		System.out.println("new string is :" + str);

	}

}
