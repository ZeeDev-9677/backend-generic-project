package colllection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TeacherMain {

	public static void main(String[] args) {
		
		/* print highest salary teacher with details */
		
//		Teachers t1=new Teachers();
//		t1.setName("Megha");
//		t1.setDepartment("DDT");
//		t1.setSalary(55000L);
//		
//		Teachers t2=new Teachers();
//		t2.setName("Rahil");
//		t2.setDepartment("Java Developer");
//		t2.setSalary(780000L);
//		
//		Teachers t3=new Teachers();
//		t3.setName("Azam");
//		t3.setDepartment("UI Developer");
//		t3.setSalary(23000L);
//		
//		
//		Teachers t4=new Teachers();
//		t4.setName("Atul");
//		t4.setDepartment("Fresher");
//		t4.setSalary(9500L);
		
		
		List<Teachers> list=new ArrayList<Teachers>();
		list.add(new Teachers("Aman","DDT",28900L));
		list.add(new Teachers("Mahi","Manager",58000L));
		list.add(new Teachers("Zahid","CEO",900000L));
		list.add(new Teachers("Megha","EO",40000L));
		
//		list.add(t2);
//		list.add(t3);
//		list.add(t4);
		
		Teachers teacher=list.stream().sorted(Comparator.comparingDouble(Teachers::getSalary).reversed()).findFirst().get();
		System.out.println(teacher);
		


	}

}
