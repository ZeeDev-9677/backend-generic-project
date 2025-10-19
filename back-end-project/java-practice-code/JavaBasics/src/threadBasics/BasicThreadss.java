package threadBasics;

/*using Thread class*/

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try{
				System.out.println("Hey "+currentThread().getName()+"= "+i);
				Thread.sleep(200); //5000 mili sec=5 sec
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

/* using Runnable interface */
//class MyRunnable implements Runnable{
//	
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			try {
//				System.out.println("Hey " + Thread.currentThread().getName()+" iteration is :"+i + " AND priority is:"
//						+ Thread.currentThread().getPriority());
//				Thread.sleep(500);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//	}
//	
//}
public class BasicThreadss {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Hello");
//		
////		to know thread execution name which is ->"main"
//		System.out.println(Thread.currentThread().getName());
//		World world=new World();
//		world.start();
//
//		
////		----------create thread using runnable interface-------
//		
////		System.out.println("Hello");
////		World world=new World();
////		Thread t1=new Thread(world);
////		t1.start();
////		System.out.println(Thread.currentThread().getState());
//		
//		
////		##################----NOTE-----##########
////		To create a new thread, either we need to extends Thread class or implements Runnable interface 
		
		
		
		
		
		/* standard thread creating and practice with chatGPT */
		//using Thread class
		MyThread th1 = new MyThread();
		th1.setName("Thread -A");
		MyThread th2 = new MyThread();
		th2.setName("Thread -B");
		th1.setPriority(Thread.NORM_PRIORITY); //setting Normal thread priority 
		th2.setPriority(Thread.MAX_PRIORITY); //setting Maximum thread priority 
		th1.start();
		System.out.println("waiting for t1..");
		th2.join();
		System.out.println("t1 completed..");
		th2.start();
		System.out.println("Thread finished here..");
		
		
		
		
		
		
		/* using Runnable interface */
//		Thread t1=new Thread(new MyRunnable(), " thread-A");
//		Thread t2=new Thread(new MyRunnable(), " thread-B");
//		t1.setPriority(Thread.MAX_PRIORITY); //priority setting = o/p->10
//		t2.setPriority(Thread.MIN_PRIORITY); //priority setting = o/p->1
//		t2.setPriority(Thread.NORM_PRIORITY);
//		t1.start();
//		t2.start();
//		System.out.println("Thread finished..");
	}

}
