package model;

public class ConcatAll implements SeqEvaluator {
	private SeqOperation[] operations;
	private int noo;
	private int incompatible;

	public ConcatAll(int num) {
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

		if (strOp.equals("op:projection")) { 
			op = new Projection(a, b);
		} else if (strOp.equals("op:sumsOfPrefixes")) {
			op = new SumsOfPrefixes(a);
		} else if (strOp.equals("op:occursWithin")) {
			this.incompatible ++;
		}



		if (op != null) {
			operations[noo] = op;
			noo++;
		}
	}

	public String concatR() {
		String result = "";
		boolean firstAdded = false;
		for (int i=0; i<noo; i++) {
			String current = operations[i].getResults();
			if (!current.equals("")) {
				if (firstAdded) {
					result += ", ";
				}
				result += current;
				firstAdded = true;

			}
		} return result;
	}

	public String toString() {
		String result = null;
		if (this.incompatible==0) {
			result = "Concat(";
			for (int i=0; i<noo; i++) {
				result += "[" + operations[i].getResults() + "]";
				if (i< noo-1) {
					result += ", ";
				}
			}
			result += ") = [" + concatR() + "]";
		} else {
			result = String.format("Concat cannot be evaluated due to %d incompatile operations.", this.incompatible);
		}
		return result;
	}
}
