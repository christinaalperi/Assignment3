package assignment3;

public aspect LogCreditCard {
	  double around(int d): call(double IceCream.chargeCard(int)) && args(d) {
		System.out.println("Log: before call...");
		double res = proceed(d);
		System.out.println("Log: after call...");
		return res;
	  }
		
}
