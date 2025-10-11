package threadBasics;

public class ThreadSteps extends Thread {
	@Override
	public void run() {
		System.out.println("RUNNING!!");
		try {
			Thread.sleep(2000);
			System.out.println("hey hey!");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadSteps ts = new ThreadSteps();
		System.out.println("Hi I am in " + ts.getState() + " state!"); //NEW
		ts.start();
		System.out.println("This is " + ts.getState() + " state!!"); //RUNNABLE

		Thread.sleep(100);
		System.out.println(ts.getState()); // TIMED_WAITING

		ts.join();
		System.out.println(ts.getState()); //TERMINATED
	}

}
