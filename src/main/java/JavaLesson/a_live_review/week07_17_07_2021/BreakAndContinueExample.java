package a_live_review.week07_17_07_2021;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		outer: for (int i=0; i < 5; i++) {
			inner: for (int j=1; j <4; j++) {
				if (j== 3) {
					continue outer;
				} 
				if (i == 3 ) {
					//break inner;
				}
				System.out.print("i : " + i + " j : " + j + "   ");
			}
			System.out.println();
		}
	}

}
