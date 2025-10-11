package LmExpression_Functionalnterface;

public class LambdaMain {

	public static void main(String[] args) {
//		LambdaInterfaceA a=()->System.out.println("dddddddddddddddddddddd");

		
		LambdaInterfaceA lm=new LambdaInterfaceA() {
			
			public void alpha() {
				System.out.println("alpha inside Main..");
			}
			
			public void beta() {
				System.out.println("beta inside Main..");
			}
			
		};
		
		lm.alpha();
		lm.beta();
	}

}
