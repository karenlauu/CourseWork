package lab2;

//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 


///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : February 3, 2025
//////////////////////////////


import java.util.Random;
public class Lab2Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	
	private Lab2Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}
	
	/**
	 * 
	 * Implement the method below that takes String <code>str</code> as the input
	 * argument and returns the number of digits in the given input String. Digit is
	 * any integer between <code>0</code> and <code>9</code>.
	 * <p>
	 * <strong> You can assume that the input String is not null and has length
	 * equal to 1 (at least one character).</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *  if str = "mystring123"  then return 3
	 *  if str = "123mystring123" then return 6
	 *  if str = "123my25str047ing123" then return 11
	 * </pre>
	 * 
	 * You will need a loop, <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. 
	 * 
	 * 
	 * 
	 * @param str : input string
	 * @return Number of digits in the given input String
	 */

	public static int digitCountinString(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		/* (as per instructions) assumed that input string is not null and length of 
		* at least one.
		*/
		
		int counts = 0;
		int string_length = str.length();
		
		for (int i = 0 ; i < string_length ; i++ ) {
			char letter = str.charAt(i);
			if (Character.isDigit(letter)) {
				counts ++;
			}
		}
		return counts;
	}
	
	/**
	 * Write a static method to generate string of random number. The number of
	 * generated random number is defined by integer value given by n the generated
	 * random integers should be between x and y (inclusive). Assuming n is positive
	 * and x is less than or equal to y.
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n=5, x= 5 and y =10 then some of possible returned strings {@code <6><8><9><10><7>} 
	 * or {@code <8><9><6><6><7>} , {@code <9><6><9><6><9>},..., {@code <5><9><6><5><10>},... .
	 * if n=2,  x= 2 and y =7  then some of possible returned strings {@code <3><7>} 
	 * or {@code <7><6>} , {@code <4><7>},...
	 * </pre>
	 * 
	 * @pre.
	 * <p>
	 * <strong> Precondition </strong>
	 * </p>
	 * <p>
	 * n is positive and x is less than or equal to y
	 * </p>
	 * 
	 * @param n : number of random integers
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 * @return generate string of random number the number of generated random
	 *         number is defined by integer value given by n the generated random
	 *         integers should be between x and y (inclusive).
	 */

	public static String stringOfRandomInt(int n, int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// (as per instructions) assumed that n is positive and x <= y
		
		Random random = new Random();
		
		String result = "";
		
		for (int i = 0; i< n; i++) {
			int value = random.nextInt(y-x +1)+x;
			String valuestr = "<"+value + ">";
			result += valuestr;
		}
		return result;
	}

	/**
	 * Implement the method below that takes binary String <code>str</code> as
	 * input argument and returns the length of maximum consecutive 0's in a given
	 *  binary input string.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 1 one character.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "11101110001"  then return 3
	 * 	if str = "10000001001" then return 6
	 * 	if str = "0000100111" then return 4
	 * 	if str = "01001010100111" then return 2
	 * </pre>
	 * 
	 * @param str : input binary string
	 * @return returns the length of maximum consecutive 0's in a given  binary input
	 *         string.
	 */
	public static int lengthofMaxConsecutiveZeros(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		/* (as per instructions) assumed input string is not null and contains at 
		* least length of one. 
		*/

		int lengths = str.length();
		int max_zeroes = 0;
		int zeroes = 0;
		for (int i = 0; i< lengths; i++) {
			if (str.charAt(i) == '0') {
				zeroes ++; // will count consecutive zeroes
				if (zeroes > max_zeroes) {
					max_zeroes = zeroes; // stores highest num of consec zeroes
				}
			} else {
				zeroes = 0; // if character is not 0, will reset counter
			}
		}
		return max_zeroes;
	}

	/**
	 * 
	 * Implement a static method that receives three strings as input 
	 * and returns a String datatype as an output.
	 * If the length of any input string is zero, 
	 * the method does nothing and returns a string with the value "Invalid". 
	 * Otherwise, the method does the following:
	 * <p>
	 * First, the method extracts the first half of the first string, s1. 
	 * For example, if s1 is "York", the length of s1 is even,  then the method returns "Yo".
	 * Otherwise, if s1 is "Hello",  then the method returns "Hel".
	 * </p>
	 *  <p>
	 * Second, the method extracts the last two characters from s2 if the s2 length is greater than or equal to 2; 
	 * otherwise, the method uses a single character from s2. After extracting the characters from s2, 
	 * the method creates three copies of the extracted characters. 
	 * For example, if s2 is "Hello", then the method will create a new string with 
	 * the following value "lololo". 
	 * If s2 is "Y", then the method will create a new string with the following value "YYY".
	 * </p>
	 *  <p>
	 * Third, the method extracts the first two characters from s3 if the length is greater than or equal to 2;
	 *  otherwise, the method uses a single character from s3. After extracting the characters from s3, 
	 *  the method creates five copies of the extracted characters. 
	 *  For example, if s3 is "Hello", then the method will create a new string with 
	 *  the following value "HeHeHeHeHe". 
	 *  If s3 is "A", the method will create a new string with the following value "AAAAA".
	 *  </p>
	 *  <p>
	 *  The method returns a string 
	 *  after concatenating the result from the first, second and third steps. 
	 *  See the below examples
	 *  </p> 
	 *   <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * If s1 = "York" , s2 = "Hello", s3 = "Time", return "YolololoTiTiTiTiTi"
	 * If s1 = "EECS-York" , s2 = "Hello EECS1022", s3 = "Lab Time", return "EECS-222222LaLaLaLaLa"
	 * If s1 = "W" , s2 = "A", s3 = "B",  return "WAAABBBBB"
	 * If s1 = "" , s2 = "Sunday", s3 = "Monday", return "Invalid"
	 * 
	 * </pre>
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
	 * @param s1 Input String 
	 * @param s2 Input String 
	 * @param s3 Input String 
	 * @return  string value, see above examples
	 */
	
	
	public static String mixStrings(String s1, String s2, String s3) {
		
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		if (s1.length() == 0 || s2.length() == 0 || s3.length() == 0) {
    		return "Invalid";
		}
		
		int length1 = s1.length();
		int length2 = s2.length();
		int length3 = s3.length();
		
		String newS1 = "";
		String newS2 = "";
		String newS3 = "";
				
		if (length1 % 2 == 0) {
			int endIndex = ((length1)/2);
			newS1 = s1.substring(0, endIndex);
		} else {
			int endIndex =  (length1)/2 + 1;
			newS1 = s1.substring(0, endIndex);
		}
		
		if (length2 >= 2) {
			String shortenS2 = s2.substring((length2)-2, (length2));
			newS2 = shortenS2 + shortenS2 + shortenS2;
		}else {
			newS2 = s2 + s2 + s2;
		}
		
		if (length3 >=2) {
			String shorten3 = s3.substring(0, 2);
			newS3 = shorten3 + shorten3 + shorten3 + shorten3 + shorten3;
		} else { 
			newS3 = s3 + s3 + s3 + s3 + s3;
		}
			
		return newS1 + newS2 + newS3;
		
	}

	/** 
	 * <p> Write a stringCompressor  method that 
	 *  compresses long String {@code str} containing many adjacent equal characters
	 * (but no digits).  
	 *  <p> For example: </p>
	 *   
	 *  <pre>
	 *  
	 *  compressString("")  return "" , empty string 
	 *  compressString("bbbcfreb$b") return  "b3c1f1r1e1b1$1b1"
	 *  compressString("bbbrrraaaaaazzzz") return  "b3r3a6z4"
	 *  
	 *  </pre>
	 *  
	 *   	
	 * @param inputStr :
	 * 			string to be compressed, {@code str} is not null
	 * @pre.  
	 * 		Precondition: s does not contain a digit in '0'.. '9'. 
	 * @return
	 * 		the compressed version of the long string, as explained above
	 *  	
	 *  
	 * 
	 *
	 */

    public static String stringCompressor(String inputStr) {
    	/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
    	
    	int lengths = inputStr.length();
    	char previous = inputStr.charAt(0);
    	int counts = 1;
    	String new_string = "";
    	
    	if (lengths > 0) {
    		for (int k = 0; k < lengths; k++){
    			char check = inputStr.charAt(k);
    			if (Character.isDigit(check)) {
    				return "Invalid string";
    			}
    		}
    	}
    	
    	if (lengths == 0) {
    		return "";
    	} 
    	else {
    		for (int i =1; i<lengths; i++) {
    			char current = inputStr.charAt(i);
    			if (current == previous) {
    				counts++;
    			}
    			else {
    			new_string += previous + "" + counts;
    			previous = current;
    			counts = 1;
    		}
    		}
    	}
    	new_string += previous + "" + counts;
        return new_string;
    }

	
	/**
	 * Write a static method that receives a short value that can be stored in 16 bits and
	 * then convert this input value to 16 bits binary representation. The method
	 * returns the string value representing the binary value in 16 bits equivalent to the
	 * input value.
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if value=15 then return "The decimal value (15) has binary representation [0000000000001111]"
	 * if value=145 then return "The decimal value (145) has binary representation [0000000010010001]"
	 * if value=255  then return "The decimal value (205) has binary representation [0000000011001101]"
	 * 
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param value input integer value of type short
	 * @return String value represent binary value in 16 bits. See example above
	 * 
	 *         <p>
	 *         <strong> Precondition </strong> :   value is non-negative values
	 *         </p>
	 * 
	 * 
	 */

	public static String binaryRepresentation(short value) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		if (value < 0) {
			return "Invalid input. Input a non-negative short value.";
		}
		
		String reverse = "";
		String binValue = "";
		String binaryRep = "";
		
		short value1 = value;
		while (value1 > 0) {
			int remainder = value1 %2;
			reverse += remainder;
			value1 /=2;
		}
		
		for (int i = (reverse.length() - 1); i> -1; i--) {
			binValue += reverse.charAt(i);
		}
		
		if (binValue.length() < 16) {
			int n = 16 - binValue.length();
			for (int i = 0;i< n; i++) {
				binaryRep += 0;
			}
			binaryRep += binValue;
		}
		
		String result = "The decimal value (" + value +") has binary representation [" + binaryRep + "]";
		return result;
	}
	
	/**
	 * Write a static method that receives two short values that can be stored in 16 bits 
	 * and then return their binary xor operation/logic. 
	 * It will help if you make sure the input values 
	 * are converted to binary representation (16 bits) 
	 * before performing the xor operation. If you want, 
	 * you can use <strong><code>binaryRepresentation</code></strong> method 
	 * that you should implement in this lab.  
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 *  
	 * if value1=12  and value2 = 15, then return "XOR of two values is [0000000000000011]"
	 * if value1=142  and value2 = 145, then return "XOR of two values is [0000000000011111]"
	 * if value1=82  and value2 = 255, then return "XOR of two values is [0000000010101101]"
	 * 
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param value1 input integer value of type short
	 * @param value2  input integer value of type short
	 * @return String value represents the xor operation of the input values in 16 bits. See the example above 
	 * 
	 *         <p>
	 *         <strong> Precondition </strong> :   value is non-negative values
	 *         </p>
	 * 
	 * 
	 */	
	public static String binaryXor(short value1 , short value2) {
		if ((value1 < 0) || value2 <0) {
			return "Invalid input(s). Input a non-negative short value.";
		}
		
		String binRep1 = binaryRepresentation(value1);
		String binRep2 = binaryRepresentation(value2);
		
		String bin1 = binRep1.substring(binRep1.indexOf('[')+1, binRep1.indexOf(']'));
		String bin2 = binRep2.substring(binRep2.indexOf('[')+1, binRep2.indexOf(']'));
		
		String binXor = "";
		for (int i =0; i<16; i++) {
			char bitStr1 = bin1.charAt(i);
			char bitStr2 = bin2.charAt(i);
			
			if (bitStr1 == bitStr2) {
				binXor += "0";
			} else {
				binXor += "1";
			}
		}
			
		String result = "XOR of two values is [" + binXor + "]";
        return result;		
	}
	
	
	/**
	 * 
	 * Write a static method that counts the number of integers between a
	 * lower-limit integer and an upper-limit integer that are multiple of 3 or
	 * multiple of 5 or multiple 7.
	 * 
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if lowerLimit=0 and  upperLimit= 5 then return "Between (1) and (5) there are (1) multiple of 3, (1) multiple of 5 and (0) multiple of 7"
	 * if lowerLimit=10 and  upperLimit= 10 then return "Between (10) and (10) there are (0) multiple of 3, (1) multiple of 5 and (0) multiple of 7"
	 * if lowerLimit=10 and  upperLimit= 22 then return "Between (10) and (22) there are (4) multiple of 3, (3) multiple of 5 and (2) multiple of 7"
	 * if lowerLimit=7 and  upperLimit= 5 then return "Error: lower limit (7) is not less than or equal to upper limit (5)"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param lowerLimit lower limit integer value
	 * @param upperLimit upper limit integer value
	 * @return String value as shown in the examples above
	 * 
	 * 
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         <p>
	 *         lowerLimit and upperLimit are non-negative values and lowerLimit less than upperLimit
	 *         </p>
	 * 
	
	 */
	public static String countofMult357(int lowerLimit, int upperLimit) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		if (lowerLimit < 0 || upperLimit < 0) {
			return "Invalid input, inputs should be non-negative values.";
		}
		
		if ((lowerLimit >= upperLimit) ) {
			return "Error: lower limit (" + lowerLimit + ") is not less than or equal to upper limit ("+ upperLimit +")";
		}
		
		int mult3 = 0;
		int mult5 = 0;
		int mult7 = 0;
		
		for (int i = lowerLimit; i<= upperLimit; i ++) {
			if (i%3 == 0) {
				mult3 += 1;
			} 
			if (i%5 == 0) {
				mult5 += 1;
			}
			if (i%7 == 0) {
				mult7 +=1;
			}
		}
		String result = "Between (" + lowerLimit + ") and (" + upperLimit + ") there are (" + mult3 + ") multiple of 3, (" + mult5 + ") multiple of 5 and (" + mult7 +") multiple of 7";
		
		return result;
	}
	
	/**
	 * Write a static method named isPalindromeInt to determine
	 * if the given input <code>n</code> integer
	 * is a palindrome integer.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Palindrome"
	 * if n= 10  then  return "Integer 10 is NOT Palindrome"
	 * if n= 3635363 then  return "Integer 3635363 is Palindrome"
	 * if n= 121121  then  return "Integer 121121 is Palindrome"
	 * if n= 112545214 then return "Integer 112545214 is NOT Palindrome"
	 * </pre>
	 * 
	 * 
	 * @param n : int input value
	 * @return <code>n</code> is palindrome integer then return true. Otherwise,
	 *         return false
	 *  <p><strong> Precondition </strong></p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 */
	public static String isPalindromeInt(int n) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// (as per instructions) assuming that inputs cannot be negative
		
		String reverse = "";
		String strN = "" + n;
		int length  = strN.length(); 
		for (int i = (length - 1); i> -1; i--) {
			reverse += strN.charAt(i);
		}
				
		
		if (strN.equals(reverse)) {
			return "Integer (" + n + ") is Palindrome";
		} else {
			return "Integer (" + n + ") is NOT Palindrome";
		}
	}
}
