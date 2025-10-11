package functional_interface;

public class EmployeeFunctionalMain {

	public static void main(String[] args) {
		EmployeeFunctionaInterface fi = (name, address) -> System.out
				.println("name is : " + name + " , and address is :" + address);
		fi.employeeDetails("Rahul", "Kolkata");

	}

}
