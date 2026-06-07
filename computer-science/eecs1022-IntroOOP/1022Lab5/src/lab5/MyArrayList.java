package lab5;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : March 19, 2025
//
//////////////////////////////
///
public class MyArrayList  {

	private static final int DEFAULT_CAPACITY = 5;
	
	int size;  // non-private for testing purpose, should be private in real application
	Course[] elementData; // non-private for testing purpose
	
	
	/**
	 * Create an empty list of default capacity
	 * 
	 */
    public MyArrayList() {
    	this.elementData = new Course [DEFAULT_CAPACITY];
    	this.size=0;
	}

	/**
	 * Create an empty list of capacity capa
	 * 
	 * @param capa the initial capacity. Assume greater than 0.
	 */
	 
    public MyArrayList(int capa) {
		 this.elementData = new Course[capa];
		 this.size=0;
	}

	
	 
    /**
     * Returns the number of elements in this collection.  
     *
     * @return the number of elements in this list
     */
	public int size() {
		 return size;
	}
	

	 /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
	public boolean isEmpty() {
		 return size == 0;
	}

	 
	 /**
     * Returns <tt>true</tt> if this list contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this list
     * contains at least one element <tt>e</tt> such that
     * <tt>o.equals(e)</tt>.
     *
     * @param o course element whose presence in this list is to be tested. Assume o is not null.
     * 
     * @return <tt>true</tt> if this collection contains the specified
     *         element
     * 
     */
	public boolean contains(Course o) {
		 for (int i = 0; i<size; i++) {
			 if (elementData[i].equals(o)) {
				 return true;
		 } 
	} return false;
	}
	 
	/**
     * Returns the element at the specified position in this list.
     * assume the specified position is valid, in the range of 0-size()
     * 
     * @param index index of the element to return.  Assume <tt>index &lt; 0 || index &gt;= size()</tt>)
     * @return the element at the specified position in this list
     *               
     */
    public Course get(int index) {
		 return elementData[index];
	}

	 
	
	    /**
	     * Add element e into (the end of) the list.
	     * If the array is full, expand it.
	     * Create a new array with DEFAULT_CAPACITY (5) more capacity, copy existing data to the new array.
	     *  
	    *
	    * @param e element whose presence in this collection is to be ensured. Assume e is not null. 
	    */
	   public void add(Course e) {
		   if (size == elementData.length) {
			   Course[] newArray = new Course[elementData.length + DEFAULT_CAPACITY];
		        for (int i = 0; i < elementData.length; i++) {
		        	newArray[i] = elementData[i];
		        }
		        elementData = newArray;
	        }
		   elementData[size++] = e;
	    }
		 
		
	
	  
	
	   /**
	     * Removes a single instance of the specified element from this list
	     * if it is present.  
	     * More formally, removes an element <tt>e</tt> such that
	     * <tt>c.equals(e)</tt>. 
	     * If this collection contains one or more such elements,   
	     * removes the first occurrence of the specified element. If this collection does not contain the element, it is unchanged.
	     * 
	     * Shifts any subsequent elements to the left (their indices decrease).  
	     * Returns the element that was removed from the
	     * list.
	     * 	       
	     * @param o element to be removed from this list, if present. Assume o is not null.
	     * @return if this list contained the specified element. false otherwise.
	     */ 
	public boolean remove(Course c) {
		int index = indexOf(c);
        if (index != -1) {
            for (int i=index; i< size-1; i++) {
            	elementData[i] = elementData[i+1];
            }
            elementData[size-1]=null;
            size --;
            return true;
        }
        return false;
	}
	
	 /**
	    * Removes the element at the specified position in this list. 
	    * Shifts any subsequent elements to the left (their indices decrease).  
	    * Returns the element that was removed from the
	    * list.
	    * 
	    * Assume index is in the range, i.e., (index >0 && index <= size())
	    *
	    * @param index the index of the element to be removed
	    * @return the element previously at the specified position
	    *       
	    */
			
	public Course remove(int index) {
		 Course removed = elementData[index];
		 for (int j=index; j< size-1; j++) {
         	elementData[j] = elementData[j+1];
         }
         elementData[size-1]=null;
         size --;
         return removed;
	}
	

	// Search Operations

	   /**
	    * Returns the index of the first occurrence of the specified element
	    * in this list, or -1 if this list does not contain the element.
	    * More formally, returns the lowest index <tt>i</tt> such that
	    * <tt>o.equals(get(i))</tt>,
	    * or -1 if there is no such index.
	    *
	    * @param o element to search for. Assume o is not null
	    * @return the index of the first occurrence of the specified element in
	    *         this list, or -1 if this list does not contain the element
	    * */
	 
	public int indexOf(Course o) {
		for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;

}
}
