package basicodes;

//If we call a method passing a value,it is known as call by value.The changes being done in the called method,
//is not affected in the calling method.

public class CallByValue {
	int data = 107;

	void result(int data) {
		data = data + 12;// changes will be in the local variable only
	}

	public static void main(String[] args) {

		CallByValue cb = new CallByValue();
		cb.result(23);
		System.out.println("answer is :" + cb.data);
	}

}
