package stringQuestions;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		/*------------------------normal way-------------------*/
		
//		String s = "Hello I Love Java";
//		String[] words = s.split(" ");
//		String result = "";
//		for (String x : words) {
//			String rev = "";
//			for (int i = x.length() - 1; i >= 0; i--) {
//				rev = rev + x.charAt(i);
//			}
//			result = result + rev + " ";
//
//		}
//		System.out.print(result.trim());
		
		/*------------------------using StringBuilder(mutable string)-------------*/

//		String s="Hello World";
//		String[] spl = s.split(" ");
//		StringBuilder sb=new StringBuilder();
//		for(String x:spl) {
//			String str = new StringBuilder(x).reverse().toString();
//			sb.append(str).append(" ");
//		}
//		System.out.println(sb);
	}

}
