package string_buffer_builder;

public class StringBuilders {

	public static void main(String[] args) {
		
//		-----------------insert()------------
//		StringBuilder sb=new StringBuilder("Hii, Hello");
//		System.out.println(sb.hashCode());
//		System.out.println(sb);
////		StringBuilder insert = sb.insert(2, 'y'); //inserting at specified index 2 of character 'y'
//		StringBuilder sb1=sb.insert(2, "Uu");
//		System.out.println(sb1.hashCode());
//		System.out.println(sb);
//		
//		System.out.println("-------------------------------------------------------");
//		
//		
//		String s1=new String("Hii, Hello");
//		System.out.println(s1.hashCode());
//		System.out.println(s1);
//		String s2=s1.concat("Tanmoy");
//		System.out.println(s2.hashCode());
//		System.out.println(s1);
//		System.out.println(s2);
		
		
//		-----------------append()------------
//		StringBuilder sb=new StringBuilder("Hii, Youtube");
//		StringBuilder appd = sb.append(", bro"); //append at the end of existing string
//		System.out.println(appd);
		
		
//		-----------------replace()------------
//		StringBuilder sb=new StringBuilder("Hello, Youtube");
//		StringBuilder rplc = sb.replace(2, 7, "Bro");   
														/*
														 * replace part of existing string with provided string along with
														 * passing startIndex and endIndex position.
														 */
		
//		System.out.println(rplc);
		
		
		
//		-----------------delete()------------
//		StringBuilder sb=new StringBuilder("Hello, BrotherHLK");
//		StringBuilder dlt = sb.delete(3, 8);  // delete the string from specified startIndex and endIndex.
//		System.out.println(dlt);
//		StringBuilder dlt1 = sb.deleteCharAt(9) ; // delete the string from specified startIndex and endIndex.
//		
//		System.out.println(dlt1);
		
		
//		-----------------capacity()------------
//		StringBuilder sb=new StringBuilder("Hello, hii");
//		System.out.println(sb.capacity());
//		sb.append("Tanmoy");// delete the string from specified startIndex and endIndex.
//		sb.append("jhbsdiio");
//		System.out.println(sb.capacity());

		
//		----------------------------------------comparison time execution------------------------
		StringBuffer sbf=new StringBuffer();
		long start1, end1;
		start1 = System.nanoTime();
		for(int i=0;i<100000;i++) {
			sbf.append("tanm");
		}
		end1=System.nanoTime();
		
		System.out.println("execution time for sbuffer is end1 -start1 :"+(end1-start1));
		
		StringBuilder sb=new StringBuilder();
		long start, end;
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			sb.append("tanm");
		}
		end=System.nanoTime();
		
		System.out.println("execution time for sbuilder is end -start :"+(end-start));
		
		System.out.println("--------------------------");
		
		
		
	}

}
