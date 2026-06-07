package lab6;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import work.ATM;
import work.DiskFileProcessor;
import work.MyStack;
import work.StackQueueUtility;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitTest_lab6 {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	*/

@Test
public void test0_00_deposit_0() {  
	 
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20,  30, 40, 50};
	String resu[] = ATM.depositATM(acc, amounts);
	String expectedResu[] = {"success", "success", "success", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 1150, 0.0001);
	
}
@Test
public void test0_00_deposit_1() {  
	 
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, -30, 40, 50};
	String resu[] = ATM.depositATM(acc, amounts);
	String expectedResu[] = {"success", "success", "failure (negative amount)", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 1120, 0.0001);
	
}
@Test
public void test0_00_deposit_2() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 650, 40, 50};
	String resu[] = ATM.depositATM(acc, amounts);
	String expectedResu[] = {"success", "success", "failure (beyond half balance)", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 1120, 0.0001);
	
}

@Test
public void test0_00_deposit_3() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, -20, 650, 40, 500, 900};
	String resu[] = ATM.depositATM(acc, amounts);
	String expectedResu[] = {"success", "failure (negative amount)", "failure (beyond half balance)", "success", "success","failure (beyond half balance)" };
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 1550, 0.0001);
	
}



@Test
public void test0_00_withdraw_0() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 30, 40, 50};
	String resu[] = ATM.withdrawATM(acc, amounts);
	String expectedResu[] = {"success", "success", "success", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 850, 0.0001);
	
}

@Test
public void test0_00_withdraw_1() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 972, 40, 50 };
	String resu[] = ATM.withdrawATM(acc, amounts);
	String expectedResu[] = {"success", "success", "failure (need 100 balance)", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 880, 0.0001);
	
}
@Test
public void test0_00_withdraw_2() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 30, -40, 50 };
	String resu[] = ATM.withdrawATM(acc, amounts);
	String expectedResu[] = {"success", "success", "success", "failure (negative amount)","success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 890, 0.0001);
	
}
@Test
public void test0_00_withdraw_3() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, -40, 860, 70,  6 };
	String resu[] = ATM.withdrawATM(acc, amounts);
	System.out.println(Arrays.toString(resu));
	String expectedResu[] = {"success", "success","failure (negative amount)", "success", "failure (need 100 balance)", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(bal, 104, 0.0001);
	
}

@Test
public void test0_00_openFile_0() {  
	String files[] = {"abc.txt", "b.txt"};
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST"};
	assertArrayEquals(lines, expectedResu);
		
	
}

@Test
public void test0_00_openFile_1() { 
	String files[] = {"abc.txt", "b.txt", "xyz.txt"};
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST", "hello from xyz.txt"};
	assertArrayEquals(lines, expectedResu);
		
}
@Test
public void test0_00_openFile_2() {  
	String files[] = {"abc.txt", "b.txt", "xyz.txt", "xyz", "ATM.java" };
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST", "hello from xyz.txt", "FILE DOESN'T EXIST", "package work;"};
	assertArrayEquals(lines, expectedResu);
}

@Test
public void test0_00_openFile_3() {  
	String files[] = {"abc.txt", "b.txt", "xyz.txt", "resume.pdf", "NewFile.xml"};
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST", "hello from xyz.txt","FILE DOESN'T EXIST", "<?xml version=1.0 encoding=UTF-8?>" };
	assertArrayEquals(lines, expectedResu);
}

/******************************************************************************/
@Test
public void test0_00_sortQueue() {  
	Queue<Integer> q = new LinkedList<>();  
	q.add(5); 	q.add(3);	q.add(6);	q.add(8);	q.add(9); 	q.add(3);	q.add(2);	q.add(4);	q.add(7);

	 
	System.out.println(q);
	StackQueueUtility.sortQueue(q);System.out.println(q);
	
	 
	Queue<Integer> exp = new LinkedList<>();
	exp.add(2); 	exp.add(3);	exp.add(3);	exp.add(4);	exp.add(5); exp.add(6);	exp.add(7);	exp.add(8);	exp.add(9);
    System.out.println(exp.size() + "--"+exp);
    System.out.println(q.equals(exp));
	assertEquals(q, exp);
  }

@Test
public void test0_00_sortQueue_1() {  
	 
	Queue<Integer> q = new LinkedList<>();  
	q.add(5); 	q.add(3);	q.add(6);	q.add(8);	q.add(9); 	 

	
	StackQueueUtility.sortQueue(q); 
	
	 
	Queue<Integer> exp = new LinkedList<>();
	exp.add(3);	exp.add(5); exp.add(6);	exp.add(8);	exp.add(9);
   
	assertEquals(q, exp);
    
	
 }
@Test
public void test0_00_sortQueue_2() {  
	 
	Queue<Integer> q = new LinkedList<>();  
	q.add(5); 	q.add(3);	q.add(-6);	q.add(-8);	q.add(-9); 	 

	
	StackQueueUtility.sortQueue(q); 
	
	 
	Queue<Integer> exp = new LinkedList<>();
	exp.add(-9);	exp.add(-8); exp.add(-6);	exp.add(3);	exp.add(5);
   
	assertEquals(q, exp);
    
	
 }


@Test
public void test0_00_sortQueue_3() {  
	 
	Queue<Integer> q = new LinkedList<>();  
	q.add(5); 	q.add(-3);	

	
	StackQueueUtility.sortQueue(q); 
	
	 
	Queue<Integer> exp = new LinkedList<>();
	exp.add(-3);	exp.add(5);
   
	assertEquals(q, exp);
    
	
 }
@Test
public void test0_00_sortQueue_4() {  
	 
	Queue<Integer> q = new LinkedList<>();  
	q.add(5); 	q.add(-3);	q.add(5); 	q.add(-3);

	
	StackQueueUtility.sortQueue(q); 
	
	 
	Queue<Integer> exp = new LinkedList<>(Arrays.asList(-3,-3,5,5));
	  
	assertEquals(q, exp);
    
	
 }
//-------------------------------------------------------
@Test
public void test0_00_isBracketsBalanced() {  
	
	String input = "[{()}]";
	assertTrue(StackQueueUtility.isBracketsBalanced(input));
}


@Test
public void test0_01_isBracketsBalanced() {  
	
	String input = "[()()]{}";
	assertTrue(StackQueueUtility.isBracketsBalanced(input));
}

@Test
public void test0_02_isBracketsBalanced() {  
	
	String input = "[()";
	assertFalse(StackQueueUtility.isBracketsBalanced(input));
}
@Test
public void test0_03_isBracketsBalanced() {  
	
	String input = "([{]})";
	assertFalse(StackQueueUtility.isBracketsBalanced(input));
}

@Test
public void test0_04_isBracketsBalanced() {  
	
	String input = "[a { x + y (c)}x ] zzz";
	assertTrue(StackQueueUtility.isBracketsBalanced(input));
}
@Test
public void test0_05_isBracketsBalanced() {  
	
	String input = "<x> a [ 2^43 ep { x + y (c)}x ] zzz";
	assertTrue(StackQueueUtility.isBracketsBalanced(input));
}
@Test
public void test0_06_isBracketsBalanced() {  
	
	String input = "CONCATENATE(MID(B2,1,2),_,RIGHT(B2,LEN(B2)-FIND(  ,B2)),@eshopping.com) ";
	assertTrue(StackQueueUtility.isBracketsBalanced(input));
}
@Test
public void test0_07_isBracketsBalanced() {  
	
	String input = "CONCATENATE(MID(B2,1,2),_,RIGHT(B2,LEN(B2)-FIND(  ,B2),@eshopping.com) ";
	assertFalse(StackQueueUtility.isBracketsBalanced(input));
}

@Test
public void test0_08_isBracketsBalanced() {  
	
	String input = "<html>  <body>  <h2> hello </h2>  </body>  </html> ";
	assertTrue(StackQueueUtility.isBracketsBalanced(input));
}
//-----------------------------------------------------------------------------
	@Test
	public void test1_myStack_000_initialAndGeneric() {
		MyStack st = new MyStack();
		 
		int leng = st.elementData.length;
		assertEquals(5, leng);
		Integer exp [] = {null, null, null, null, null};
		assertArrayEquals(exp, st.elementData);
		assertEquals(0, st.size());
		assertTrue(st.isEmpty());
		
		MyStack st2 = new MyStack();
		assertEquals(5, st2.elementData.length);
		assertEquals(0, st2.size());
		assertTrue(st2.isEmpty());
		
	 
	}
 

	@Test
	public void test1_myStack_00_getContainIndexSet() {
		MyStack st = new MyStack();
		
		// manually do this to avoid using add()
		Integer ele1 = 10; //new Integer(10);
		Integer ele2 = Integer.valueOf(20); //new Integer(20);
		Integer ele3 = new Integer(30);
		
		Integer tmp [] = {ele1, ele2, ele3, null,null};
		st.size=3;
		st.elementData = tmp;
		
		System.out.println(st.peek());
		
		assertTrue( st.peek()==ele3 );
		
		
		Integer ele1b = new Integer(10 ); // equals to course1
		Integer ele4 = new Integer (100); // not equals to course4
		Integer ele2b = 20; // equals to course2  autoboxing
		assertTrue(st.contains(ele1b));
		assertFalse(st.contains(ele4));
		assertTrue(st.contains(ele2b));
		
		 
		
	}
	
	@Test
	public void test1_myStack_01_push() {
		MyStack st = new MyStack();
		 
		Integer ele1 = 10; //new Integer(10);
		Integer ele2 = 20; //new Integer(20);
		Integer ele3 = 30; //new Integer(30);
		
		Integer tmp [] = {ele1, null, null, null,null};
		Integer tmp2 [] = {ele1, ele2, ele3, null,null};
		
		st.push(ele1);   
		assertArrayEquals(tmp, st.elementData);
		assertEquals(1, st.size());
		assertFalse(st.isEmpty());
		 
		
		st.push(ele2);
		st.push(ele3); 
		assertArrayEquals(tmp2, st.elementData);
		assertEquals(3, st.size());
		assertFalse(st.isEmpty());
	 
		
		
		assertTrue( st.peek()== ele3 );
		 
		
		
		Integer ele1b = new Integer(10 ); // equals to course1
		Integer ele4 = new Integer (100); // not equals to course4
		Integer ele2b = 20; // equals to course2  autoboxing
		assertTrue(st.contains(ele1b));
		assertFalse(st.contains(ele4));
		assertTrue(st.contains(ele2b));
	 
			
	}

	//test expansion
		@Test
		public void test1_myStack_02_pushExpansion() {
						
			MyStack st = new MyStack();
			 
			Integer ele1 = new Integer(10);
			Integer ele2 = new Integer(20);
			Integer ele3 = new Integer(30);
			Integer ele4 = new Integer(40);
			Integer ele5 = new Integer(50);
			
			st.push(ele1); st.push(ele2); st.push(ele3); st.push(ele4); st.push(ele5);
			
			Integer tmp [] = {ele1, ele2, ele3, ele4, ele5};
			assertArrayEquals(tmp, st.elementData);
			
			Integer ele6 = new Integer(500);
			st.push (ele6);
			 
			Integer tmp2 [] = {ele1, ele2, ele3, ele4, ele5, ele6, null, null, null, null};
			assertArrayEquals(tmp2, st.elementData);
			assertEquals(6, st.size());
			 
		    Integer ele7 = new Integer(4413);
			st.push(ele7);
			Integer tmp3 [] = {ele1, ele2, ele3, ele4, ele5, ele6, ele7, null, null, null};
			assertArrayEquals(tmp3, st.elementData);
			assertEquals(7, st.size());
			assertTrue(st.peek() == ele7);
			
		 
	
		}
		
		@Test
		public void test1_myStack_03_pop() {
		 
			MyStack st = new MyStack();
			 
			Integer ele1 = new Integer(10);
			Integer ele2 = new Integer(20);
			Integer ele3 = new Integer(30);
			Integer ele4 = new Integer(40);
			 
			
			st.push(ele1); st.push(ele2); st.push(ele3); st.push(ele4);  
						
			assertEquals(4, st.size());
			 			
						
			Integer b = st.pop();  
			Integer exp2[] = {ele1, ele2, ele3, null, null};
			assertArrayEquals(exp2, st.elementData);
			assertEquals(3, st.size());
			assertFalse( st.contains(ele4) );
			assertTrue( st.peek() == ele3);
			assertTrue( b == ele4);
			 
			Integer b2 =st.pop();  
			Integer exp3[] = {ele1, ele2, null, null, null};
			assertArrayEquals(exp3, st.elementData);
			assertEquals(2, st.size());
			assertFalse( st.contains(ele3) );
			assertTrue( st.peek() == ele2);
			assertTrue( b2 == ele3);
			
					 
		}

 
}