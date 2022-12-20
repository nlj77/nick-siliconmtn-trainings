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
	public static void zeroToTen() {
		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			++x;
		}
	}
	
	public static void tenToZero() {
		for (int i = 10; i >= 0; --i) {
			System.out.println(i);
		}
	}
	
	public static void oneToTwentyEven() {
		for (int i = 1; i <= 20; ++i) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
		}
	}
	
	public static void main(String[] args) {
		zeroToTen();
		System.out.println("------------------");
		tenToZero();
		System.out.println("------------------");
		oneToTwentyEven();
	}
}
