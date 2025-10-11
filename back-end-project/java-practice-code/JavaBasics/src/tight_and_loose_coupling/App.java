package tight_and_loose_coupling;
//https://www.youtube.com/watch?v=MSK2QCG4TSM(video reference for loose and tight coupling)
//loose coupling code(less code of writing)
//here we are only declaring Interface ref i.e Job job and passing parameter j in constructor(App), hence inside main  creating Engineer
//class object and passing it as a parameter to App constructor. 
// thats why here we dont't have to write excess line of code like we are not creating any class reference and initializing of class reference 
public class App {
	Job job;
	public App(Job j) {
		this.job=j;
	}
	public void dispAll() {
		job.disp();
	}

	public static void main(String[] args) {
		Engineer ee=new Engineer();
//		Doctor dd=new Doctor();
		App aa=new App(ee); // parameter ee copied to j of above App constructor, hence it only calls Engineer class disp() method.
//		App aa=new App(dd);
		aa.dispAll();

	}

}
