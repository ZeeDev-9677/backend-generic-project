package factory_design_pattern;

public class AnimalFactory {

	public static void getAnimalSound(String animalType) {
		if (animalType.equalsIgnoreCase("Dog")) {
			new Dog().makeSound();
		} else if (animalType.equalsIgnoreCase("Cat")) {
			new Cat().makeSound();
		} else {
			return;
		}
		
		/* older way switch case writing syntax */
//		switch (animalType) {
//		case "Dog":
//			new Dog().makeSound();
//		case "Cat":
//			new Cat().makeSound();
//		default:
//			;
//
//		}
		
		/* jave 14+ syntax new switch case writing */
//		switch (animalType) {
//		case "Dog"->new Dog().makeSound();
//		case "Cat"->new Cat().makeSound();
////        default->;
//
//		}
	}
	
	
	/* by factory design pattern achieving loose coupling, abstraction */
	

}
