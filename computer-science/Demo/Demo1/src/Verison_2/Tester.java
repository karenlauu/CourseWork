package Verison_2;

public class Tester {
	public static void main(String[] args) {
		B ob = new B();
		/*
		 * Tester.main calls B.mb which might throw NegValException
		 * Now, Tester.main is subject to COS requirement
		 * Say, that tester.main chooses to catch
		 */
		try {
			ob.mb(-5);  // no compilation error since exception was already caught

		}
		catch (NegValException nve) {
			System.out.println("NVE occured");
		}
	}
}
