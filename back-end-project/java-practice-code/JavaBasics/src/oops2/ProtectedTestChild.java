package oops2;

public class ProtectedTestChild {
	 String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Amann";
	}

	protected void Testt() {
		System.out.println("Hi I am child .....");
	}
}
