package builder_design_pattern;

public class BurgerMainWithBuilderPattern {

	public static void main(String[] args) {
		BurgerWithBuilderPattern burgerReady = new BurgerWithBuilderPattern.BuilderBurger().setBun("bun").setCheese(false).setLettuce(true).setPatty("patty").setSauce(true).burgerBuilder();
		System.out.println(burgerReady);
	}

}
