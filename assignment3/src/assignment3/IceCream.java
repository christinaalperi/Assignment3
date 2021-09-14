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
			if(numToppings <= 1 && numToppings >= 0) {
				return 4.50;
			}
			if(numToppings <= 3) {
				return 5.00;
			} 
			else if (numToppings < 0){
				// throw an exception error: no negative number of toppings
				throw new NumToppingsException("No negative number of toppings.");
			} else {
				// throw an exception error: no more than 3 toppings
				throw new NumToppingsException("No more than 3 toppings.");
			}
		
		}
		
		public String getFlavor() {
			return flavor;
		}
		
		public int getNumToppings() {
			return numToppings;
		}

		public String[] getToppings() {
			return toppings;
		}


}