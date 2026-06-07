package work;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : March 27, 2025

//////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DiskFileProcessor {
	
	public static String[] readFiles (String[] names){
		
		String [] lines = new String [names.length];
		FileReader f;
		for (int i=0; i<names.length;i++) {
			try {
	           // Reading file from path in local directory
		   		 f = new FileReader("src/work/"+ names[i]);
		
		        // Creating object as one of ways of taking input
		        BufferedReader b = new BufferedReader(f);
		        
		        lines[i]=b.readLine();
		        b.close();
			} catch (FileNotFoundException e) {
			 lines[i] = "FILE DOESN'T EXIST";
			} catch (IOException e) {
				lines[i] = "IO Error";
			}
	  }
		return lines;
	}
}
