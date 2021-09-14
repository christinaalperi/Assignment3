package assignment3;

public aspect LogCreditCard {
		
	void around(int d): call(double IceCream.chargeCard(int)) {
		System.out.println("Log: before call...");
		System.out.print(" ");
		proceed(d);
		System.out.println("Log: after call...");
	}
}
