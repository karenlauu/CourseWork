package lab3;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : February 27, 2025
//Authenticity Declaration :

//////////////////////////////

public class TwoDArrayProblems {
	
	/*Create a public static String method named findExtrema that takes as an argument
	 * a two-dimensional int array and performs the following tasks:
		--find and print the maximum and minimum values in each row;
		--find and print the maximum and minimum values in each column.
	 
		If, for example, the array { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} } is passed to findExtrema,
		the return value should be:
			The maximum values along the rows are [3,6,9].
			The minimum values along the rows are [1,4,7].
			The maximum values along the columns are [7,8,9].
			The minimum values along the columns are [1,2,3].

		If the array is null, the return value should be: [null array].
	*/
	
	public static String findExtrema(int[][] array) {
		if (array == null) {
			return "[null array].";
		}
		
		int numRows = array.length;
		int numCols = array[0].length;
		
		// initialize  array lengths to dimensions of given array
		int[] maxRow = new int[numCols]; 
		int[] minRow = new int[numCols];
		int[] maxCol = new int[numRows];
		int[] minCol = new int[numRows];

		
		// Determine min and max along rows
		for (int row = 0; row < numRows; row++) {
			int rowValueMax = array[row][0];
			int rowValueMin = array[row][0];
			for (int column = 1; column < numCols; column++) {
				rowValueMax = Math.max(rowValueMax, array[row][column]);
				rowValueMin = Math.min(rowValueMin, array[row][column]);
			}maxRow[row]= rowValueMax;
			minRow[row] = rowValueMin;
		}	
		
		// Determine min and max along columns
		for (int col = 0; col < numRows; col++) {
			int colValueMax = array[0][col];
			int colValueMin = array[0][col];
			for (int row = 1; row < numRows; row++) {
				colValueMax = Math.max(colValueMax, array[row][col]);
				colValueMin = Math.min(colValueMin, array[row][col]);
			}maxCol[col]= colValueMax;
			minCol[col] = colValueMin;
		}	
		
		String maxRoww = "[";
		String minRoww = "[";
		String maxColl = "[";
		String minColl = "[";
		
		
		
		for (int i = 0; i < (maxRow.length) -1 ; i++) {
			maxRoww += maxRow[i] + ",";
	    } maxRoww += maxRow[maxRow.length-1] + "]";
	    
	    for (int i = 0; i < (minRow.length) -1 ; i++) {
			minRoww += minRow[i] + ",";
	    } minRoww += minRow[minRow.length-1] + "]";
	    
	    for (int i = 0; i < (maxCol.length) -1 ; i++) {
			maxColl += maxCol[i] + ",";
	    } maxColl += maxCol[maxCol.length-1] + "]";
	    
	    for (int i = 0; i < (minCol.length) -1 ; i++) {
			minColl += minCol[i] + ",";
	    } minColl += minCol[minCol.length-1] + "]";
		
		String result = "The maximum values along the rows are " + maxRoww + ".\n"+ 
				"The minimum values along the rows are " + minRoww + ".\n" +
				"The maximum values along the columns are " + maxColl + ".\n"+ 
				"The minimum values along the columns are " + minColl + ".";
		
        return result;
	}

	/*Create a public static String method named rotateArray that takes as an argument
	 * a square (NxN) two-dimensional int array and performs a 90-degree clockwise rotation on it.
	 * The method should return the rotated array in the form of a String as given in the example below.
	 * 
	 * A 90-degree clockwise rotation of an array involves moving the elements such that the element
	 * at array[i][j] moves to array[j][N-1-i] where N is the length of each side of the square array.
	 * 
	 * Suppose the following array is provided as argument: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
	 * then rotateArray should return the String: {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}.
	 * 
	 * If the array is null, the return value should be: [null array].
	 * If the array is not square, the return value should be: [not a square array].
	*/
	
	public static String rotateArray(int[][] originalArray) {
		if (originalArray == null) {
			return "[null array].";
		}
		
		int rowlength = originalArray[0].length;
		for (int row = 1; row < originalArray.length; row++) {
            int rowLengths = originalArray[row].length;
            if (rowlength != rowLengths) {
            	return "[not a square array].";
            }
		}
		
		
		int length = originalArray.length;
		int[][] newArray = new int [length][length];
		
		for (int row = 0; row < length; row ++) {
			for (int col = 0; col < length; col ++) {
				newArray[col][length -1 - row] = originalArray[row][col];
			}
		}
		
		String result = "{";
        for (int i = 0; i < newArray.length; i++) {
            result += "{"; 
            for (int j = 0; j < newArray[i].length; j++) {
                result += newArray[i][j];
                if (j < newArray[i].length - 1) {
                    result += ", "; 
                }
            }
            result += "}"; 
            if (i < newArray.length - 1) {
                result += ", "; 
            }
        }
        result += "}."; 
		
		return result;
	}


	/* An n x n  matrix is called a positive Markov matrix if each element is positive
	 * and the sum of the elements in each column is 1.
	 * Write a public static boolean method named isMarkovMatrix that performs this test
	 * on a double 2D array.
	 * 
	 * This array represents a Markov matrix: {{0.15,0.875,0.375}, {0.55,0.005,0.225}, {0.30,0.12,0.4}}
	 * 
	 * Assume that array will always be square. 
	*/
	public static boolean isMarkovMatrix(double [][] m) {
		//Assuming that matric will always be square and not null
		
		int lengths = m.length;
		for (int col = 0; col < lengths; col++) {
			double sum = 0.0;
			
			for(int row = 0; row<lengths; row++) {
				if (m[row][col] < 0) {
					return false;
				}
				sum += m[row][col];
			} 
			
			if (sum != 1) {
				return false;
			}
		}
		
	     return true;
	}

	/* Consider a public static method findDistances that takes as argument an n x 2 double array.
	 * The geographical coordinates of n different places are stored in this n x 2 argument array.
	 * The method computes the distance of each place to each place and produces an n x n array
	 * where the distance of point i (row i of argument array) to point j (row j of argument array)
	 * is stored at element [i][j] of the resultant array. The distance is computed using Euclidean
	 * 2 dimensional distance formula.
	 * 
	 * For the argument array: {{1.0, 2.0}, {3.0, 2.0}}
	 * The return value would be: {{0.0, 2.0}, {2.0, 0.0}}
	 * 
	 * Assume there will always be at least one set of coordinates given. 
	*/
	public static double [][] findDistances(double [][] m) {
		int coordLength = m.length;
		double[][] result = new double[coordLength][coordLength];
		
		for (int i=0; i<coordLength; i++) {
			for (int j=0; j< coordLength; j++) {
				double changeLong = m[i][0] - m[j][0];
				double changeLat = m[i][1] - m[j][1];
				result[i][j] = Math.sqrt(changeLong*changeLong + changeLat*changeLat);
			}
		}
		
		return result;
	}

}
