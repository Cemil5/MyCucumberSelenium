package Assignment_6_NestedForLoopExtraSpicy;

public class Q5 {

	public static void main(String[] args) {

		for (int i =1; i<=7; i++) {
			for (int j=1; j<=7-i; j++) {
				System.out.print(1);
			}
			for (int j=7-i; j<7; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
