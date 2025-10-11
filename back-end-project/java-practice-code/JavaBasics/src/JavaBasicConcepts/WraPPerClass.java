package JavaBasicConcepts;

class Np {
	int c;
}

public class WraPPerClass {

	public static void main(String[] args) { //here args is a reference variable we can also write any other name like xyz.
//		Np n=new Np();
//		int a=n.c=9;
//		System.out.println(a);
		int mm = Integer.parseInt("398");
//		Integer x=Integer.valueOf("10110",2);
//		int y=x.intValue();
//		System.out.println("int value is ="+mm);
//		System.out.println("decimal value is ="+y);

		/* String to double conversion i.e=2.0 */
		Double x = Double.valueOf("2"); // here x is reference variable of type Integer
		double y = x.doubleValue(); /*
									 * here y is a variable which hold double value where doubleValue function helps
									 * to convert from object type(Double)value to data type value(primitive data
									 * type like double)
									 */
		System.out.println("decimal value is =" + y);
	}

}
