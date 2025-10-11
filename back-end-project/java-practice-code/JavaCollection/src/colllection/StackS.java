package colllection;

public class StackS {

	int[] arr=new int[5];
	int top=0;
	public void push(int mydata) {
		arr[top]=mydata;
		top++;
		//System.out.println(i);
	}
	public int pop() {
		int mydata;
		top--;
		mydata=arr[top];
		//arr[top]=0;
		return mydata;
		
	}
	public int peek() {
		int mydata;
		mydata=arr[top-1];
		return mydata;
		
	}
public void show() {
	for(int n:arr) {
	System.out.println(n);
	}
}

}
