package interview_questions;

import java.util.Arrays;
import java.util.List;

public class OddNumberContainOrNot {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2, 6, 8, 77, 12);
		for (Integer i : al) {
			if (i % 2 != 0) {
				System.out.println("Yes, odd number present in given list at index :" + al.indexOf(i));
				break;
			}
			
			/*
			 * al.parallelStream().anyMatch(x->x%2==0); System.out.println("Yes"); break;
			 */
		}
	}

  }
