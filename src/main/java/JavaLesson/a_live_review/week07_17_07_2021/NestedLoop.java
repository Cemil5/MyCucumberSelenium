package a_live_review.week07_17_07_2021;

public class NestedLoop {

	public static void main(String[] args) {
		
		int row = 9, column = 15;
		for (int i = 1; i<=row; i++) {
			for (int j = 1; j<=column; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		
	}

}
