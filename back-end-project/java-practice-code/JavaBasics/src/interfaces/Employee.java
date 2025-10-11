package interfaces;

public class Employee implements EmployeeInterface,EmployeeInterface1,EmployeeInterface2{

	public static void main(String[] args) {
		Employee e=new Employee();
//		EmployeeInterface e=new Employee();
		e.Test1();
		e.Test2();
		e.Test3();
		
		
//		e.x=24;
//		e.name="Tanmoy";

		
	}

	@Override
	public void Test3() {
		System.out.println("Test3..");
		
	}

	@Override
	public void Test2() {
		System.out.println("Test2..");
		
	}

	@Override
	public void Test1() {
		System.out.println("Test1..");
		
	}
	
}

