package oops;

public class EncapsulationMain {

	public static void main(String[] args) {
		EncapsulationEmployee emp = new EncapsulationEmployee();
		emp.setEmpName("Joseph");
		emp.setAge("25");
		System.out.println("My name is :" + emp.getEmpName() + ", and my age is :" + emp.getAge());
	}

}
