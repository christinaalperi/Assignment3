package assignment3;

public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// make some ice creams
		String[] toppings = {"Sprinkles","Whipped Cream", "Strawberries"};
		IceCream dessert = new IceCream("Chocolate", 2, toppings);
		int numToppings = dessert.getNumToppings();
		double cost = dessert.chargeCard(numToppings);
		System.out.println(cost);
		
		double err_cost = dessert.chargeCard(5);
		System.out.println(err_cost);
	}

}
