package tight_and_loose_coupling;
//https://www.youtube.com/watch?v=MSK2QCG4TSM(video reference for loose and tight couling)

//tight coupling code

//here we are declaring Engineer class ref(Engineer eng) 
//and then initializing "eng" by passing "Engineer e" as parameter in constructor(App1) 
//at the end we are creating object of Engineer Class and passing as a parameter of constructor(App1) 
//hence same concept also applied to Doctor class as well
public class App1 {
	Engineer eng;
	Doctor dct;

	public App1(Engineer e, Doctor d) {
		this.eng = e;
		this.dct = d;
	}

	public void displayAll() {
		eng.disp();
		dct.disp();
	}

	public static void main(String[] args) {
		Engineer e = new Engineer();
		Doctor d = new Doctor();

		App1 a1 = new App1(e, d); 	// e will copied to above constructor e and it will assign to eng and this eng
									// will call disp method of Engineer class
		
									// d will copied to above constructor d and it will assign to dct and this dct
									// will call disp method of Doctor class
		a1.displayAll();
	}

}
