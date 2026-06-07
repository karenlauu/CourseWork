package model;

public class SumsOfPrefixes implements SeqOperation{
	private int[] seq;
	private int[] sums;

	public SumsOfPrefixes(int[] a) {
		this.seq=a;
		computeSums();
	}
	
	public String getResults() {
		return numList(sums);
	}

	private void computeSums() {
		sums = new int[this.seq.length+1];
		sums[0] = 0;
		for (int i=0; i< seq.length; i++) {
			sums[i+1] = sums[i] + seq[i];
		}
	}

	public String numList(int[] a) {
		String result = "";
		for (int i=0; i<a.length; i++) {
			result += a[i];
			if (i< a.length-1) {
				result += ", ";
			}
		} return result;
	}

	public String toString() {
		String result = String.format("Sums of prefixes of [%s] is: [%s]", 
				numList(seq), numList(sums));
		return result;
	}

}
