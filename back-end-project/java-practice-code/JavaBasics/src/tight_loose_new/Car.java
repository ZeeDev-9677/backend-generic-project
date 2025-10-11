package tight_loose_new;
//----tight coupling-------------

//public class Car {
//	private PetrolEngine petrolEngine;
//	
//	public Car(PetrolEngine petrolEngine) {
//		this.petrolEngine=petrolEngine;
//	}
//	
//	void startEngine() {
//		petrolEngine.start();
//	}
//}


//----loose coupling-------------

public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	void drive() {
		engine.start();
	}
}