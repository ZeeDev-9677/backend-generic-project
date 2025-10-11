package singleton_design_pattern;

public class EmployeeSingleTonEager {

	private static EmployeeSingleTonEager es=new EmployeeSingleTonEager();

	/*
	 * we are creating object of a class("EmployeeSingleTonEager") above in starting whether required obj of class
	 * whether required or not and this is the drawback or disadvantage of Wager way of creating Singleton patter design
	 */
	private EmployeeSingleTonEager(){
		
	}
	
	public static EmployeeSingleTonEager getEmployeeSingleTonEager() {
		if(es==null) {
			
			return es;
		}
		return es;
	}
	
}
