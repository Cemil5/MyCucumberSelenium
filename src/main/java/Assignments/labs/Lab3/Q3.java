package labs.Lab3;

public class Q3 {

	public static void main(String[] args) {

		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));


	}

	public static String extraEnd(String str) {
		String result="";
		int length = str.length();
		if (length>=2) {
			for (int i=1; i<=3;i++) {
				result += str.substring(length-2);
			}
		} else {
			result = "You should enter at least 2 character";
		}
		return result;
	}
}
