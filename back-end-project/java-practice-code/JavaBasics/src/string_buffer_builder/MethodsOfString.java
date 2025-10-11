package string_buffer_builder;

public class MethodsOfString {

	public static void main(String[] args) {
		//-------------------------------------------------------concat()--------------------------
//		String s1="Apple Color is Red";
//		String s2="Mango Color is yellow";
//		String s3="Mango Color is yellow";
////
//		String result=s2+s3;
////		System.out.println(s2.hashCode());     //checking hascode for different obj created or not for string literal
//		System.out.println(result);
//		String cn=s1.concat(" ").concat(s2);  // Concat
//		System.out.println(cn.hashCode());  //checking hascode for different obj created or not for string literal
//		System.out.println(s1.hashCode());
//		System.out.println(cn);
//------------------------------------------------------.equals()--------------------------
//		String s1="Mango Color is yellow";
//		String s2="Mango Color is yelQWlow";
//		System.out.println(s1.equals(s2)); //.equals method.
		
//------------------------------------------------------split()----------------------------
		
//		String sp="Hello,Wolrd,Java";
//		
//		String[] str = sp.split(",");
//		for(String e:str) {
//			System.out.println(e);
//		}
		
//--------------------------------------------replace()--------------------------------------------		
		
		
//		String str="Hi,, there, please please check my msg.";
////		
////   	String replaceStr = str.replace(",", "-"); //replace any single character replace at throughout the string
//		String replaceStr = str.replaceFirst("\\s","_"); //replace any single character occurrence from beginning to end string
////		String replaceStr1 = str.replaceAll("\\s","z"); //replace any charSequence occurrence from beginning to end string
//		System.out.println(replaceStr); 
////		System.out.println(replaceStr1); 
		
		//replace, replaceAll(), replaceFirst() only three method present in string of type replace method
		
//----------------------------------------------compareTo()----------------------------------------------------
		
//		compareTo() will lexicographically comparing string (i.e-> dictionary order)
//		String a1="Grapes";
//		String a2="Grases"; 
////		
//		System.out.println(a1.compareTo(a2)); //negative value will return bcos a1<a2;
//		System.out.println(a2.compareTo(a1)); //positive value will return bcos a2>a1;
//		System.out.println(a1.compareTo("Grapes"));  // 0 will return bcos both are equal
		
//----------------------------------------------intern()----------------------------------------------------
		
//		intern() -> method help to move object from heap to scp
//		String m1=new String("Animal");
//		String m2= m1.intern();
//		
//		String m3="Animal";
//		
//		System.out.println(m2==m3); //return "true"->bcoz m1 move to SCP(string constant pool) and already m3 present in SCP 

//----------------------------------------------substring()----------------------------------------------------
//		substring()->method to extract string from existing string
		String s1="Hey, Bro how are you!!";
//		String s2=s1.substring(3); //extracting from index 3 which is ","
//		System.out.println(s2);
		
		
		String s3 = s1.substring(2, 9); //extracting from index 3 to 6(i.e excluding 6 pos, hence will take till 5) which is "," to "B"
		System.out.println(s3);
		
		
		String str="Hey, Bro how are you Bro";
		CharSequence subStr = str.subSequence(9, 24); //extracting from index 9("B") to 24(i.e excluding 24 pos) 
		System.out.println(subStr);
		
	}

}
