package interview_questions;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementStreamApi {

	public static void main(String[] args) {

		List<Integer> list = List.of(2, 5, 1, 7, 3, 8, 2, 5, 3, 7, 8);
		Set<Integer> nl = list.stream().filter(x -> Collections.frequency(list, x) > 1).collect(Collectors.toSet());
		System.out.println("duplicates elements are :" + nl);
	}

}
