package assignment3;

public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] toppings = {"Sprinkles","Whipped Cream", "Strawberries"};
		IceCream dessert = new IceCream("Chocolate", 3, toppings, "Small");
		System.out.println(dessert.getSize());
		dessert.sizeUp();
		System.out.println(dessert.getSize()); // should be medium
		dessert.sizeUp(); 
		System.out.println(dessert.getSize()); // should be large
		dessert.sizeUp();
		System.out.println(dessert.getSize()); // should say no here
		
		int numToppings = dessert.getNumToppings();
		double cost = dessert.chargeCard(numToppings);
		System.out.println(cost);
		
		System.out.println(dessert.chargeCard(4));
		String[] set_toppings = {"Caramel", "Bananas"};
		int new_num = dessert.setToppings(set_toppings);
		System.out.println(new_num);
	}

}
