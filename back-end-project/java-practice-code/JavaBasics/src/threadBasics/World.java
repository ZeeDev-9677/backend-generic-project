package threadBasics;

/*extends Thread class to create thread*/

public class World extends Thread{
	
	@Override
	public void run() {
		System.out.println("zeeshan!!");
		System.out.println(Thread.currentThread().getName());

	}
}



/* implements Runnable interface to create thread */

//public class World implements Runnable{
//	
//	@Override
//	public void run() {
//		System.out.println("Alammm!!");
//		System.out.println(Thread.currentThread().getName());
//
//	}
//}
