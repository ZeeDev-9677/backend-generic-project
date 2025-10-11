package java_beginners_code;

public class BasicOJ {

	public static void main(String[] args) {

		/* fibonacci series */

//		int a = 0;
//		int b = 1;
//		int next;
//		int n = 5;
//		System.out.print(a + " " + b);
//		for (int i = 2; i < n; i++) {
//			next = a + b;
//			System.out.print(" " + next);
//			a = b;
//			b = next;
//		}

		/* practice mode */

//		int a = 0, b = 1, n = 6, c = a + b;
//		System.out.print(a + " " + b);
//		while (n > 0) {
//			c = a + b;
//			a = b;
//			b = c;
//			n--;
//			System.out.print(" " + c);
//		}
		
		/* prime number */

//		int num=17;
//		int c=1;
//		for(int i=2;i<=num/2;i++)
//		{
//			
//			if(num%i==0)
//			{
//				c++;
//				break;
//			}
//			
//		}
//		if(c>1)
//		{
//			System.out.println("not a prime number");
//		}
//		else
//		{
//			System.out.println("A prime number");
//		}

		/* practice mode */
		
		int n=21;
		int count=0;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Not Prime");
		}

		else {
			System.out.println("Prime");
		}
	}

}
