package oops;

public class InheritanceColor extends InheritanceCar {
//	public String brake = "hydrolic brake";

//	@Override
	public void colorName() {
		System.out.println("I am in child class!!");
	}

	public static void main(String[] args) {
		InheritanceColor col = new InheritanceColor();
		InheritanceCar inht = new InheritanceCar();
		System.out.println("brandName is :" + inht.brand);
//		System.out.println("brake type is :" + col.brake);

		col.colorName();
		inht.colorName();
		
		/* instanceof keyword below */
		
//		InheritanceColor ih=new InheritanceColor();
//		InheritanceCar ic=new InheritanceCar();
//		System.out.println(ic instanceof InheritanceColor);
		
	}
	
	

}
