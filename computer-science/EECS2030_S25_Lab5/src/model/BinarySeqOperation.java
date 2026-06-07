package model;

public abstract class BinarySeqOperation implements SeqOperation {
	protected int[] seq1;
	protected int[] seq2;
	
	public BinarySeqOperation(int[] a, int[] b) {
		this.seq1 = a;
		this.seq2=b;
	}
	
	public abstract String toString();
	 
	public String numList(int[] a) {
		String result = "";
		for (int i=0; i<a.length; i++) {
			result += a[i];
			if (i< a.length-1) {
				result += ", ";
			}
		} return result;
	}
}
