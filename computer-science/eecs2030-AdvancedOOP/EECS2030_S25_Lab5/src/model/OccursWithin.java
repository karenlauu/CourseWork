package model;

public class OccursWithin extends BinarySeqOperation {
	private boolean result;

	public OccursWithin(int[] a, int[] b) {
		super(a,b);
		occursRec();
	}
	
	public String getResults() {
		return "" + result;
	}

	private void occursRec() {
		boolean result = false;
		if (this.seq2.length == 0) {result= false;}
		if (this.seq1.length > this.seq2.length) {result= false;}
		if (this.seq1.length == 0) {result= true;}

		for (int i=0; !result && i< seq2.length; i++) {
			if (seq2[i]==seq1[0]) {
				result = check(i);
			}
		}
		this.result = result;
	}

	private boolean check(int ind) {
		if (ind+ seq1.length > seq2.length) {return false;}
		boolean result = true;

		for (int i=0; result && i< seq1.length; i++) {
			if (seq2[ind + i] != seq1[i]) {
				result = false;
			}
		}return result;
	}


	public String toString() {
		String result = null;
		if (this.result) {
			result = String.format("[%s] occurs within [%s]", 
					numList(this.seq1), numList(this.seq2));
		} else {
			result = String.format("[%s] does not occur within [%s]", 
					numList(this.seq1), numList(this.seq2));
		}
		return result;
	}

}
