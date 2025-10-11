package builder_design_pattern;

public class EmployeeMain {

	public static void main(String[] args) {
//		Employee employee = new Employee.EmployeeBuild().setName("Zakir").setEmail("abc@gmail.com").setAge(46).build();
//		System.out.println(employee);

		
		Employee employee = new Employee.EmployeeBuilder()
				.setName("Tanmoy")
				.setEmail("Tn@gmail.com")
				.setAge(45).build();
	 System.out.println(employee);
	}

}
