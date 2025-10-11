package colllection;

public class SleepMethod extends Thread {

	public static void main(String[] args) throws Exception {

		SleepMethod s = new SleepMethod();
		s.start();
	}
								//reference https://www.youtube.com/watch?v=LXDqW6rB-AA
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Zee " + i);
			}

			catch (Exception e) {
				System.out.println(e);

			}
		}
		System.out.println("finished execution");
	}

}
