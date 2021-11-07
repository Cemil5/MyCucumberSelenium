package Assignment_5_ForLoop;

public class Q12_PatternWithNestedForLoops {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			for (int j=1;j<=10; j++) {
				System.out.print(i*j + " ");
			// for (int j=i; j <= i*10; j +=i) {
			//	System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
