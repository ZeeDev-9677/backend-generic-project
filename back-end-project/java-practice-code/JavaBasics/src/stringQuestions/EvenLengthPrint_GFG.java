package stringQuestions;

public class EvenLengthPrint_GFG {

	public static void main(String[] args) {
		/* print string having string length is even */
		
		      /* GFG logic */
		
//		String str = "This is a Books pens";
//		for (String x : str.split(" ")) { /* splitting string by space into array of strings */
//			if (x.length() % 2 == 0) {
//				System.out.print(x + " ");
//			}

//-------------------------------------------------------------------------	
		        /* My logic */
		
			  String myStr = "This is a old book"; 
				String[] s = myStr.split(" "); /* splitting string by space into array of strings */
			  for(int i=0;i<s.length;i++) { 
				  if(s[i].length()%2==0) {
					  System.out.print(s[i]+" "); 
			  }
			 
		}
	}

}
