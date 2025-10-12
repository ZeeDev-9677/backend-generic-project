package basicodes;

public class Fibonacci {

	public static void main(String[] args) {
		int num=10, i=1, a=0,b=1,c;
		while(i<=num) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			i++;
		}

	}

}
