package labs.Lab3;

public class Q7 {

	public static void main(String[] args) {

		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));

	}
	
	public static String comboString(String s1, String s2) {
		String result ="";
		
		if (s1.length()>s2.length()) {
			result = s2 + s1 + s2;
		} else if (s1.length() < s2.length()){
			result = s1 + s2 + s1;
		} else {
			result = "invalid string";
		}
		
		return result;
	}

}
