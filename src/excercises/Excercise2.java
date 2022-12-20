package excercises;

/****************************************************************************
 * <b>Title:</b> Exercise2.java
 * <b>Project:</b> nicksiliconmtntrainings
 * <b>Description:</b> Exercise 2, 
 * This task, asks me to write methods to print the numbers 1 through 10, 10 descending to 1, and
 * every even number from 2 to 20.
 * This is the second exercise on the Intro to Programming slideshow
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 20th, 2022
 * @updates:
 ****************************************************************************/

public class Excercise2 {
	
	/**
	 * @params x this creates an instance of int and assigns it to 1, then while x is less than
	 * or equal to 10, print out x to the console, then increment x by 1, then print it again.
	 */
	
	public static void zeroToTen() {
		
		int x = 1;
		
		while (x <= 10) {
			
			System.out.println(x);
			
			++x;
		}
	}
	
	/**
	 * @params i, this creates a for loop using i as a counter. Set i equal to 10, then while i is greater
	 * or equal to 0, print i and decrement it by 1 each time. 
	 */
	
	public static void tenToZero() {
		
		for (int i = 10; i >= 0; --i) {
			
			System.out.println(i);
			
		}
	}
	
	/**
	 * @params i, this declares another local variable i as an int, sets it equal to 1, and has the console print i
	 * so long as i divided by 2, has a remainder of zero, using the modus operator. Then increment i by 1,
	 * and check the criteria again. If i is divisible without a remainder of zero, do not print i.
	 */
	
	public static void oneToTwentyEven() {
		
		for (int i = 1; i <= 20; ++i) {
			
				if(i % 2 == 0) {
					
					System.out.println(i);
					
				}
		}
	}
	
	/** Calls the methods to print to console, and separates them with '--------'
	 * 
	 * */
	
	public static void main(String[] args) {
		
		zeroToTen();
		
		System.out.println("------------------");
		
		tenToZero();
		
		System.out.println("------------------");
		
		oneToTwentyEven();
		
	}
}
