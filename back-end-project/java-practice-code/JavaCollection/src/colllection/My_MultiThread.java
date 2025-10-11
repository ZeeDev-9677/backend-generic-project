package colllection;

public class My_MultiThread extends Thread{

	public static void main(String[] args) {
		
		My_MultiThread my=new My_MultiThread();
		//my.start();					//Thread.currentThread().getName()..It will give the name of the currently-running thread
		my.run();							//currentThread()...will give Current thread reference
		my.run();								//getName()...will name of current running thread
	}										

	 public void run()
	 {
		 System.out.println("Hello...Current thread name is="+ Thread.currentThread().getName());
	 }
	/*
	 * Multiple invocation: In Java’s multi-threading concept, another most
	 * important difference between start() and run() method is that we can’t call
	 * the start() method twice otherwise it will throw an IllegalStateException
	 * whereas run() method can be called multiple times as it is just a normal
	 * method calling.
	 */
	
}
