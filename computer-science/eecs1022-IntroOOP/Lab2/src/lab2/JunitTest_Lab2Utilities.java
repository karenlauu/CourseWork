package lab2;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

//ALREADY IMPLEMENTED; DO NOT MODIFY 
//NO NEED TO SUBMIT THIS FILE

/*
* Tests included in this class serve as documentation on how instances of a
* class work.
* 
* Be sure to also read the Lab instructions PDF carefully
* 
* Programming IDEs such as Eclipse are able to fix such compilation errors for
* you. However, you are advised to follow the guidance as specified in the
* written Lab instructions PDF to fix these compilation errors manually,
* because: 1) it helps you better understand how the intended classes and
* methods work together; and 2) you may be tested in a written test or exam
* without the assistance of IDEs.
* 
*/


public class JunitTest_Lab2Utilities {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test_01_01_() {
		final String str = "mystring123";
		int n = Lab2Utilities.digitCountinString(str);
		int expect = 3;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_02_() {
		final String str = "Test03 on Thursday 19-03";
		int n = Lab2Utilities.digitCountinString(str);
		int expect = 6;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_03_() {
		final String str = "mystring";
		int n = Lab2Utilities.digitCountinString(str);
		int expect = 0;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_04_() {
		final String str = "EECS1021EECS1022";
		int n = Lab2Utilities.digitCountinString(str);
		int expect = 8;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_05_() {
		final String str = "Hellolab3ison16062023";
		int n = Lab2Utilities.digitCountinString(str);
		int expect = 9;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_06_() {
		final String str = "12 34 56";
		int n = Lab2Utilities.digitCountinString(str);
		int expect = 6;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_07_() {
		final String str = "AbCDefG";
		int n = Lab2Utilities.digitCountinString(str);
		int expect = 0;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	
	@Test
	public void test_02_01_() {
		final int x = 2;
		final int y =9;
		final int n =2;

		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		int expectedlength = 6;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_02_02_() {
		final int x = 20;
		final int y =30;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);

		
		int expectedlength = 20;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {20,21,22,23,24,25,26,27,28,29,30};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_02_03_() {
		final int x = 2;
		final int y =7;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		int expectedlength = 15;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {2,3,4,5,6,7};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	@Test
	public void test_02_04_() {
		final int x = 3;
		final int y =8;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		
		int expectedlength = 15;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {3,4,5,6,7,8};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	@Test
	public void test_02_05_() {
		final int x = 13;
		final int y =18;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		
		int expectedlength = 20;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {13,14,15,16,17,18};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	@Test
	public void test_02_06_() {
	    final int x = -6;
	    final int y = -2;
	    final int n = 3;
	    String result = Lab2Utilities.stringOfRandomInt(n, x, y);
	    
	    int expectedLength = 12;
	    int actualLength = result.length();
	    String lengthString = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned (%d), but correct string length should be (%d)\n", x, y, actualLength,
	            expectedLength);
	    
	    assertEquals(lengthString, expectedLength, actualLength);
	    
	    Integer[] array = {-6, -5, -4, -3, -2};
	    HashSet<Integer> expectSet = new HashSet<Integer>(Arrays.asList(array));
	    
	    boolean flag = false; 
	    String[] parts = result.split("\\<");
	    for (String part : parts) {
	        String[] values = part.split("\\>");
	        for (String value : values) {
	            if (value.length() != 0) {
	                Integer val = Integer.parseInt(value);
	                flag = expectSet.contains(val);
	                String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned (%d), but correct should be any number from set (%s)\n", x, y, val,
	                        expectSet.toString());
	                assertTrue(str, flag);
	            }
	        }
	    }
	}

	@Test
	public void test_02_07_() {
	    final int x = 100;
	    final int y = 200;
	    final int n = 4;
	    String result = Lab2Utilities.stringOfRandomInt(n, x, y);
	    
	    int expectedLength = 20;
	    int actualLength = result.length();
	    String lengthString = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned (%d), but correct string length should be (%d)\n", x, y, actualLength,
	            expectedLength);
	    
	    assertEquals(lengthString, expectedLength, actualLength);
	    
	    Integer[] array = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
	                       121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141,
	                       142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162,
	                       163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183,
	                       184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200};
	    HashSet<Integer> expectSet = new HashSet<Integer>(Arrays.asList(array));
	    
	    boolean flag = false; 
	    String[] parts = result.split("\\<");
	    for (String part : parts) {
	        String[] values = part.split("\\>");
	        for (String value : values) {
	            if (value.length() != 0) {
	                Integer val = Integer.parseInt(value);
	                flag = expectSet.contains(val);
	                String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned (%d), but correct should be any number from set (%s)\n", x, y, val,
	                        expectSet.toString());
	                assertTrue(str, flag);
	            }
	        }
	    }
	}

	
	@Test
	public void test_03_01_() {
		final String n = "11101110001";
		int result = Lab2Utilities.lengthofMaxConsecutiveZeros(n);
		int expect = 3;
		String str = String.format(
				"\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n, result,
				expect);
		assertTrue(str, expect == result);
	}

	@Test
	public void test_03_02_() {
		final String n = "111000000001110001";
		int result = Lab2Utilities.lengthofMaxConsecutiveZeros(n);
		int expect = 8;
		String str = String.format(
				"\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n, result,
				expect);
		assertTrue(str, expect == result);
	}

	@Test
	public void test_03_03_() {
		final String n = "11101";
		int result = Lab2Utilities.lengthofMaxConsecutiveZeros(n);
		int expect = 1;
		String str = String.format(
				"\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n, result,
				expect);
		assertTrue(str, expect == result);
	}

	@Test
	public void test_03_04_() {
		final String n = "11100000000100000000000000000000000000000000";
		int result = Lab2Utilities.lengthofMaxConsecutiveZeros(n);
		int expect = 32;
		String str = String.format(
				"\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n, result,
				expect);
		assertTrue(str, expect == result);
	}
	
	@Test
	public void test_03_05_() {
		final String n = "1101111001111000";
		int result = Lab2Utilities.lengthofMaxConsecutiveZeros(n);
		int expect = 3;
		String str = String.format(
				"\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n, result,
				expect);
		assertTrue(str, expect == result);
	}

	@Test
	public void test_03_06_() {
		final String n = "00000000";
		int result = Lab2Utilities.lengthofMaxConsecutiveZeros(n);
		int expect = 8;
		String str = String.format(
				"\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n, result,
				expect);
		assertTrue(str, expect == result);
	}



	
	@Test
	public void test_04_01_() {
		String s1 = "Friday" , s2 = "Sunday",  s3 = "Monday";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("FriayayayMoMoMoMoMo", result);
	}

	
	@Test
	public void test_04_02_() {
		String s1 = "" , s2 = "Sunday",  s3 = "Monday";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("Invalid", result);
	}
	@Test
	public void test_04_03_() {
		String s1 = "Hello" , s2 = "B",  s3 = "AB";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("HelBBBABABABABAB", result);
	}
	
	@Test
	public void test_04_04_() {
		String s1 = "EECS1022" , s2 = "Student",  s3 = "Lab";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("EECSntntntLaLaLaLaLa", result);
	}
	
	@Test
	public void test_04_05_() {
		String s1 = "EECS-1022" , s2 = "EECS-Student",  s3 = "TimeLab";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("EECS-ntntntTiTiTiTiTi", result);
	}
	
	@Test
	public void test_04_06_() {
		String s1 = "12345" , s2 = "abc",  s3 = "XYZ";
	    String result = Lab2Utilities.mixStrings(s1, s2, s3);
	    
	    assertEquals("123bcbcbcXYXYXYXYXY", result);
	}

	@Test
	public void test_04_07_() {
	    String s1 = "Testing" , s2 = "Test",  s3 = "123";
	    String result = Lab2Utilities.mixStrings(s1, s2, s3);
	    
	    assertEquals("Testststst1212121212", result);
	}

	@Test
	public void test_04_08_() {
	    String s1 = "Hello" , s2 = "World",  s3 = "";
	    String result = Lab2Utilities.mixStrings(s1, s2, s3);
	    
	    assertEquals("Invalid", result);
	}


	@Test
	public void test_05_01_() {
		String inputStr = "bbbcfreb$b";
		String expected = "b3c1f1r1e1b1$1b1";
		String result = Lab2Utilities.stringCompressor(inputStr);
		String error = String.format("error on stringCompressor, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));

	}

	@Test
	public void test_05_02_() {
		String inputStr = "bbbcffffreb$b";
		String expected = "b3c1f4r1e1b1$1b1";
		String result = Lab2Utilities.stringCompressor(inputStr);
		String error = String.format("error on stringCompressor, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));

	}

	@Test
	public void test_05_03_() {
		String inputStr = "SHOWSHOWSHOWSHOWCASECASE";
		String expected = "S1H1O1W1S1H1O1W1S1H1O1W1S1H1O1W1C1A1S1E1C1A1S1E1";
		String result = Lab2Utilities.stringCompressor(inputStr);

		String error = String.format("error on stringCompressor, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));

	}

	
	@Test
	public void test_05_04_() {
		String inputStr = "AAAAABBBBCCCCDDDD";
		String expected = "A5B4C4D4";
		String result = Lab2Utilities.stringCompressor(inputStr);
		String error = String.format("error on stringCompressor, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
	}

	@Test
	public void test_05_05_() {
		String inputStr = "abababab";
		String expected = "a1b1a1b1a1b1a1b1";
		String result = Lab2Utilities.stringCompressor(inputStr);
		String error = String.format("error on stringCompressor, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
	}

	@Test
	public void test_05_06_() {
		String inputStr = "Hello, world!";
		String expected = "H1e1l2o1,1 1w1o1r1l1d1!1";
		String result = Lab2Utilities.stringCompressor(inputStr);
		String error = String.format("error on stringCompressor, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
	}

	@Test
	public void test_05_07_() {
		String inputStr = "JavaProgramming";
		String expected = "J1a1v1a1P1r1o1g1r1a1m2i1n1g1";
		String result = Lab2Utilities.stringCompressor(inputStr);
		
		String error = String.format("error on stringCompressor, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
	}


	
	
	
	@Test
	public void test_06_01_() {
		short x=122;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (122) has binary representation [0000000001111010]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_02_() {
		short x=102;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (102) has binary representation [0000000001100110]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_06_03_() {
		short x=204;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (204) has binary representation [0000000011001100]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_04_() {
		short x=4;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (4) has binary representation [0000000000000100]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	@Test
	public void test_06_05_() {
		short x=0;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (0) has binary representation [0000000000000000]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_06_() {
		short x=127;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (127) has binary representation [0000000001111111]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_06_07_() {
		short x=511;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (511) has binary representation [0000000111111111]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_08_() {
		short x=1024;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (1024) has binary representation [0000010000000000]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_06_09_() {
	    short x = 63;
	    String result = Lab2Utilities.binaryRepresentation(x);
	    String expect = "The decimal value (63) has binary representation [0000000000111111]";
	    String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned (%s), but correct is (%s)\n",
	            x, result, expect);

	    assertEquals(str, expect, result);
	}

	@Test
	public void test_06_10_() {
	    short x = 1191;
	    String result = Lab2Utilities.binaryRepresentation(x);
	    String expect = "The decimal value (1191) has binary representation [0000010010100111]";
	    String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned (%s), but correct is (%s)\n",
	            x, result, expect);
	    
	    assertEquals(str, expect, result);
	}

	
	@Test
	public void test_07_01_() {
		int x=150, y=156;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (150) and (156) there are (3) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_02_() {
		int x=150, y=156;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (150) and (156) there are (3) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_07_03_() {
		int x=5, y=25;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (5) and (25) there are (7) multiple of 3, (5) multiple of 5 and (3) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_04_() {
		int x=1, y=4;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (1) and (4) there are (1) multiple of 3, (0) multiple of 5 and (0) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_07_05_() {
		int x=41, y=24;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Error: lower limit (41) is not less than or equal to upper limit (24)";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_07_06_() {
		int x=10, y=50;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (10) and (50) there are (13) multiple of 3, (9) multiple of 5 and (6) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_07_() {
		int x=51, y=61;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (51) and (61) there are (4) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_07_08_() {
		int x=75, y=85;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (75) and (85) there are (4) multiple of 3, (3) multiple of 5 and (2) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_09_() {
		int x=91, y=104;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (91) and (104) there are (4) multiple of 3, (2) multiple of 5 and (2) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_07_10_() {
		int x=401, y=524;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (401) and (524) there are (41) multiple of 3, (24) multiple of 5 and (17) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_07_11_() {
		int x=401, y=324;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Error: lower limit (401) is not less than or equal to upper limit (324)";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_07_12_() {
	    int x = 80, y = 95;
	    String result = Lab2Utilities.countofMult357(x, y);
	    String expect = "Between (80) and (95) there are (5) multiple of 3, (4) multiple of 5 and (2) multiple of 7";
	    String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned (%s), but correct is (%s)\n",
	            x, y, result, expect);
	   
	    assertEquals(str, expect, result);
	}

	@Test
	public void test_07_13_() {
	    int x = 200, y = 250;
	    String result = Lab2Utilities.countofMult357(x, y);
	    String expect = "Between (200) and (250) there are (17) multiple of 3, (11) multiple of 5 and (7) multiple of 7";
	    String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned (%s), but correct is (%s)\n",
	            x, y, result, expect);
	    
	    assertEquals(str, expect, result);
	}

	
	@Test
	public void test_08_01_() {
		final int n = 16;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (16) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	
	
	@Test
	public void test_08_02_() {
		final int n = 161;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (161) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);
	
	}
	@Test
	public void test_08_03_() {
		final int n = 1006001;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1006001) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	@Test
	public void test_08_04_() {
		final int n = 1230603201;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1230603201) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);

	}

	
	@Test
	public void test_08_05_() {
		final int n = 76176;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (76176) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	
	
	@Test
	public void test_08_06_() {
		final int n = 1856851;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1856851) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);
	
	}
	@Test
	public void test_08_07_() {
		final int n = 1236321;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1236321) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	@Test
	public void test_08_08_() {
		final int n = 1600061;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1600061) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);

	}
	
	
	@Test
	public void test_09_01_() {
		short v1=122;
		short v2 = 15;
		
		String result= Lab2Utilities.binaryXor(v1, v2);
		
		String expect = "XOR of two values is [0000000001110101]";
		String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				v1,v2, result, expect);
	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_09_02_() {
		short v1=12;
		short v2 = 127;
		
		String result= Lab2Utilities.binaryXor(v1, v2);
		
		String expect = "XOR of two values is [0000000001110011]";
		String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				v1,v2, result, expect);
	
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_09_03_() {
		short v1=255;
		short v2 = 127;
		
		String result= Lab2Utilities.binaryXor(v1, v2);
		
		String expect = "XOR of two values is [0000000010000000]";
		String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				v1,v2, result, expect);
	
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_09_04_() {
	    short v1 = 8;
	    short v2 = 5;

	    String result = Lab2Utilities.binaryXor(v1, v2);

	    String expect = "XOR of two values is [0000000000001101]";
	    String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned (%s), but correct is (%s)\n",
	            v1, v2, result, expect);

	    assertEquals(str, expect, result);
	}

	@Test
	public void test_09_05_() {
	    short v1 = 0;
	    short v2 = 0;

	    String result = Lab2Utilities.binaryXor(v1, v2);

	    String expect = "XOR of two values is [0000000000000000]";
	    String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned (%s), but correct is (%s)\n",
	            v1, v2, result, expect);

	    assertEquals(str, expect, result);
	}

	@Test
	public void test_09_06_() {
	    short v1 = 100;
	    short v2 = 75;

	    String result = Lab2Utilities.binaryXor(v1, v2);

	    String expect = "XOR of two values is [0000000000101111]";
	    String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned (%s), but correct is (%s)\n",
	            v1, v2, result, expect);
	    assertEquals( expect, result);
	    assertEquals(str, expect, result);
	}

	@Test
	public void test_09_07_() {
	    short v1 = 255;
	    short v2 = 0;

	    String result = Lab2Utilities.binaryXor(v1, v2);

	    String expect = "XOR of two values is [0000000011111111]";
	    String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned (%s), but correct is (%s)\n",
	            v1, v2, result, expect);

	    assertEquals(str, expect, result);
	}

	
}
