package oops;

public class PolymorphismMain {

	public static void main(String[] args) {

//		PolymorphismCat cat = new PolymorphismCat();
//		cat.animalSound();
//
//		// or
//		/* new PolymorphismCat().animalSound(); */
//		
//		PolymorphismDog dog=new PolymorphismDog();
//		dog.animalSound();
//		
//		PolymorphismAnimal an=new PolymorphismAnimal();
//		an.animalSound();
		
//		new PolymorphismAnimal().animalSound();
//		new PolymorphismAnimal().animalSound("Cat");
//		new PolymorphismAnimal().animalSound(13);
//		new PolymorphismAnimal().animalSound("Monkey",78);
//		new PolymorphismAnimal().animalSound(99,"Hen");
		
		PolymorphismAnimal a=new PolymorphismCat();
		a.testingAnimal();
		PolymorphismCat c=(PolymorphismCat)a;
		c.testingCat();
		
	}

}
