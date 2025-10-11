package functional_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//--------------------------------comparator-------------------------------------------------------

//(A)->SORTING OBJECT IN THIS EXAMPLE:-

//##Note :- (1) no need to implements Comparable interface (Student not implementing Comparable interface)
//          (2) we sort objects best on our own logic (creating comparator object and pass in Collections.sort(l) for sorting)
//

class Student {
	int age;
	String s;

	public Student(int i, String s) {
		this.age = i;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", s=" + s + "]";
	}

}

public class ComparatorTesting {

	public static void main(String[] args) {
		
		/* without using lambda expression */
		
//		Comparator<Student> cmp=new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student i, Student j) {
//				if(i.age>j.age) {
//					return 1;
//				}
//				else {
//					
//					return -1;
//				}
//			}
//		};		
		
		/* using lamda expression */
		
		Comparator<Student> cmp = (i, j) -> i.age > j.age ? 1 : -1;

		List<Student> l = new ArrayList<Student>();

		l.add(new Student(23, "Sameer"));
		l.add(new Student(26, "Anmol"));
		l.add(new Student(29, "Taha"));
		l.add(new Student(24, "Rahul"));
		Collections.sort(l, cmp);
		for (Student e : l) {
			System.out.println(e);
		}

	}

}


//(B)->SORTING INTEGER IN THIS EXAMPLE:-


//public class ComparatorTesting {
//
//	public static void main(String[] args) {
//		
//
//		List<Integer> list = new ArrayList<>();
//
//		list.add(2);
//		list.add(5);
//		list.add(3);
//		list.add(4);
////		Collections.sort(l, (a,b)->a-b); //in ascending order sorting using lambda expression
//		Collections.sort(list, (a,b)->b-a); //in descending order sorting using lambda expression
//		System.out.println(list);
//
//	}
//
//}

//--------------------------------comparable---------------------------------

//##Note :- (1) need to implements Comparable interface (Student implementing Comparable interface)
//          (2) Comparable will sort objects by itself (Collections.sort(l) here sorting)
//          

//class Student implements Comparable<Student>{
//	int marks;
//	String name;
//	public Student(int marks, String name) {
//		super();
//		this.marks = marks;
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Student [marks=" + marks + ", name=" + name + "]";
//	}
//	@Override
//	public int compareTo(Student that) {
//		if(this.marks>that.marks) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
//}
//
//public class ComparatorTesting {
//
//	public static void main(String[] args) {
//		
//		List<Student> l=new ArrayList<Student>();
//		
//		l.add(new Student(300,"Abhisekh"));
//		l.add(new Student(700,"Sunny"));
//		l.add(new Student(500,"Noman"));
//		l.add(new Student(200,"Kaif"));
//		
//		Collections.sort(l);
//		for(Student s:l) {
//			System.out.println(s);
//		}
//	}
//
//}
