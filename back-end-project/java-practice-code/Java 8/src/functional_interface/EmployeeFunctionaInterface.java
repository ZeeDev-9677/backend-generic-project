package functional_interface;

@FunctionalInterface
public interface EmployeeFunctionaInterface {

	void employeeDetails(String name,String address);

	default void employeeSal() {
		System.out.println("salary...");
	}
	
	static void employeeCompany() {
		System.out.println("company..");
	}
}
