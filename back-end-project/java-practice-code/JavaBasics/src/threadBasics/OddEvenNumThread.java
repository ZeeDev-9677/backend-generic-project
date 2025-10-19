package threadBasics;

class MineThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				if(i%2==0) {
					
					System.out.println(Thread.currentThread().getName()+"-even-"+i);
				}
				else {
					
					System.out.println(Thread.currentThread().getName()+"-odd-"+i);
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
public class OddEvenNumThread {

	public static void main(String[] args) throws InterruptedException {
		MineThread m1=new MineThread();
		MineThread m2=new MineThread();
//		m1.setName("odd-thread-A");
//		m2.setName("even-thread-B");
		m1.start();
//		m1.join();
		m2.start();
//		m1.run();

	}

}
