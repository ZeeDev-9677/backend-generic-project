package colllection;

public class Thread2 implements Runnable {
												//reference for this www.w3school.com (Thread)
	public static void main(String[] args) {
		Thread2 my = new Thread2();

		Thread t = new Thread(my); // Thread class
		t.start();
		System.out.println("This code is running outside Thread!!!");

	}

	public void run() {
		System.out.println("This code is running in a Thread!!!");
	}

}
