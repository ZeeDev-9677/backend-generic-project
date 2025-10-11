package colllection;

public class Teachers {

	private String name;

	private Long salary;

	private String department;


	public Teachers(String name, String department, Long salary) {
		this.name=name;
		this.department=department;
		this.salary=salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Teachers [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}
