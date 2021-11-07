package labs.Lab3;

public class Q6 {

	public static void main(String[] args) {
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));

	}

	public static String withoutEnd (String word) {
		if (word.length()>=2) {
			return word.substring(1, word.length()-1);
		} else {
			return "invalid length";
		}
	}
}
