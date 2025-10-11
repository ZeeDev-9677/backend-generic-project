package singleton_design_pattern;

public class SingleTonDesignMain {

	public static void main(String[] args) {
		
		/******************************SingleTonLazy pattern *************************************/
//		 new EmployeeSingleTon();
		/*
		 * throwing error in new EmployeeSingleTon();, because we are setting
		 * constructor as private of EmployeeSingleTon class and to restrict to no new
		 * object creation further happen.
		 */
//		EmployeeSingleTonLazy employeeLazy1 = EmployeeSingleTonLazy.getEmployeeSingleTonLazy();
//		System.out.println(employeeLazy1.hashCode());
//		EmployeeSingleTonLazy employeeLazy2 = EmployeeSingleTonLazy.getEmployeeSingleTonLazy();
//		System.out.println(employeeLazy2.hashCode());

		/*
		 * checking HashCode of each object, if the HashCode is same for all object then
		 * no new object creating hence it is proved.
		 */
//		EmployeeSingleTonLazy employeeLazy3 = EmployeeSingleTonLazy.getEmployeeSingleTonLazy();
//		System.out.println(employeeLazy3.hashCode());

		
		/******************************SingleTonEager pattern *************************************/
		
		EmployeeSingleTonEager employeeEager1 = EmployeeSingleTonEager.getEmployeeSingleTonEager();
		System.out.println(employeeEager1.hashCode());
		
		EmployeeSingleTonEager employeeEager2 = EmployeeSingleTonEager.getEmployeeSingleTonEager();
		System.out.println(employeeEager2.hashCode());
	}

}
