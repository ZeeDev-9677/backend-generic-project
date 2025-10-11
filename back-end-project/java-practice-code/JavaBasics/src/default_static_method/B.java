package default_static_method;

//public class B {
//
//	
////##NOTE:- static method=we cannot override static method
////        default method=we can override default method
//	
//	public static void main(String[] args) {
//		C c = new C();
////		System.out.println(c.name);
//		
//		c.monkey();
////		C.monkey();
//		
////		C.rat();
////		A.rat();
////		System.out.println(C.x);
//
//	}
//
//}

//class C implements A {
////	@Override
//	 public void monkey() {
//		System.out.println("cat here..");
////		A.super.monkey();
//	}
//	
////	static void Rat() {
////		System.out.println("C rat here..");
////	}
//}

//-----------------------------------multiple inheritance using interface--------------------------
public class B implements A{
	
	public static void main(String[] args) {
		B b=new B();
		b.monkey();
//		b.rat(); for for static method
	}
	
//	@Override
//	public void monkey() {
////		System.out.println("I am B..");
//		D.super.monkey();
//	}

//	----------for static method-----------------
	
//	 void rat() {
//		System.out.println("new rat here..");
//	}

}
