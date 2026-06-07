package model;

public interface SeqEvaluator {

	
	public void addOperation(String op, int[] a, int[] b) throws IllegalOperationException;
	public String toString();
	
}
