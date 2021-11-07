package Assignment_5_ForLoop;

public class Q13_ChessboordWithNestedForLoops {

	public static void main(String[] args) {
		for (int i=1; i<=8; i++) {
			for (int j=1; j<=4; j++) {
				if (i % 2 == 1) {
					System.out.print("W B ");
				} else {
					System.out.print("B W ");
				}
			}
			System.out.println("");
		}
	}

}
