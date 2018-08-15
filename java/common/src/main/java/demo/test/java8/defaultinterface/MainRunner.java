package demo.test.java8.defaultinterface;

public class MainRunner {

	public static void main(String[] args) {
		BasePrinter p1 = new DebugPrinter();
		BasePrinter p2 = new ErrorPrinter();
		p1.printString(" something ");
		p1.printDefault();
		p2.printString(" EVeryThing ");
		p2.printDefault();
	}

}
