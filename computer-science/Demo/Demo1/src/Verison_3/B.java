package Verison_3;

public class B {
	public void mb(int i) throws NegValException {
		A oa = new A();
		/*
		 * B.mb calls A.ma which throws NegValException
		 * So B.mb is subject to the COS requirement
		 * Say B.mb chooses to specify the exception
		 */
		oa.ma(i);
	}
}
