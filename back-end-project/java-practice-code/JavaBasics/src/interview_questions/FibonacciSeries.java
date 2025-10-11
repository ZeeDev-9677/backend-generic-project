package interview_questions;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c,n=7;
		System.out.print("The "+n+" term fibonacci series are:");
		System.out.print(a+" "+b);
		while(n>0) {
			c=a+b;
			a=b;
			b=c;
			n--;
			System.out.print(" "+c);
		}
	}

}
