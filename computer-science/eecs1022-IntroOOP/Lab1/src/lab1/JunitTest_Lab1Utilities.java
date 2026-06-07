package lab1;

import static org.junit.Assert.*;

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
public class JunitTest_Lab1Utilities {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test_00_00_() {
		int m = 1, d =1;
		String result = Lab1Utilities.weather(m, d);
		
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_01_() {
		int m = 2, d =27;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	
	@Test
	public void test_00_03_() {
		int m = 3, d =25;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_04_() {
		int m = 3, d =26;
		String result = Lab1Utilities.weather(m, d);
		String expect = "Unknown";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_05_() {
		int m = 10, d =15;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Fall";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_06_() {
		int m = 1, d =30;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_07_() {
		int m = 2, d =20;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	
	@Test
	public void test_00_08_() {
		int m = 4, d =16;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Spring";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_09_() {
		int m = 7, d =14;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Summer";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	
	
	@Test
	public void test_00_10_() {
		int m = 8, d =15;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Summer";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
		
		
	}
	
	@Test
	public void test_00_11_() {
		int m = 5, d =15;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Spring";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
		
		
	}
	
	@Test
	public void test_00_12_() {
		int m = 12, d =20;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
		
		
	}
	
	
	@Test
	public void test_00_13_() {
		int m = 12, d =10;
		String result = Lab1Utilities.weather(m, d);
		String expect = "Unknown";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		assertEquals(str, expect, result);	
		
	}
	@Test
	public void test_00_14_() {
		int m = 7, d =10;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Summer";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		assertEquals(str, expect, result);	
		
	}
	
	@Test
	public void test_02_00_() {
		int x=100;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (100.0) is equivalent to (37.78) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_02_01_() {
		int x=10;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (10.0) is equivalent to (-12.22) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_02_02_() {
		int x=150;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (150.0) is equivalent to (65.56) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_02_03_() {
		int x=50;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (50.0) is equivalent to (10.00) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	@Test
	public void test_02_04_() {
		int x=15;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (15.0) is equivalent to (-9.44) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	@Test
	public void test_02_05_() {
		int x=25;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (25.0) is equivalent to (-3.89) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	@Test
	public void test_02_06_() {
		int x=35;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (35.0) is equivalent to (1.67) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	@Test
	public void test_02_07_() {
		int x=95;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (95.0) is equivalent to (35.00) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	@Test
	public void test_02_08_() {
		int x=75;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (75.0) is equivalent to (23.89) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	@Test
	public void test_02_09_() {
		int x=96;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (96.0) is equivalent to (35.56) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	@Test
	public void test_02_10_() {
		int x=39;
		String result= Lab1Utilities.temperatureConverter(x);
		String expect = "Fahrenheit (39.0) is equivalent to (3.89) in Celsius";
		String str = String.format("\nTest temperatureConverter fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	
	
	@Test
	public void test_03_00_() {
		int  x=7000;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		
		String expect = "Age in days (7000), age in years is (19), months (2), with remaining days (5)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_01_() {
		int  x=17000;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (17000), age in years is (46), months (7), with remaining days (0)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_02_() {
		int  x=37000;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (37000), age in years is (101), months (4), with remaining days (15)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_03_() {
		int  x=3650;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (3650), age in years is (10), months (0), with remaining days (0)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_04_() {
		int  x=3750;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (3750), age in years is (10), months (3), with remaining days (10)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_05_() {
		int  x=3850;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (3850), age in years is (10), months (6), with remaining days (20)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_03_06_() {
		int  x=4850;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (4850), age in years is (13), months (3), with remaining days (15)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_03_07_() {
		int  x=5850;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (5850), age in years is (16), months (0), with remaining days (10)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_08_() {
		int  x=7850;
		String result= Lab1Utilities.ageInYearsDetailed(x);
		String expect = "Age in days (7850), age in years is (21), months (6), with remaining days (5)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_03_09_() {
		int  x=9856;
		String result= Lab1Utilities.ageInYearsDetailed(x);		
		String expect = "Age in days (9856), age in years is (27), months (0), with remaining days (1)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_03_10_() {
		int  x=12548;
		String result= Lab1Utilities.ageInYearsDetailed(x);		
		String expect = "Age in days (12548), age in years is (34), months (4), with remaining days (18)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	
	@Test
	public void test_03_11_() {
		int  x=1285;
		String result= Lab1Utilities.ageInYearsDetailed(x);		
		String expect = "Age in days (1285), age in years is (3), months (6), with remaining days (10)";
		String str = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	
	@Test
	public void test_04_01_() {
		double x=157;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "157.00cm is 5ft and 1.81in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_04_02() {
		double x=57;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "57.00cm is 1ft and 10.44in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_04_03() {
		double x=37;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "37.00cm is 1ft and 2.57in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_04_04() {
		double  x=307.51;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "307.51cm is 10ft and 1.07in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);;
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_04_05() {
		double  x=308.51;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "308.51cm is 10ft and 1.46in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_04_06() {
		double  x=608.25;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "608.25cm is 19ft and 11.47in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_04_07() {
		double  x=88.25;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "88.25cm is 2ft and 10.74in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_04_08() {
		double  x=91.05;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "91.05cm is 2ft and 11.85in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);		
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_04_09() {
		double  x=55.63;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "55.63cm is 1ft and 9.90in";
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_04_10() {
		double  x=73.56;
		String result= Lab1Utilities.distanceConverter(x);
		String expect = "73.56cm is 2ft and 4.96in";		
		String str = String.format("\nTest distanceConverter fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);		
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_05_01() {
		double x=6000.0, y = 4.25;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 6000.00 with interest 4.25, after five years balance is 7388.08";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_05_02() {
		double x=3000.0, y = 3.5;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 3000.00 with interest 3.50, after five years balance is 3563.06";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_05_03() {
		double x=4000.0, y = 2.25;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 4000.00 with interest 2.25, after five years balance is 4470.71";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_05_04() {
		double x=1000.0, y = 2.25;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 1000.00 with interest 2.25, after five years balance is 1117.68";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_05_05() {
		double x=1050.0, y = 1.25;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 1050.00 with interest 1.25, after five years balance is 1117.29";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);		
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_05_06() {
		double x=2150.0, y = 3.05;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 2150.00 with interest 3.05, after five years balance is 2498.49";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_05_07() {
		double x=150.0, y = 3.45;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 150.00 with interest 3.45, after five years balance is 177.72";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	
	@Test
	public void test_05_08() {
		double x=1455.0, y = 4.5;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 1455.00 with interest 4.50, after five years balance is 1813.19";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_05_09() {
		double x=4055.0, y = 1.5;
		String result= Lab1Utilities.fiveYearBalance(x,y);
		String expect = "The balance was 4055.00 with interest 1.50, after five years balance is 4368.39";
		String str = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_06_01() {
		int pounds = 75, feet =15,inches=45;
		
		double  result= Lab1Utilities.computeBMI(pounds, feet, inches);
		double expect = 1.0;
		String str = String.format("\nTest computeBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
		
	}
	@Test
	public void test_06_02() {
		int pounds = 80, feet =13,inches=45;
		
		double result= Lab1Utilities.computeBMI(pounds, feet, inches);
		double expect = 1.4;
		String str = String.format("\nTest computeBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
		
	}
	
	@Test
	public void test_06_03() {
		int pounds = 135, feet =7,inches=45;
		
		
		double result= Lab1Utilities.computeBMI(pounds, feet, inches);
		double expect = 5.7;
		String str = String.format("\nTest computeBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
	}
	
	
	@Test
	public void test_06_04() {
		int pounds = 105, feet =8,inches=25;
		
		
		double result= Lab1Utilities.computeBMI(pounds, feet, inches);
		double expect = 5.04;
		String str = String.format("\nTest computeBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
	}
	
	@Test
	public void test_06_05() {
		int pounds = 100, feet =9,inches=35;
		
		
		double result= Lab1Utilities.computeBMI(pounds, feet, inches);
		double expect = 3.44;
		String str = String.format("\nTest computeBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
	}
	
	@Test
	public void test_06_06() {
		int pounds = 90, feet =9,inches=25;
		
		
		double result= Lab1Utilities.computeBMI(pounds, feet, inches);
		double expect = 3.58;
		String str = String.format("\nTest computeBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
	}
	
	
	@Test
	public void test_07_01_() {
		final int n = 16;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 16 is Perfect Square", result);
	}
	@Test
	public void test_07_02_() {
		final int n = 25;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 25 is Perfect Square", result);
	}
	@Test
	public void test_07_03_() {
		final int n = 64;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 64 is Perfect Square", result);
	}
	
	@Test
	public void test_07_04_() {
		final int n = 0;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 0 is Perfect Square", result);
	}
	@Test
	public void test_07_05_() {
		final int n = 100;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 100 is Perfect Square", result);;
	}
	@Test
	public void test_07_06_() {
		final int n = 99;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 99 is NOT Perfect Square", result);;
	}
	@Test
	public void test_07_07_() {
		final int n = 7;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 7 is NOT Perfect Square", result);;
	}
	
	@Test
	public void test_07_08_() {
		final int n = 11;
		String result = Lab1Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 11 is NOT Perfect Square", result);;
	}
	
	@Test
	public void test_07_09_() {
	    final int n = 15;
	    String result = Lab1Utilities.isPerfectSquare(n);

	    assertEquals("Integer 15 is NOT Perfect Square", result);
	}

	@Test
	public void test_07_10_() {
	    final int n = 21;
	    String result = Lab1Utilities.isPerfectSquare(n);

	    assertEquals("Integer 21 is NOT Perfect Square", result);
	}


	@Test
	public void test_07_11_() {
	    final int n = 49;
	    String result = Lab1Utilities.isPerfectSquare(n);
	    
	    assertEquals("Integer 49 is Perfect Square", result);
	}

	@Test
	public void test_07_12_() {
	    final int n = 81;
	    String result = Lab1Utilities.isPerfectSquare(n);
	    
	    assertEquals("Integer 81 is Perfect Square", result);
	}


	@Test
	public void test_07_13_() {
	    final int n = 121;
	    String result = Lab1Utilities.isPerfectSquare(n);
	    
	    assertEquals("Integer 121 is Perfect Square", result);
	}

	@Test
	public void test_07_14_() {
	    final int n = 77;
	    String result = Lab1Utilities.isPerfectSquare(n);
	    
	    assertEquals("Integer 77 is NOT Perfect Square", result);
	}

	@Test
	public void test_07_15_() {
	    final int n = 32;
	    String result = Lab1Utilities.isPerfectSquare(n);
	    
	    assertEquals("Integer 32 is NOT Perfect Square", result);
	}

	@Test
	public void test_07_16_() {
	    final int n = 13;
	    String result = Lab1Utilities.isPerfectSquare(n);
	    
	    assertEquals("Integer 13 is NOT Perfect Square", result);
	}


	
	
	
	
	
	
	
	
	
	
}
