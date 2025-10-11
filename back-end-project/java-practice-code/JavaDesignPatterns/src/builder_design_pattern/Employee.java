package builder_design_pattern;

public class Employee {

	private final String name;
	private final String email;
	private final int age;

	public Employee(EmployeeBuilder employeeBuilder) {

		this.name = employeeBuilder.name;
		this.email = employeeBuilder.email;
		this.age = employeeBuilder.age;

	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "EmployeeBuilder [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	static class EmployeeBuilder {
		private String name;
		private String email;
		private int age;

		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public Employee build() {
			Employee employee = new Employee(this);
			return employee;
		}

	}
}
