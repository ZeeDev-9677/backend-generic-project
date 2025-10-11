package basicodes;

public class FunctnalInterfaceQuestions {

	/*
	 * public interface Fnt{ abstract String funcall(); } public static void
	 * main(String[] args) {
	 * 
	 * 
	 * Fnt str=()->{ return "hello dear";
	 * 
	 * }; System.out.println(str.funcall()); }
	 */
	
	public interface Fnt{
		abstract String funcall(String name);
	}
	public static void main(String[] args) {
		
		
		Fnt str=(name)->{
			return "hello dear "+name;
		};
		System.out.println(str.funcall("zeeee"));
	}

}
