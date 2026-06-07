package lab1;
//You are NOT allowed to add any "import" statement other than 

//the ones already in the starter files. 

////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : January 21, 2025

////////////////////////////////////////////////////////////
public class Lab1Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY

	private Lab1Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}
	
	
	/**
	 *  
	 * Write a static method named weather that takes two integers as parameters representing a month and day.
	 * The month is specified as an integer between 1 and 12, such as 1 for January, 2 for February, etc.
	 * The day of the month is an integer between 1 and 31. 
	 * The method returns a String indicating the standard Toronto weather season for the given month and day.
	 * 
	 * <p>If the date falls between December 15 and March 25,  the method should return  "The current weather season is Winter"</p>
	 * <p>If the date falls between April 1 and May 31, the method should return "The current weather season is Spring"</p>
	 * <p>If the date falls between June 1 and September 15, the method should return "The current weather season is Summer"</p>
	 * <p>if the date falls between September 16 and November 30, the method should return "The current weather season is Fall"</p>
	 * <p>Otherwise, return "Unknown".</p>
	 * 
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
    * 
	 *<p>
	 *Examples:
     * </p>
     *
     * <pre>
     * if month=12 and  day= 20 then return "The current weather season is Winter"
     * if month=3 and  day= 10 then return "The current weather season is Winter"
     * if month=4 and  day= 15 then return "The current weather season is Spring"
     * if month=7 and  day= 1 then return "The current weather season is Summer"
     * if month=10 and  day= 1 then return "The current weather season is Fall"
     * if month=12 and  day= 10 then return "Unknown"
     * </pre>
	 * <p>
     * Remember that double quotations are shown above to indicate the beginning and
     * end of the string value, and these double quotations are not part of the
     * return value.
     * </p> 
	 * 
	 * @param month  Positive integer between 1 and 12, such as 1 for January, 2 for February, etc. 
	 * @param day  Positive integer between 1 and 31
	 * @return String indicates the standard Toronto weather season for that month and day.
	 * <p>
     *     <strong> Precondition: </strong> month and day are non-negative values
     * </p>
	 */	
	public static String weather(int month, int day) {
		/* Your implementation of this method starts here.
	        * Recall that :
	        * 1. No System.out.println statements should appear here.
	        * 	  Instead, you need to return the result.
	        * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	        *    Instead, refer to the input parameters of this method.
	        */
		if (month < 1 || month > 12 || day < 1 || day > 31) {
			return "Unknown";
		}
	    
		if ((month == 12 && day >=15) || (month == 1) || (month == 2) || (month ==3 && day <= 25)) {
			return "The current weather season is Winter";
		}
		
		else if ((month == 4 && day >= 1) || (month == 5 && day <= 31)) {
			return "The current weather season is Spring";
		}
		else if ((month == 6 && day >= 1) || (month ==7) || (month == 8) ||(month == 9 && day <= 15)) {
			return "The current weather season is Summer";
		}
		else if ((month == 9 && day >= 16) || (month == 10) || (month == 11 && day <= 30)) {
			return "The current weather season is Fall";
		}
		
		else 
			return "Unknown";
	}
	
	
	/**
	 * Write a static method name  temperatureConverter that 
	 * converts a Fahrenheit degree to Celsius using the
	 * formula celsius = (5/9) (fahrenheit - 32).
	 *
	 * The method receives temperature degrees in Fahrenheit and returns string
	 * value as shown below in the examples. The celsius degree is rounded to two
	 * decimal points.
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if fahrenheit=100.0 then return "Fahrenheit (100.0) is equivalent to (37.78) in Celsius"
	 * if fahrenheit=10.0 then return "Fahrenheit (10.0) is equivalent to (-12.22) in Celsius"
	 * if fahrenheit=49.0 then return "Fahrenheit (49.0) is equivalent to (9.44) in Celsius"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param fahrenheit input temperature value as double
	 * @return string value, see above examples
	 */
   
	public static String temperatureConverter(double fahrenheit) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		double celsius = (5.0/9)*(fahrenheit - 32);
		String strcelsius = String.format("%.2f", celsius);
		String result = "Fahrenheit (" + fahrenheit + ") is equivalent to (" + strcelsius + ") in Celsius" ;
		
		
		return result;
		}

	
	/**
	 * Write a static method name ageinyearsDetailed that takes the age in days 
	 * and then calculates the age
	 * in years, months, and remaining days. Assume there are 365 days 
	 * in a year and approximately 30 days in a month.
	 * The method returns a string value as shown in the examples below.
	 *
	 * Examples:
	 *<pre>
	 * if days=7000 then return "Age in days (7000), age in years is (19), months (2), with remaining days (5)"
	 * if days=1900 then return "Age in days (1900), age in years is (5), months (2), with remaining days (15)"
	 * if days=8016 then return "Age in days (8016), age in years is (21), months (11), with remaining days (21)"
	 *</pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 *
	 * @param days input days value as int value
	 * @return String value as shown in the examples above (Check test cases)
	 */
	public static String ageInYearsDetailed(int days) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		if (days >= 365) {
			int years = days/365;
			int remaining = days % 365;
			int months = remaining / 30; 
			int day = remaining % 30;
			return "Age in days (" + days + "), age in years is (" + years + "), months (" + months + "), with remaining days (" + day + ")";
		}
		else {
			int years = 0; 
			int months = days / 30;
			int day = days % 30;
			
			return "Age in days (" + days + "), age in years is (" + years + "), months (" + months + "), with remaining days (" + day + ")";
		}
    }
	
	
	
	/**
	 * Implement the method that converts centimetres to an integral number of feet
	 * and any remaining inches. The method receives the centimetres as double data
	 * type and returns string value as shown in the examples below. Note that the
	 * remaining inches value is rounded to two decimal points.
	 * 
	 * <p>
	 * You need the following facts to complete the implementation of this method.
	 * There are 12 inches in a foot and one inch is 2.54 centimetres.
	 * 
	 * </p>
	 * 
	 * *
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if cm=157.0 then return "157.00cm is 5ft and 1.81in"
	 * if cm=57.15 then return "57.15cm is 1ft and 10.50in"
	 * if cm=37.0 then return "37.00cm is 1ft and 2.57in"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param cm double value of centimetres
	 * @return String value as shown above
	 */

	public static String distanceConverter(double cm) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double inch = cm / 2.54; 
		if (inch >= 12) {
			double feet = inch / 12;
			feet = Math.floor(feet);
			double inchs = inch % 12;
			String strcm = String.format("%.2f", cm);
			String strin = String.format("%.2f", inchs);	
			String strft = String.format("%.0f", feet);	
			String results = strcm + "cm is " + strft + "ft and " + strin + "in";
			return results;
		}
		else {
			int feet = 0;
			String strcm = String.format("%.2f", cm);
			String strin = String.format("%.2f", inch);		
			String results = strcm + "cm is " + feet + "ft and " + strin + "in";
			return results;	
		}
	}

	/**
	 * Implement the method that takes in two numbers as input arguments: an account
	 * balance (rounded to two decimal points) and an annual interest rate expressed
	 * as a percentage. The method return string indicated the balance after five
	 * years have elapsed. The return balance after five years should be rounded to
	 * two decimal points See examples below. Note that the interest from the first
	 * year is added back to the bank balance and is, therefore, itself subject to
	 * interest in the second year, and so on.
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if balance=6000.00 and interest=4.25 then return "The balance was 6000.00 with interest 4.25, after five years balance is  7388.08"
	 * if balance=3000.00 and interest=3.50 then return "The balance was 3000.00 with interest 3.50, after five years balance is  3563.06"
	 * if balance=4000.00 and interest=2.25 then return "The balance was 4000.00 with interest 2.25, after five years balance is  4470.71"
	 * </pre>
	 * 
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param balance  : input balance
	 * @param interest : an annual interest rate expressed as a percentage. rounded
	 *                 to two decimal points
	 * @return String value as shown in the examples above
	 */

	public static String fiveYearBalance(double balance, double interest) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		String interestt = String.format("%.2f", interest);
		double rate = interest/100 + 1;
		String balances = String.format("%.2f", balance);
		for (int i =1; i <= 5; i++)
			balance  *= rate;
		
		String balancee = String.format("%.2f", balance);
		String newbalance = "The balance was " + balances + " with interest " + interestt + ", after five years balance is " + balancee;

		return newbalance;
	}
	
	
	
	/**
	 * Implement the following method, which receives a weight in pounds and a
	 * height in feet and inches for any given person, and returns the person's body
	 * mass index (BMI) rounded to 2 decimal place.
	 * 
	 * Note: the height of a person is represented in both feet and inches input
	 * parameters. So, if person has height is 10 feet and 15 inches then feet input
	 * parameter will be 10 and inches input parameter will be 15.
	 * 
	 * You must convert the weight in pounds into kilograms by using the following
	 * conversion rate: <strong>1 pound is equal to 0.453592 kilograms.</strong> You
	 * must convert the height in feet and inches into metres by using the following
	 * conversion rates: <strong>1 foot is equal to 0.3048 metre, and 1 inch is
	 * equal to 0.0254 metre.</strong> Given a weight in kilograms <i>w</i> and a
	 * height in metres <i>h</i>, the BMI is <i>w</i> / <i>h</i><sup>2</sup>.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if pounds=75, feet=15  and inches=45  then  return 1.04
	 * if pounds=80, feet=13  and inches=45  then  return 1.39
	 * if pounds=135, feet=7  and inches=45 then  return  5.7
	 * </pre>
	 * 
	 * @param pounds  : int input value for weight in pounds
	 * @param feet    : int input value for height in feet, should be used with
	 *                inches input
	 * @param inches: int input value for height in inches
	 * @return the person's body mass index (BMI) rounded to 2 decimal place.
	 */

	public static double computeBMI(int pounds, int feet, int inches) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		double kilos = pounds*0.453592;
		double height1 = feet*0.3048;
		double height2 = inches*0.0254;
		double total_height = height1 + height2;
		
		double denom = Math.pow(total_height, 2);
		double BMI = kilos/denom;
		
		BMI = Math.round(BMI*100.0) /100.0;
		
		return BMI;
	}

	
	/**
	 * Write a static method to determine if the given integer is perfect square.
	 * <p>
	 * Note: The numbers 0, 1, 4, 9, 16, 25, ... are perfect squares.
	 * </p>
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Perfect Square"
	 * if n= 10  then  return "Integer 10 is NOT Perfect Square"
	 * if n= 63 then  return "Integer 63 is NOT Perfect Square"
	 * if n= 64  then  return "Integer 64 is NOT Perfect Square"
	 * </pre>
	 * 
	 * 
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
	 * @param n :int input integer
	 * 
	 *          @pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 * 
	 * @return String value see the above examples
	 */

	public static String isPerfectSquare(int n) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		double check = Math.sqrt(n); 
		double num = Math.floor(check);
		if (check == num) {
			return "Integer " + n + " is Perfect Square";
		}
		else 
			return "Integer " + n + " is NOT Perfect Square";

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
