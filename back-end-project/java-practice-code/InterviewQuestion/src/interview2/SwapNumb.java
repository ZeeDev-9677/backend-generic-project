package interview2;

public class SwapNumb {

	public static void main(String[] args) {
		
		/* swap number without using third variable */
		int a=33,b=23;
		
		a=a+b; //2+3=5
		b=a-b; //5-3=2
		a=a-b; //5-2=3
		System.out.println(a+" "+b);

	}

}
