package labs.Lab3;

public class Q4 {

	public static void main(String[] args) {

		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("a"));


	}

	public static String firstTwo(String word) {
		String result ="";
		int length = word.length();
		if (length >=2) {
			result = word.substring(0, 2);
		} else {
			result = word;
		}
		
		return result;
	}
}
