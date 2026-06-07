package work;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email :--
//Date : March 27, 2025

//////////////////////////////


//Java Program to check if a queue 
//of first n natural number can 
//be sorted using a stack 
import java.io.*; 
import java.util.*; 

public class StackQueueUtility
{ 
	
	
	
	 /* Function to sort a queue using a stack.  
	 * 
	 * @param q A queue of integers
	 * 
	 * 	 
	 */
	public static void sortQueue(Queue<Integer> q){ 
		Stack<Integer> st = new Stack<Integer>();
		
		while (!q.isEmpty()) {
			int e = q.poll();
			
			while (!st.isEmpty() && st.peek() < e) {
				q.offer(st.pop());
			}
			st.push(e);
		}
		while (!st.isEmpty()) {
			q.offer(st.pop());
		}
	} 
	
	    /* Function to determine if a string determines if parenthesises/brackets in it is balanced. 
	     * A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order
		 * 
		 * @param s input string
		 * @return if s is balanced * 
		 * 	 
		 */
	  public static boolean isBracketsBalanced(String s) {  
		  Stack<Character> stacks = new Stack<Character>();
		  for (int i=0; i<s.length(); i++) {
			  char ch = s.charAt(i);
			  if (ch == '(' || ch == '{' || ch== '[') {
				  stacks.push(ch);
			  } else if (ch == ')' || ch == '}' || ch== ']') {
				  if (stacks.isEmpty()) {
					  return false;
				  }
				  char open = stacks.pop();
				  if ((open == '(' && ch!= ')') || (open=='{' && ch!= '}') || (open == '[' && ch!= ']')) {
					  return false;
				  }
			  }
		  }
	       
		   return stacks.isEmpty();
	  }
} 

 