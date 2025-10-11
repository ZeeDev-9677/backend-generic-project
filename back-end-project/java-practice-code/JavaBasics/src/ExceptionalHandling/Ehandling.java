package ExceptionalHandling;

import java.io.IOException;

public class Ehandling {

	public static void main(String[] args){
		
		/* NullpointrException error */

////		int a=5,b=2,c;
//		String s=null;
//		String s1=s;
//		try {
////		 c=a/b;
//		 System.out.println("ans is =" +s1.length());
//		}
//		catch(ArithmeticException e) {
//			System.out.println(" hello dekho ye hai =" + e);
//		}
//		catch(NullPointerException e1) {
//			System.out.println(" ye hai =" + e1);
//		}
//		finally {
//			System.out.println("me bhi hu!!");
//		}

		/* Array indexOutOfBond exception */

//		int[] arr = { 3, 19, 7, 35, 9 };
//		try {
//			for (int x : arr)
//				System.out.println(arr[x]);
//		} catch (NullPointerException e) {
//			System.out.println(" dekho " + e.getMessage());
//		} catch (ArithmeticException e1) {
//			System.out.println(" dekho " + e1);
//		} catch (ArrayIndexOutOfBoundsException e2) {
//			System.out.println(" ye sb " + e2);
//		}
		
		
		
		/* ArithmeticException example */
		
//		int cb=200;
//		int wb=500;
//		 cb=cb-wb;
//		 try {
//			 if(cb<wb)
//				 throw new ArithmeticException("Insufficient Balance.");
//			 
//		 }
//		 catch(ArithmeticException e) {
//			 System.out.println(e.getMessage());
//			 System.out.println("Cuurent Balance is :"+cb);
		
		
		
		/* IOException example */
		
		System.out.println("suna zara ");
		 try {
			 
				 throw new IOException("Hello hii");
			 
		 }
		 catch(IOException e) {
			 System.out.println(e.getMessage());
		 }
		
		
	}

}
