package a_live_review.week07_17_07_2021;

public class DoWhileExample {

	public static void main(String[] args) {

		double numberOne = 10;
		double numberTwo = 300;
		double total = 2000;
		
		do {
			total +=numberOne + numberTwo;
		} while (total < 1000);
		System.out.println(total);
		
		
	}

}
