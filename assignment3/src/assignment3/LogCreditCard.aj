package assignment3;

public aspect LogCreditCard {
		
	void around(): call(double IceCream.chargeCard(int)) {
		System.out.println("Log: before call...");
		System.out.print(" ");
		proceed();
		System.out.println("Log: after call...");
	}
}