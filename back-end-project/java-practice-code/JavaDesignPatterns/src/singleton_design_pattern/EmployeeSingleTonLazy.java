package singleton_design_pattern;

public class EmployeeSingleTonLazy {
	private static EmployeeSingleTonLazy employeeSingleTonLazy;

	private EmployeeSingleTonLazy() {
		System.out.println("Hello, I am constructor...");
	}

	public static EmployeeSingleTonLazy getEmployeeSingleTonLazy() {
		/*
		 * we are creating object of a class("EmployeeSingleTonLazy") when
		 * "getEmployeeSingleTonLazy()" method call and it is not thread safe because
		 * every thread it will create new object every time when
		 * "getEmployeeSingleTonLazy" method call happen to restrict this we need to
		 * apply synchronized before creating new object. suppose if T1 executing the
		 * process for creation of object then T2 will wait for until T1 process to be completed and when T1
		 * execute then T2 will face object is not null. 
		 *   T1 =thread1 ,T2 =thread2
		 */
		if (employeeSingleTonLazy == null) {
			synchronized (EmployeeSingleTonLazy.class) {
				if (employeeSingleTonLazy == null) {
					employeeSingleTonLazy = new EmployeeSingleTonLazy();
				}
			}
		}
		return employeeSingleTonLazy;

	}
}
