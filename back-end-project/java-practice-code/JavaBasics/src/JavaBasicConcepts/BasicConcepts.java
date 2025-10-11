package JavaBasicConcepts;

//class Mine{
//	private static int x=60;
//	static void fun1() {
//		System.out.println("A");
//	 }
//	static void fun2() {
//		 System.out.println("B");
//	 }
//	static  void fun3() {
//		 System.out.println(x);
//	 }
//
//}

class Yours{
	 private  int n1,n2;
	  void fun4() {
		 n1=78;
		 n2=89;
	}
	  void disp(){
		System.out.println(n1 +" "+n2);
	}
	
}
public class BasicConcepts {
	
//	static void fun3(){
//		System.out.println("Inside same class");
//	}
//
//	static void fun4() {
//		System.out.println("Second inside same class");
//	}
	public static void main(String[] args) {
		
	
/*accessing member function[fun1(),fun2()] of class Mine without declaring as static function*/
		
//					Mine m=new Mine();
//					m.fun1();
//					m.fun2();
					
		
/*accessing member function[fun1(),fun2()] of class Mine by declaring as static function with static keywords*/
//		Mine.fun1();
//		Mine.fun2();
		
/*To accessing private member variable must need to create static function[like->fun3()] of class Mine by declaring static keywords*/		
//	Mine.fun3();
		
		
/*for class Yours explanation*/
		//need to create object of Yours class
		Yours y=new Yours();
		y.fun4();
		y.disp();
		
		//no need to create object of Yours class
//		Yours.fun4();
//		Yours.disp();
	}

}
