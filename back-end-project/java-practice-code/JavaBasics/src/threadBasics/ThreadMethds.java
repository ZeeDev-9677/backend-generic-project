package threadBasics;

//run(),start(),sleep(),join(),setPriority

public class ThreadMethds extends Thread {

//below inside ThreadMethds class constructor passing argument just for custom priority name setting as "Zeeshn"
	public ThreadMethds(String name) {
		super(name);
	}

	@Override
	public void run() {
//		System.out.println("starting..");
//		try {
//			for (int i = 0; i <= 5; i++) {
//				Thread.sleep(1000);
//
//				System.out.println(i);
//			}
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
//		System.out.println("finished..");

		/* ###### setPriority method ###### */

		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " -Priotity :" + Thread.currentThread().getPriority()
					+ "-count " + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
//		ThreadMethds th = new ThreadMethds();
//		System.out.println(th.getState());
//		th.start();
//		System.out.println(th.getState());
//		th.join();
//		System.out.println(th.getState());

		/* ######## setPriority method ######### */
		
//		  "Zeeshn"=below my custom thread name by passing into ThreadMethds class constructor
		 //		ThreadMethds th = new ThreadMethds("Zeeshn");

		ThreadMethds l = new ThreadMethds("Low Priority Thread ");
		ThreadMethds m = new ThreadMethds("Medium Priority Thread ");
		ThreadMethds h = new ThreadMethds("High Priority Thread ");
		l.setPriority(MIN_PRIORITY);
		m.setPriority(NORM_PRIORITY);
		h.setPriority(MAX_PRIORITY);

		l.start();
		m.start();
		h.start();

	}

}
