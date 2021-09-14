package assignment3;

public class NumToppingsException extends RuntimeException {
	public NumToppingsException(String err) {
		super(err);
		System.out.println("Msg: "+ err);
	}
}