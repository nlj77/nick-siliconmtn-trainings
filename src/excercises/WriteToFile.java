/**
 * 
 */
package excercises;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException; //Import the exception handler

/****************************************************************************
 * <b>Title:</b> WriteToFile.java <b>Project:</b> nicksiliconmtntrainings
 * <b>Description:</b> WriteToFile This demonstrates an ability to use Java's
 * File I/O, and write to a file that already exists <b>Copyright:</b> Copyright
 * (c) 2022 <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 21 2022
 * @updates:
 ****************************************************************************/
public class WriteToFile {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * This tries to create a new FileWriter object called myWriter which takes an
		 * argument of filename.txt
		 */
		try {
			FileWriter myWriter = new FileWriter("filename.txt");

			/*
			 * this calls the built in write method from the FileWriter class, and passes in
			 * the argument as a string of 'Files in Java might be tricky but this is fun'
			 */

			myWriter.write("Files in Java might be tricky, but this if fun!");

			/*
			 * best practice to call the close function
			 */

			myWriter.close();

			/*
			 * uses sysout to print 'successfully wrote to the file
			 */

			System.out.println("Successfully wrote to the file!");

			/*
			 * runs a catch, which is why we imported our exception handler package, to
			 * print 'an error has occurred if some other error shows
			 */

		} catch (IOException e) {

			System.out.println("An error occured.");

			e.printStackTrace();

		}
	}

}
