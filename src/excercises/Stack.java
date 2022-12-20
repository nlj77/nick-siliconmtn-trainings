/**
 * 
 */
package excercises;
/*
 * Vector requires java.util.* package
 */
import java.util.*;
/****************************************************************************
 * <b>Title:</b> Stack.java
 * <b>Project:</b> nicksiliconmtntrainings
 * <b>Description:</b> Intro to Programming slideshow 2,
 * This exercise is my own tinkering, but focuses on the use of constructors and method overloading to get me better practice.
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 20 2022
 * @updates:
 ****************************************************************************/

public class Stack {
	/*
	 * Declare a private variable of the class Vector, called items
	 */
	
	private Vector items;
	
	/*
	 * creates a constructor for the Stack class. Assigns a variable, items, to 10 instances
	 * of the Vector class
	 */
	
	public Stack() {
		
		items = new Vector(10);
	}
	/*
	 * Creates a method to add a object to the instances of item, called push
	 * addElement is a method of the Vector class. Object is used because it returns an instance of an object.
	 */
	public Object push(Object item) {
		
		items.addElement(item);
		
		return item;
		
	}
	
	/*
	 * the following two methods demonstrate method overloading. Both methods have the same name, but because I specify a different return type, I can reuse the method name.
	 */
	
	static int plusMethod(int x, int y) {
		
		return x + y;
		
	}
	
	static double plusMethod(double x, double y) {
		
		return x + y;
		
	}
	

}
