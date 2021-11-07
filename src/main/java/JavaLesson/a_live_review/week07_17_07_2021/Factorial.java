package a_live_review.week07_17_07_2021;

public class Factorial {

	public static void main(String[] args) {

		int number = 5;
		long factorial=1;
		while (number>1) {
			factorial *= number--;
		}
		System.out.println(factorial);
		for (;number>1;) {
			factorial *= number--;
		}
		System.out.println(factorial);
		
		do {
			factorial *= number--;
		} while (number>1);
		System.out.println(factorial);
	}

}
