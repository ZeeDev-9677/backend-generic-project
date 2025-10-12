package intervies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaleFemaleEmployeeMain {

	public static void main(String[] args) {
		List<MaleFemaleEmployee> empList = Arrays.asList(
				new MaleFemaleEmployee("Ak", 23, "Male",40000.0),
				new MaleFemaleEmployee("Zareen", 56, "Female",30000.0),
				new MaleFemaleEmployee("Raju", 34, "Male",20000.0),
				new MaleFemaleEmployee("Amani", 22, "Female",45000.0), 
				new MaleFemaleEmployee("Raani", 67, "Female",50000.0),
				new MaleFemaleEmployee("Rahul", 19, "Male",55000.0), 
				new MaleFemaleEmployee("Priya", 23, "Female",20000.0),
				new MaleFemaleEmployee("Rathore", 78, "Male",90000.0));
		/* count number of male and female in list */
		Map<String, Long> countEmp = empList.stream()
				.collect(Collectors.groupingBy(MaleFemaleEmployee::getGender, Collectors.counting()));
	System.out.println(countEmp);
	
	/* highest male salary*/
	Optional<MaleFemaleEmployee> highestMaleSalary = empList.stream().filter(x -> x.getGender().equals("Male"))
			.max(Comparator.comparingDouble(MaleFemaleEmployee::getSalary));
	
	/* highest female salary*/
	Optional<MaleFemaleEmployee> highestFemaleSalary = empList.stream().filter(x -> x.getGender().equals("Female"))
			.max(Comparator.comparingDouble(MaleFemaleEmployee::getSalary));
	
//	System.out.println(highestMaleSalary);
	highestMaleSalary.ifPresent(System.out::println);
	highestFemaleSalary.ifPresent(System.out::println);
//	System.out.println(highestFemaleSalary.orElse(null));
	}

}
