package Verison_1;

public class A {
	public void ma(int i) throws NegValException {
		if (i<0) {
			/* error*/
			throw new NegValException("Negative value "+i);
		}
		else {
			/* no error: do something */
		}
	}
}
