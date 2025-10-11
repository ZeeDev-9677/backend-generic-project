package StreamApi_InterviewQuestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntegerQns {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(23,45,1,2,8,89);
		
		/*
		 * will return min max avg sum below because it has by default mentioned methods
		 * in stream api methods=summarizingInt()
		 */

		IntSummaryStatistics collect = lst.stream().collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println("ans :"+collect);
	}

}
