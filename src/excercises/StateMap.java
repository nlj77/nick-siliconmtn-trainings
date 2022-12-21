/**
 * 
 */
package excercises;
import java.util.HashMap; // import the HashMap class
/****************************************************************************
 * <b>Title:</b> StateMap.java
 * <b>Project:</b> nicksiliconmtntrainings
 * <b>Description:</b> Part 1 of the Collections Homework from PPT Intro to Programming 4 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 21 2022
 * @updates:
 ****************************************************************************/
public class StateMap {
	/**
	 * @param args main runner for my StateMap class
	 */
	public static void main(String[] args) {
		// Creates a HasMap object called States and assigns it to a 50 length Hashmap
		// of key value pairs
		final HashMap<String, String> States = new HashMap<String, String>(50);
		/**
		 * Calls addStates method on the States Hashmap
		 */
		addStates(States);
		
	}
	
	public static void addStates(HashMap<String, String> x) {
		x.put("01", "Alabama");
		x.put("02", "Alaska");
		x.put("04", "Arizona");
		x.put("06", "California");
		x.put("08", "Colorado");
		x.put("09", "Conneticut");
		x.put("10", "Delaware");
		x.put("15", "Hawaii");
		x.put("48", "Texas");
		x.put("39", "Ohio");
	}
}
