package work;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : karenl05@my.yorku.ca
//Date : March 27, 2025
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


public class MyStack {

	private static final int DEFAULT_CAPACITY = 5;

	public int size; // non-private for testing purpose, should be private in real application
	public Integer[] elementData; // non-private for testing purpose

	
	/**
	 * Create an empty stack of default capacity
	 * 
	 */
	public MyStack() {
		this.elementData = new Integer[DEFAULT_CAPACITY];
		this.size=0;
		for (int i=0; i<DEFAULT_CAPACITY; i++) {
			elementData[i]= null;
		}
		
		 
	}

	/**
	 * Returns the number of elements in this collection.
	 *
	 * @return the number of elements in this list
	 */
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 *
	 * @return <tt>true</tt> if this list contains no elements
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size==0) {
			return true;
		}
		return false;
	}

	/**
	 * Returns <tt>true</tt> if this stack contains the specified element. More
	 * formally, returns <tt>true</tt> if and only if this stack contains at least
	 * one element <tt>e</tt> such that <tt>o.equals(e)</tt>.
	 *
	 * @param o Integer element whose presence in this stack is to be tested. Assume o
	 *          is not null.
	 * 
	 * @return <tt>true</tt> if this stack contains the specified element
	 * 
	 */
	public boolean contains(Integer o) {
		// TODO Auto-generated method stub
		 for (int i=0; i<size; i++) {
			 if((elementData[i]).equals(o)) {
				 return true;
			 }
		 }
		return false;
	}

	

	/**
	 * Add element e into (top of) the stack (the end of the array). If the array is full, expand it.
	 * Create a new array with DEFAULT_CAPACITY (5) more capacity, copy existing
	 * data to the new array.
	 * 
	 *
	 * @param e element whose presence in this stack is to be ensured. Assume e
	 *          is not null.
	 */
	public void push(Integer e) {
		 if (size == elementData.length) {
			 Integer[] newarray = new Integer[elementData.length + DEFAULT_CAPACITY];
			 for (int i=0; i< size; i++) {
				 newarray[i]=elementData[i];
			 }
			 elementData = newarray;
		 }
		 elementData[size] = e;
		 size++;
	}

	

	/**
	 * Removes the element at the top of the stack
	 * 
	 * if stack is empty, return null
	 * 
	 * 
	 * #return the top element in the stack. null if teh stack is empty
	 */
	
	
	public Integer pop() {
		if (isEmpty()) {
			 return null;}
		Integer value = elementData[size-1];
		elementData[size-1] = null;
		size--;
		return value;
		
	}
	public Integer peek() {
		if (isEmpty()) {
			 return null;
		 } else 
			 return elementData[size-1];
	}

	
}
