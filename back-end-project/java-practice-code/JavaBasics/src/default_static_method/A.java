package default_static_method;

public interface A {

	int x = 23;
	String name = "Tnmy";

	 default void monkey() {
		System.out.println("A monkey here..");
	}
	 
	static void rat() {
		System.out.println("rat here..");
	}
}


//-----------------------------------multiple inheritance using interface--------------------------

interface D {

	default void monkey() {
		System.out.println("B monkey here..");
	}

}
