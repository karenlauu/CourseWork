package model;

public class Projection extends BinarySeqOperation{
	private int[] result;
	
	public Projection(int[] a, int[] b) {
		super(a,b);
		project();
	}
	
	public String getResults() {
		return numList(result);
	}
	
	private void project() {
		int count = 0;
		int[] temp = new int[this.seq2.length];
		for (int i=0; i< this.seq2.length; i++) {
			if (inSeq(this.seq1,this.seq2[i])) {
				temp[count] = seq2[i];
				count++;
			}
		}
		
		this.result = new int[count];
		for (int i=0; i<count; i++) {
			this.result[i]=temp[i];
		} 
	}
	
	private boolean inSeq(int[] seq, int value) {
		for (int i=0; i< seq.length; i++) {
			if (seq[i] == value) {
				return true;
			}
		} return false;
	}
	
	public String toString() {
		String result = String.format("Projecting [%s] to [%s] results in: [%s]", 
				numList(this.seq1), numList(this.seq2),numList(this.result));
		return result;
	}
	
}
