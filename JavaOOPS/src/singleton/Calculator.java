package singleton;

public class Calculator {
	private static final Calculator ref = new Calculator();
	private Calculator() {
		System.out.println("Calculator constructor");
	}
	public static Calculator getRef() {
		return ref;
	}
}
