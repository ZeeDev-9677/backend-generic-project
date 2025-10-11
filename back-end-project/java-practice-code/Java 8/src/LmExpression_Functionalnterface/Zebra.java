package LmExpression_Functionalnterface;

public class Zebra implements Runnable {

//	@Override
//	public void sayHello(String s) {
//		System.out.println("asfjhdsbjhdsbj");
//
//	}
	
//	------------------thread job-------------
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello "+i);
		}

	}

}
