package assignment3;

public aspect InterceptMethod {

	
	pointcut setter(IceCream a, String[] toppings): target(a) && args(toppings) && call(int setToppings(String[]));
	
	int around(IceCream a, String[] toppings): setter(a, toppings) {
		if(toppings.length>3) {
			String[] default_toppings = {"Sprinkles", "Whipped Cream"};
			proceed(a, default_toppings);
		}
		return proceed(a, toppings);
		
	}
	
}
