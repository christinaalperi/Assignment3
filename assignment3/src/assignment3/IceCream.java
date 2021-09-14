package assignment3;

public class IceCream {
	// Christina Alperi & Jenny Ewing

public class IceCream {

	private String flavor;
	private int numToppings;
	private String[] toppings;
	private String size;
	
	public IceCream(String flavor, int numToppings, String[] toppings, String size) {
		this.flavor=flavor;
		this.numToppings = numToppings;
		this.toppings=toppings; 
		this.size=size;
	}
	
	public double chargeCard(int numToppings) {
		if(numToppings <= 1) {
			return 4.50;
		}
		if(numToppings <= 3) {
			return 5.00;
		} 
		else {
			// throw an exception error: no more than 3 toppings no negative toppings
			System.out.println("ERR: No more than 3 toppings");
			return 0.0;
		}
		
	}
	public int getNumToppings() {
		return numToppings;
	}

	public String[] getToppings() {
		return toppings;
	}

	public String getFlavor() {
		return flavor;
	}
	
	public int setToppings(String[] toppings) {
		this.toppings = toppings;
		return toppings.length;
	}
	
	
	public String getSize() {
		return size;
	}
	public String sizeUp() {
		String cone_size = "Small"; // default
		switch(this.size) {
		case "Small" : 
			cone_size="Medium"; 
			this.size="Medium";
			break;
		case "Medium" : 
			cone_size="Large"; 
			this.size="Large";
			break;
		case "Large": 
			cone_size="Large"; 
			this.size="Large";
			break;
		
		}
		return cone_size;
	}

}
