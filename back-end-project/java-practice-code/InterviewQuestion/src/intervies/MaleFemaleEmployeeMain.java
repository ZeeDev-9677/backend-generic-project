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
				new MaleFemaleEmployee("Manoj", 23, "Male",40000.0,"Corona"),
				new MaleFemaleEmployee("Zareen", 56, "Female",30000.0,"Heart"),
				new MaleFemaleEmployee("Raju", 34, "Male",20000.0,"Kidney"),
				new MaleFemaleEmployee("Amani", 22, "Female",45000.0,"Corona"), 
				new MaleFemaleEmployee("Raani", 67, "Female",50000.0,"Corona"),
				new MaleFemaleEmployee("Rathore", 78, "Male",10000.0,"Bones"),
				new MaleFemaleEmployee("Rahul", 19, "Male",55000.0,"Corona"), 
				new MaleFemaleEmployee("Priya", 23, "Female",20000.0,"Corona")
				);
				/* && x.getAge()>25)= will print corona patient having age >25 */
		List<MaleFemaleEmployee> ls = empList.stream().filter(x -> x.getDiease().equalsIgnoreCase("Corona") && x.getAge()>25)
						.collect(Collectors.toList());
		
		/* print average salry having age <25 corona patient */
		Double d = empList.stream().filter(x -> x.getDiease().equalsIgnoreCase("Corona") && x.getAge()<25)
				.collect(Collectors.averagingDouble(MaleFemaleEmployee::getSalary));
		System.out.println(d);
		
		
		/* count each patient type */
		Map<String, Long> c = empList.stream()
				.collect(Collectors.groupingBy(MaleFemaleEmployee::getDiease, Collectors.counting()));
		System.out.println(c);
		
		/* print only name having Corona disease */
		
		System.out.println("Below name having only corona disease are :");
		for (MaleFemaleEmployee s : ls) {

			System.out.println(s.getName() + " ");
		}
		
		/* count number of male and female in list */
		Map<String, Long> empCount = empList.stream()
				.collect(Collectors.groupingBy(MaleFemaleEmployee::getGender, Collectors.counting()));
		System.out.println(empCount);
		
		/* highest Employee salary in all*/
//		MaleFemaleEmployee highestEmployeeSalary=empList.stream().sorted(Comparator.comparingDouble(MaleFemaleEmployee::getSalary).reversed()).findFirst().get();
//		System.out.println(highestEmployeeSalary);
		
	/* highest male salary*/
	Optional<MaleFemaleEmployee> highestMaleSalary=empList.stream().filter(x->x.getGender().equalsIgnoreCase("Male")).max(Comparator.comparingDouble(MaleFemaleEmployee::getSalary));
	
	
	/* highest female salary*/
	Optional<MaleFemaleEmployee> highestFemaleSalary = empList.stream().filter(x -> x.getGender().equals("Female"))
			.max(Comparator.comparingDouble(MaleFemaleEmployee::getSalary));
//	
	System.out.println("male highestMaleSalary ->:"+highestMaleSalary.orElse(null));
	
	/* to avoid null case */
//	highestMaleSalary.ifPresent(System.out::println);
	
	/* to avoid null case */
//	highestFemaleSalary.ifPresent(System.out::println);
	System.out.println("male highestFemaleSalary ->:"+highestFemaleSalary.orElse(null));
	}
}
