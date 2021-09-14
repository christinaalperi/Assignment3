package assignment3;

public aspect EnsureNumToppings {
	
	after(int d) : call(double IceCream.chargeCard(int)) && args(d) {
		if (d < 0) {
			System.out.println("bad arg... negative");
		}
	}


	after(int d) : call(double IceCream.chargeCard(int)) && args(d) {
		if (d < 3) {
			System.out.print("bad arg... above 3");
		}
	}
}
