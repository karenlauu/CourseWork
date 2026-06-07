package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;


public class JunitTestsPublic {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test_pb_01_01() {
		
		int [][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		String correctOut = "The maximum values along the rows are [3,6,9].\n"
				+ "The minimum values along the rows are [1,4,7].\n"
				+ "The maximum values along the columns are [7,8,9].\n"
				+ "The minimum values along the columns are [1,2,3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test pb_01_01 failed.", correctOut,result);
	}
	@Test
	public void test_pb_01_02() {
		
		int [][] data = null;
		String correctOut = "[null array].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test pb_01_02 failed.", correctOut,result);
	}
	@Test
	public void test_pb_01_03() {
		
		int [][] data = { {2, 1, 3}, {5, 4, 6}, {8, 7, 9} };
		String correctOut = "The maximum values along the rows are [3,6,9].\n"
				+ "The minimum values along the rows are [1,4,7].\n"
				+ "The maximum values along the columns are [8,7,9].\n"
				+ "The minimum values along the columns are [2,1,3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test pb_01_03 failed.", correctOut, result);
	}
	@Test
	public void test_pb_02_01() {
		
		int [][] data = null;
		String correctOut = "[null array].";
		
		String result = TwoDArrayProblems.rotateArray(data);
		
		assertEquals("Test pb_02_01 failed.", correctOut, result);
	}
	@Test
	public void test_pb_02_02() {
		
		int [][] data = { {2, 1, 3}, {5, 4}, {8, 7, 9} };
		String correctOut = "[not a square array].";
		
		String result = TwoDArrayProblems.rotateArray(data);
		
		assertEquals("Test pb_02_02 failed.", correctOut, result);
	}
	@Test
	public void test_pb_02_03() {
		
		int [][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		String correctOut = "{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}.";
		
		String result = TwoDArrayProblems.rotateArray(data);
		
		assertEquals("Test pb_02_03 failed.", correctOut, result);
	}
	@Test
	public void test_pb_04_01() {
		
		double [][] data = {{0.15,0.875,0.375}, {0.55,0.005,0.225}, {0.30,0.12,0.4}};
		
		assertTrue("Test pb_04_01 failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}	
	@Test
	public void test_pb_05_01() {
		
		double [][] data = {{1.0, 2.0}, {3.0, 2.0}};
		double [][] correctOut = {{0.0, 2.0}, {2.0, 0.0}};
		
		assertArrayEquals("Test pb_05_01 failed.", correctOut,TwoDArrayProblems.findDistances(data));
	}	
	@Test
	public void test_pb_06_01() {
		
		assertNotNull("Test pb_06_01 failed.", new Temperature(25.3));
	}	
	@Test
	public void test_pb_06_02() {
		Temperature t = new Temperature(32.0);
		assertEquals("Test pb_06_02 failed.", 0.0, t.getCelsius(),0.0);
	}	
	@Test
	public void test_pb_06_03() {
		Temperature t = new Temperature(32.0);
		double []correctOut = {32.0,0.0,273.15};
		assertArrayEquals("Test pb_06_03 failed.", correctOut, t.getAll(),0.0);
	}	
	@Test
	public void test_pb_07_01() {
		
		assertNotNull("Test pb_07_01 failed.", new Car(2025, "Toyota"));
	}	
	@Test
	public void test_pb_07_02() {
		Car c = new Car(2025, "Toyota");
		c.accelerate();
		assertEquals("Test pb_07_02 failed.", 5, c.getSpeed());
	}	
	@Test
	public void test_pb_07_03() {
		Car c = new Car(2025, "Toyota");
		String [] correctOut = {"This is a 2025 model vehicle.","It is made by Toyota.", "It is cruising at 0 kmph."};
		assertArrayEquals("Test pb_07_03 failed.", correctOut, c.getDescription());
	}	
}
