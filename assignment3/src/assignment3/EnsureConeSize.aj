package assignment3;

public aspect EnsureConeSize {
	before(IceCream cone) : target(cone) && call(String IceCream.sizeUp()) {
		if (cone.getSize().equals("Large")) {
			System.out.println("ERR: Can't Size Up Anymore");
		}
		
	}
}
