package builder_design_pattern;

public class BurgerMainWithoutBuilderPattern {

	public static void main(String[] args) {

		BurgerWithoutBuilderPattern b = new BurgerWithoutBuilderPattern("bun", "patty", false, true, false);

		System.out.println(b);

	}

}
