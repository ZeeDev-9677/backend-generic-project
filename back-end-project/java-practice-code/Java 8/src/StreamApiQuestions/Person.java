package StreamApiQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Average age of person using stream api
*/
public class Person {
//	String n;
//	int a;
//
//	public Person(String name, int sal) {
//		/* System.out.println("printed my cons!!!"); */ // checking constructor call
//		this.n = name;
//		this.a = sal;
//	}

	public static void main(String[] args) {
//		List<Person> person = Arrays.asList(new Person("Amago", 45), new Person("Dyne", 30), new Person("Lara", 23));
////		Double p = person.stream().collect(Collectors.averagingInt(x -> x.a));
//		Optional<Person> first = person.stream()
//				.sorted(Comparator.comparingInt(x->x.);
//
//		System.out.println("the avg of persons:" + first);

		/*
		 * ------------Basic method os stream api below for learning
		 * purpose---------------
		 */
		List<Integer> list = Arrays.asList(2,1,5);

		/* map() method:- */
//		List<Integer> collect = list.stream().sorted().map(x->x*2).collect(Collectors.toList()); 
//		System.out.println("result is:"+collect);

		
		/* count() method:- (provide the size of the stream) */
//		long count = list.stream().count();
//		System.out.println("size is :"+count);

		/* sorted():-(sort the stream and provide new stream after sorting) */

		Stream<Integer> dataNum = list.stream();
//		dataNum.sorted().forEach(n -> System.out.println(n));
//		  dataNum.sorted().forEach(n->System.out.println(n)); o/p-> will throw error "stream has already been operated upon or closed
//"
//		Predicate<Integer> predi =  n ->n%2==0;
//		
//		list.stream().filter(predi).forEach(n->System.out.println(n));
		
		
		
		/*
		 * reduce() method:- (to sum up the value 2,3,4-> o/p=9)
		 */	

		Integer reduce = list.stream().sorted().map(x -> x * 2).reduce(0, (c, e) -> c + e);
		System.out.println("sum up is:" + reduce);
	}

}
