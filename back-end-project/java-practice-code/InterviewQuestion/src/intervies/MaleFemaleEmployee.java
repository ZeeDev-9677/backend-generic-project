package intervies;

public class MaleFemaleEmployee {
	private String name;
	private int age;
	private String gender;
	private Double salary;
	private String disease;

	public void setDisease(String disease) {
		this.disease=disease;
	}
	public String getDiease() {
		return disease;
	}
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public MaleFemaleEmployee(String name, int age, String gender, Double salary, String disease) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "MaleFemaleEmployee [name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary
				+ ", disease=" + disease + "]";
	}

}
