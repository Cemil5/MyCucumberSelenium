package Assignment_5_ForLoop;

public class Q14_PatternWithNestedLoop {

	public static void main(String[] args) {

		for (int i=1; i<=7; i++) {
			System.out.print("#");
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}
	}

}
