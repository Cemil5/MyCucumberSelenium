package Assignment_6_NestedForLoopExtraSpicy;

public class Q3 {

	public static void main(String[] args) {

		for (int i = 1; i<=7; i++) {
			for (int k = 1; k <= i-1; k++) {
				System.out.print(" ");
			}
				
			for (int j = i; j<=7; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		for (int i = 1; i<7; i++) {
			for (int k = 5; k > i-1; k--) {
				System.out.print(" ");
			}
				
			for (int j = 7-i; j<=7; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
	}

}
