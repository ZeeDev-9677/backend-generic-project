package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {
	int c=0;
	public boolean isPrime(int num) {
		
		for(int i=1;i<num/2;i++) {
			c++;
		}
		if(c>2) {
			System.out.println("NOT PRIME");
		}
		else {
			System.out.println("PRIME");
		}
		return false;
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,1,6,9);
		
//		 list.stream().anyMatch(this::isPrime);
		System.out.println("even number is =");
	}

}
