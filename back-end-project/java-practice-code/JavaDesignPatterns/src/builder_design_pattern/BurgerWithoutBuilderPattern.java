package builder_design_pattern;

public class BurgerWithoutBuilderPattern {

	
	private String bun;
	private String patty;
	private boolean sauce;
	private boolean lettuce;
	private boolean cheese;
	
	//constructor with all arguments
	public BurgerWithoutBuilderPattern(String bun, String patty, boolean sauce, boolean lettuce, boolean cheese) {
//		super();
		this.bun = bun;
		this.patty = patty;
		this.sauce = sauce;
		this.lettuce = lettuce;
		this.cheese = cheese;
	}

	//constructor without patty and sauce
	public BurgerWithoutBuilderPattern(String bun, boolean lettuce, boolean cheese) {
//		super();
		this.bun = bun;
		this.lettuce = lettuce;
		this.cheese = cheese;
		this.lettuce=false;
		this.sauce=false;
	}
	//constructor without lettuce and cheese
	public BurgerWithoutBuilderPattern(String bun, String patty, boolean sauce) {
		super();
		this.bun = bun;
		this.patty = patty;
		this.sauce = sauce;
		this.lettuce=false;
		this.cheese=false;
		
	}

	@Override
	public String toString() {
		return "BurgerWithoutBuilderPattern [bun=" + bun + ", patty=" + patty + ", sauce=" + sauce + ", lettuce="
				+ lettuce + ", cheese=" + cheese + "]";
	}
	
	
	
	
	
}
