package labs.Lab3;

public class Q9 {

	public static void main(String[] args) {

		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
	}

	public static String right2(String word) {
		
		return word.substring(word.length()-2) + word.substring(0, word.length()-2);

	}
}
