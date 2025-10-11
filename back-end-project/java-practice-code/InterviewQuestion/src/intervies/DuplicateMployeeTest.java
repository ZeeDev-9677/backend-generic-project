package intervies;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateMployeeTest {

	public static void main(String[] args) {
        //first technique
		
		/*
		 * List<EmployeeList> emp=getAllEmployee();
		 * Map<String,Long>collect=emp.stream().collect(Collectors.groupingBy(
		 * EmployeeList::getName,Collectors.counting())); System.out.println(collect);
		 */
	
	
	//Second technique
//	List<EmployeeList> emp=getAllEmployee();
//	Map<String,Integer> m=new HashMap<String,Integer>();
//	for(EmployeeList l:emp)
//	{
//		if(!m.containsKey(l.getName()))
//		{
//			m.put(l.getName(),1);
//		}
//		else {
//			m.put(l.getName(),m.get(l.getName())+1);
//		}
//	}
//	
//	System.out.println(m);
//	}
//
//	
//	
//	public static List<EmployeeList> getAllEmployee() {
//		
//		
//		List<EmployeeList> ml=new ArrayList<>();
//		ml.add(new EmployeeList("E40001","Pradeep","HR",28));
//		ml.add(new EmployeeList("E40002","Bhapal","MD",27));
//		ml.add(new EmployeeList("E40003","Kavi","AMR",39));
//		ml.add(new EmployeeList("E40004","Pradeep","HR",28));
//		ml.add(new EmployeeList("E40005","Mahesh","Developer",56));
//		return ml;
//
		
		
		
		List<EmployeeList> ml=new ArrayList<>();
		ml.add(new EmployeeList("E40001","Pradeep","HR",28));
		ml.add(new EmployeeList("E40002","Bhapal","MD",27));
		ml.add(new EmployeeList("E40003","Kavi","AMR",39));
		ml.add(new EmployeeList("E40004","Pradeep","HR",28));
		ml.add(new EmployeeList("E40005","Mahesh","Developer",56));
		
		
//		ml.stream().filter(x->x.equals("Pradeep")).count()>1;
//		System.out.println(x);
	}
}
