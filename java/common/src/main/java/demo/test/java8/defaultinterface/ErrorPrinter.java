package demo.test.java8.defaultinterface;

public class ErrorPrinter implements BasePrinter {

	@Override
	public void printString(String ss) {
		// TODO Auto-generated method stub
		System.out.println("Debug :: in DebugPrinter " + ss);
	}

}
