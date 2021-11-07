package a_live_review.week07_17_07_2021;

public class PrintAllLetters {

	public static void main(String[] args) {

		for (char i='A'; i<='Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i='A'; i<='Z'; i++) {
			System.out.print( (char)i + " ");
		}
		System.out.println();

		for (int i=65; i<=90; i++) {
			System.out.print( (char)i + " ");
		}
		
		System.out.println();

		for (int i=65; i<=90; i++) {
			System.out.print( Integer.toString(i) + " ");
		}
		System.out.println();

		for (int i = 'z' ; i >= 'a'; i--) {
			System.out.print((char)i + " ");
		}
		System.out.println();

		int alph = 'z';
		while (alph-->='a') {
			System.out.print((char)alph + " ");

		}
	}

}
