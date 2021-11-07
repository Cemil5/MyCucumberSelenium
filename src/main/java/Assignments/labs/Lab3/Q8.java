package labs.Lab3;

public class Q8 {

	public static void main(String[] args) {

		System.out.println(left2("Hello"));
		System.out.println(left2("java"));
		System.out.println(left2("Hi"));

	}

	public static String left2(String word) {

		return word.substring(2) + word.substring(0, 2);
	}
}
