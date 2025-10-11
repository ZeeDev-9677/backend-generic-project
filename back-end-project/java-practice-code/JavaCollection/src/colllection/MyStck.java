package colllection;

public class MyStck {

	public static void main(String[] args) {
		// to add the data-->push() method
		// to delete the data-->pop() method pop work as a LIFO last in first out
		// to delete the specific position data-->peek() method
		StackS st = new StackS();
		st.push(10);
		st.push(28);
		st.push(44);
		st.show();

		st.peek();
		System.out.println("Deleted");

		 System.out.println(st.pop());

	}

}
