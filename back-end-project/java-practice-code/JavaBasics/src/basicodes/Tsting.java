package basicodes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//
//import java.math.BigInteger;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Random;
//import java.util.random.RandomGeneratorFactory;

public class Tsting {
	

	public static void main(String[] args) {
//		List<String> lst=new ArrayList<String>();
//		lst.add("akks");
//		lst.add("zee");
//		
//		//arraylist to array
//		
//		//String[] str=lst.toArray(new String[lst.size()]) ;
//		String[] str=new String[lst.size()];
//		for(int i=0;i<lst.size();i++) {
//			str[i]=lst.get(i);
//		}
//		System.out.println(Arrays.toString(str));
		
		//Random Number generate 19-digits with combination of yyddmm
		
//		Random random=new Random();
//		int randomNumber=random.nextInt(1000000);
//		
//		SimpleDateFormat dateFormat=new SimpleDateFormat("yyddMM");
//		String currentDate=dateFormat.format(new Date());
//		
//		String result=String.format("%06d%s", randomNumber, currentDate);
//		
////		return result;
//		
//		System.out.println("Generated number is: "+ result);
	
	
		
		// Generate a random 12-digit number
//        long randomNumber = generateRandomNumber();

//        Random random = new Random();
//        
//        BigInteger upb=9999999999999;
//        BigInteger int_rnd=RandomGeneratorFactory<RandomGenerator>;
//        // Get the current date in yyddmm format
//        String datePattern = new SimpleDateFormat("yyddMM").format(new Date());
//
//        
////        long number= Math.abs(random.nextLong() % 1_000_000_000_0000L);
//        // Combine the random number and date pattern to form a 19-digit string
//        String result = datePattern+String.valueOf(int_rnd);
//
//        System.out.println("Generated 19-digit random number: " + result);

		
		long min = 1000000000000L; //13 digits inclusive
		long max = 10000000000000L; //14 digits exclusive
		Random random = new Random();
		long number = min+((long)(random.nextDouble()*(max-min)));
		
		 String datePattern = new SimpleDateFormat("yyddMM").format(new Date());
        
		 String result = datePattern + String.valueOf(number);
		 
//		Integer upb=999999999;
//		Integer int_rnd=random.nextInt(upb);
		System.out.println("Generated num: "+result);
		
	}
	 


}
