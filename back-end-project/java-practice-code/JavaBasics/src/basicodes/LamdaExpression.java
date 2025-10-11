package basicodes;

@FunctionalInterface
interface cat {
	void meth1();

}

public class LamdaExpression {

	public static void main(String[] args) {
		cat obj = () -> {
			System.out.println("Hello I am meassuuu");
		};

		obj.meth1();
	}

}


//passing one parameters  

/*
 * @FunctionalInterface interface cat { void meth1(String str);
 * 
 * } public class LamdaExpression {
 * 
 * public static void main(String[] args) { cat obj = (str) -> {
 * System.out.println("Hello I am meassuuu"+" "+str); }; String str="ahah";
 * obj.meth1(str); }
 * 
 * }
 */



//passing two parameters separated by comma(",")  


/*
 * @FunctionalInterface interface Maths { void meth1(int a, int b);
 * 
 * }
 * 
 * public class LamdaExpression {
 * 
 * public static void main(String[] args) { Maths obj = (a,b) -> {
 * System.out.println("Hello I am maths"+" "+a+" "+b); };
 * 
 * obj.meth1(3,4); }
 * 
 * }
 */