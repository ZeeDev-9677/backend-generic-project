package builder_design_pattern;

public class BurgerWithBuilderPattern {

	private String bun;
	private String patty;
	private boolean lettuce;
	private boolean cheese;
	private boolean sauce;

	public BurgerWithBuilderPattern(BuilderBurger builderBurger) {
		super();
		this.bun = builderBurger.bun;
		this.patty = builderBurger.patty;
		this.lettuce = builderBurger.lettuce;
		this.cheese = builderBurger.cheese;
		this.sauce = builderBurger.sauce;
	}

	public String getBun() {
		return bun;
	}

	public String getPatty() {
		return patty;
	}

	public boolean isLettuce() {
		return lettuce;
	}

	public boolean isCheese() {
		return cheese;
	}

	public boolean isSauce() {
		return sauce;
	}

	static class BuilderBurger {
		private String bun;
		private String patty;
		private boolean lettuce;
		private boolean cheese;
		private boolean sauce;

		public BuilderBurger setBun(String bun) {
			this.bun = bun;
			return this;
		}

		public BuilderBurger setPatty(String patty) {
			this.patty = patty;
			return this;
		}

		public BuilderBurger setLettuce(boolean lettuce) {
			this.lettuce = lettuce;
			return this;
		}

		public BuilderBurger setCheese(boolean cheese) {
			this.cheese = cheese;
			return this;
		}

		public BuilderBurger setSauce(boolean sauce) {
			this.sauce = sauce;
			return this;
		}

		public BurgerWithBuilderPattern burgerBuilder() {
			BurgerWithBuilderPattern burgerWithBuilderPattern = new BurgerWithBuilderPattern(this);
			return burgerWithBuilderPattern;
		}
	}

	@Override
	public String toString() {
		return "BurgerWithBuilderPattern [bun=" + bun + ", patty=" + patty + ", lettuce=" + lettuce + ", cheese="
				+ cheese + ", sauce=" + sauce + "]";
	}
	
}
