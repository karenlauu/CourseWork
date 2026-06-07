package model;

public class FilterAll implements SeqEvaluator {
	private SeqOperation[] operations;
	private int noo;
	private int incompatible;

	
	public FilterAll(int num) {
		this.operations = new SeqOperation[num];
		this.noo = 0;
		this.incompatible=0;
	}
	
	public void addOperation(String strOp, int[] a, int[] b) throws IllegalOperationException{
		if (!(strOp.equals("op:projection") || 
				strOp.equals("op:sumsOfPrefixes") ||
				strOp.equals("op:occursWithin"))) {
			throw new IllegalOperationException("Unknown Operator");
		}

		SeqOperation op = null;

		if (strOp.equals("op:occursWithin")) { 
			op = new OccursWithin(a, b);
		} else if (strOp.equals("op:sumsOfPrefixes")) {
			this.incompatible++;
		} else if (strOp.equals("op:projection")) {
			this.incompatible ++;
		}



		if (op != null) {
			operations[noo] = op;
			noo++;
		}
	}
	
	public String concatR() {
		String result = "";
		for (int i=0; i<noo; i++) {
			String p = operations[i].getResults();
			if (p.equals("true")) {
				result += p;
			} else {
				result += "_";
			}
			if (i< noo-1) {
				result += ", ";
			}
		}
		
		return result;
	}
	
	public String toString() {
		String result = null;
		if (this.incompatible==0) {
			result = "Filter result is: " + concatR();
		} else {
			result = String.format("Filter cannot be evaluated due to %d incompatile operations.", this.incompatible);
		}
		return result;
	}
	
}
