package Assignment_6_NestedForLoopExtraSpicy;

public class Q6 {

	public static void main(String[] args) {
		
		myPattern();
	}
	
	public static void myPattern() {
	int value=0, num=5;
	for (int i=1; i<=num; i++) {	
		for (int j=num; j>num-i; j--) {
			if (j==num) {
				value= i;
			} else {
				value = value + j;
			}
			System.out.print(value + " ");
		}
		System.out.println("");
	}
	
}
		public static void patternFromDiscord() {
			int diff, value, n=5;
			for (int i=1; i<=n; i++) {
				diff = n-1;
				value = i;
				for (int j=1; j<=i; j++) {
					System.out.print(value + " ");
					value+=diff;
					diff--;
				}
				System.out.println("");
			}
		}
		


}
