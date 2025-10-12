package intervies;

import java.util.Objects;

public class EmployeeList {
	private String empId;
	private String name;
	private String role;
	private int age;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EmployeeList(String empId, String name, String role, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.role = role;
		this.age = age;
	}

	public EmployeeList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, empId, name, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeList other = (EmployeeList) obj;
		return age == other.age && Objects.equals(empId, other.empId) && Objects.equals(name, other.name)
				&& Objects.equals(role, other.role);
	}

	@Override
	public String toString() {
		return "EmployeeList [empId=" + empId + ", name=" + name + ", role=" + role + ", age=" + age + "]";
	}

}
