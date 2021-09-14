package assignment3;

public class IceCream {
	// Christina Alperi & Jenny Ewing

		private String flavor;
		private int numToppings;
		private String[] toppings;
		
		public IceCream(String flavor, int numToppings, String[] toppings) {
			this.flavor=flavor;
			this.numToppings = numToppings;
			this.toppings=toppings; 
			
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
				throw new NumToppingsException("No more than 3 toppings.");
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


}

