package demo.test.java8.defaultinterface;

public interface BasePrinter {

	public void printString(String ss);

	public default void printDefault() {
		System.out.println("Default in BasePrinter");
	}
}
