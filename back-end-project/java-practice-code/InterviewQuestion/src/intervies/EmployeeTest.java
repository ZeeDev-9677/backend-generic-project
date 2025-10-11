package intervies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employeeData = getAllEmployeeData();

		// It will return count the no of male and female eg; male:6 female:7

		Map<String, Long> collect = employeeData.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect);
		
		//It will return list of employees departments
		Set<String> collect2 = employeeData.stream().map(e -> e.getDepartment()).collect(Collectors.toSet());
		System.out.println(collect2);

		// It will return list of employees
		/*
		 * List<String>
		 * str=employeeData.stream().map(e->e.getName()).collect(Collectors.toList());
		 * System.out.println(str);
		 */
		// It will return non repeated salary
		Set<Double> str1 = employeeData.stream().map(e -> e.getSalary()).collect(Collectors.toSet());
		System.out.println(str1);
	}

	public static List<Employee> getAllEmployeeData() {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brien", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(112, "Alex", 35, "Male", "Finance", 2011, 45000.0));
		employeeList.add(new Employee(113, "John", 36, "Female", "Developer", 2023, 89000.0));
		employeeList.add(new Employee(114, "Ontarion", 28, "Male", "Tester", 2012, 90000.0));
		employeeList.add(new Employee(115, "Max", 67, "Male", "Admin", 2013, 88000.0));
		employeeList.add(new Employee(116, "Peter", 45, "Female", "CHO", 2016, 99000.0));
		employeeList.add(new Employee(117, "Patrick", 21, "Female", "MR", 2020, 78000.0));
		employeeList.add(new Employee(118, "Ravin", 43, "Male", "BPO", 2021, 20000.0));
		employeeList.add(new Employee(119, "WIlliam", 78, "Male", "BPO", 2022, 24000.0));
		employeeList.add(new Employee(120, "Thomas", 56, "Female", "Head", 2023, 28000.0));
		employeeList.add(new Employee(121, "Martin", 32, "Male", "Support", 2010, 21000.0));
		employeeList.add(new Employee(122, "Munro", 66, "Male", "Vendor", 2019, 29000.0));
		employeeList.add(new Employee(123, "Hemant", 40, "Female", "QA", 2018, 29000.0));
		return employeeList;
	}
}
