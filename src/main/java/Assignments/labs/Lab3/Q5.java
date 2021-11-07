package labs.Lab3;

public class Q5 {

	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		System.out.println(firstHalf("abcde"));

	}

	public static String firstHalf(String word) {
		
		return word.substring(0, word.length()/2);
	}
}
