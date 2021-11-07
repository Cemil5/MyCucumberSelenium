package Assignment_5_ForLoop;

public class Q11_PatternWithNestedForLoops {

	public static void main(String[] args) {
		
		discord();
		myFirst();
	}
	
	public static void discord() {
		for (int i=1; i<=4; i++) {
			for (int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for (int k=5-i; k>=1;k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
	
	public static void myFirst() {
		for (int i=4; i>=1; i--) {
			for (int k=1; k<(4-i);k++) {
				System.out.print(" ");
			}
			for (int j=i; j>=1; j--) {
				if (i==4) {
					System.out.print(j + " ");
				} else {
					System.out.print(" " + j);					
				}
			}
			System.out.println("");
		}
	}

}
