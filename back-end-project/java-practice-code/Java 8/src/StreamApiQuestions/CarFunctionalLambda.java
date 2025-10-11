package StreamApiQuestions;
@FunctionalInterface
interface A{
	void fun();
}

//class B implements A{
//public void fun() {
//	System.out.println("Hi I am running");
//}
//}
public class CarFunctionalLambda {


	public static void main(String[] args) {
//			A b=new B();
//		A a=new A() {
//			public void fun() {
//				System.out.println("Hi I am Anonymous class here!!");
//			}
//		};
		
		A a = () -> {
			System.out.println("Hi I am Lambda expression here!!");
		};
		a.fun();
	}

}
