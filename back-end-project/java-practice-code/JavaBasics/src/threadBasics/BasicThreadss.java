package threadBasics;

public class BasicThreadss {

	public static void main(String[] args) {
		System.out.println("Hello");
		
//		to know thread execution name which is ->"main"
		System.out.println(Thread.currentThread().getName());
		World world=new World();
		world.start();

		
//		----------create thread using runnable interface-------
		
//		System.out.println("Hello");
//		World world=new World();
//		Thread t1=new Thread(world);
//		t1.start();
//		System.out.println(Thread.currentThread().getState());
		
		
//		##################----NOTE-----##########
//		To create a new thread, either we need to extends Thread class or implements Runnable interface 
		
	}

}
