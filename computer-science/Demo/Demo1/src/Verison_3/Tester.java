package Verison_3;

public class Tester {
	public static void main(String[] args) throws NegValException {
		B ob = new B();
		/*
		 * Tester.main calls B.mb which might throw NegValException
		 * Now, Tester.main is subject to COS requirement
		 * Say, that tester.main chooses to specify
		 */

		ob.mb(-5);  
	}
}

// Should never do this as an implementer 
// Should always catch at some point