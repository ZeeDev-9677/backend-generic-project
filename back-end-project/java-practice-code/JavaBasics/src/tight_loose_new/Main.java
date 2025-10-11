package tight_loose_new;

public class Main {
	
	public static void main(String[] args) {
//---------------------------tight coupling-----------------------------------------------------------
		
//		PetrolEngine pt=new PetrolEngine();
//		Car c=new Car(pt);
//		c.startEngine();
		
//---------------------------loose coupling--------------------------------------------------------------
		
		/*----testing petrol engine--------*/
//		Engine ep=new PetrolEngine();
//		Car c=new Car(ep);
//		c.drive();
		
		/*----testing diesel engine--------*/
		Engine ed=new DieselEngine();
		Car c=new Car(ed);
		c.drive();
		
	}
}
