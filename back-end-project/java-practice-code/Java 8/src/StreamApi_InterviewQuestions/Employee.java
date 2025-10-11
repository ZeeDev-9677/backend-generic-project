package StreamApi_InterviewQuestions;

public class Employee {

	private String name;
	private int age;
	private Double sal;
	private String role;

	private String mobile;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Employee(String name, int age, Double sal, String role, String mobile) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.role = role;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + ", role=" + role + ", mobile=" + mobile
				+ "]";
	}

}
