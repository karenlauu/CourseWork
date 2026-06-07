package Verison_1;

public class B {
	public void mb(int i) {
		A oa = new A();
		/*
		 * B.mb calls A.ma which throws NegValException
		 * So B.mb is subject to the COS requirement
		 * Say B.mb chooses to handle/catch the exception
		 */
		try {
			oa.ma(i);
		}
		catch(NegValException nve) {
			
		}
	}
}
