/**
 * 
 */
package excercises;
/*
 * Need to import the file class and the IO exception class to handle errors
 */
import java.io.File;  // Import the File class
import java.io.IOException; //Import the exception handler
/****************************************************************************
 * <b>Title:</b> CreateFile.java
 * <b>Project:</b> nicksiliconmtntrainings
 * <b>Description:</b> CreateFile,
 * This class aims to demonstrate a competence in using I/O Streams to interface with a file, and read from one.
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 21 2022
 * @updates:
 ****************************************************************************/
public class CreateFile {
	
	public static void main(String[] args) {
		
		/*
		 * Tries to instantiate a new object of the file class, myObj, and name it 'filename.txt'
		 */
		
	      try {
	    	
	    	  File myObj = new File("filename.txt");
	     /*
	      * if the object was successfully created, print to the console that it was successful
	      */
	      
	      if (myObj.createNewFile()) {
	    	  
	          System.out.println("File created: " + myObj.getName());
	        
	      } 
	      
	      /*
	       * if the file was not successful, print that it already exists
	       */
	      
	      else {
	          System.out.println("File already exists.");
	      }
	      
	      } 
	      catch (IOException e) {
	    	
	    	  System.out.println("An error occurred.");
	      
	      e.printStackTrace();
	      
	    }
	  }
	}
