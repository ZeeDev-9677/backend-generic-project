package StreamApi_InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class HighestSalary {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Abdul", 21, 3000.0, "SE","+91908099393"));
		empList.add(new Employee("Karim", 19, 1000.0, "Developer","+91449945610"));
		empList.add(new Employee("Rahil", 25, 4500.0, "Manager","+9189383883"));
		empList.add(new Employee("John", 29, 1500.0, "CEO","+918979920022"));
		/* highest salary */
		Employee highest = empList.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed())
				.findFirst().get();
		System.out.print(highest);
		/* only empName will print */
//		List<String> collect = empList.stream().map(x->x.getName()).collect(Collectors.toList());
//		System.out.print(collect);

		
		
		/* second highest salary */

//		Employee secondHighest = empList.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed())
//				.skip(1).findFirst().get();
//		System.out.print(secondHighest);
		
		
		
		/* print alphabetically emp name */
		
//		List<Employee> employeeList = empList.stream().sorted(Comparator.comparing(Employee::getName))
//				.collect(Collectors.toList());
//		employeeList.forEach(n->System.out.println(n));
	
		
		
		/* third highest salary */
		
//		Employee thirdHighest = empList.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).skip(2)
//				.findFirst().get();
//		System.out.print(thirdHighest);
		
		
		/* average salary */
		
//		Double collect = empList.stream().collect(Collectors.averagingDouble(Employee::getSal));
//		System.out.println(collect);
		
//		Double collect = empList.stream().collect(Collectors.averagingDouble(Employee::getSal));
//		System.out.println(collect);
		
		/* sort the list of employee  by name */
		
//		List<Employee> listOfEmp = empList.stream().sorted(Comparator.comparing(Employee::getName))
//				.collect(Collectors.toList());
//		listOfEmp.forEach(n -> System.out.println(n));


/* get mobile numbers of employee */
		
//		List<Employee> collectList = empList.stream().sorted(Comparator.comparing(Employee::getMobile)).collect(Collectors.toList());
//		collectList.forEach(n->System.out.println(n));
		
//		*****************************NOTE for "::" *********************************
		
//		In Java 8 and later, :: is the method reference operator, used to refer to a method without executing it, allowing for concise lambda expressions. 
//		Here's a breakdown:
//		What it does:
//		It's a shorthand way to express a lambda expression when the lambda's body is simply a call to an existing method. 
//		How it works:
//		It allows you to directly reference a method (either static or instance) by its name, rather than writing out the entire lambda expression. 
//		Examples:
//		Static method reference: ClassName::methodName (e.g., String::toUpperCase) 
//		Instance method reference: object::methodName (e.g., myObject::myMethod) 
//		Instance method reference (arbitrary object): ClassName::methodName (e.g., String::equals) 
//		Benefits:
//		Makes code more readable and compact, especially when using functional interfaces with streams and other lambda-based feature
	}

}
