package excercises;

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
