package oops;
// class X implements A_interface,B_interface{
////	@Override
//	public void show() {
////		System.out.println("X show..");
////		A_interface.super.show();
//		
//		System.out.println("I am x here..");
//	}
//}
public class C implements A_interface,B_interface{

	public static void main(String[] args) {
//		X x=new X();
//		x.show();
		C c=new C();
		c.show();
	}
	public void show() {
		 System.out.println("I am C");
	 }
}
