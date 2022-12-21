/**
 * 
 */
package excercises;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException; //Import the exception handler
/****************************************************************************
 * <b>Title:</b> WriteToFile.java
 * <b>Project:</b> nicksiliconmtntrainings
 * <b>Description:</b> WriteToFile
 * This demonstrates an ability to use Java's File I/O, and write to a file that already exists
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 21 2022
 * @updates:
 ****************************************************************************/
public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Files in Java might be tricky, but this if fun!");
			myWriter.close();
			System.out.println("Successfully wrote to the file!");
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}

}
