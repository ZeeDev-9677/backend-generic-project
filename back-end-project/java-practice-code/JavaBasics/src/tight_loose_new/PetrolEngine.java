package tight_loose_new;
//----tight coupling-------------
//public class PetrolEngine {
//	void start() {
//		System.out.println("Hey, Starting petrol engine..");
//	}
//}


//----loose coupling-------------
public class PetrolEngine implements Engine{
	public void start() {
		System.out.println("Hey, I am petrol engine..");
	}
}
