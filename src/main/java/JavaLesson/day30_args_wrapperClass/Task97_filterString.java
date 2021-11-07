package day30_args_wrapperClass;

public class Task97_filterString {

	public static void main(String[] args) {

		String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <>>>>$j@av'''+a777.|||}";
		
		System.out.println(filterString(s));
		System.out.println(filterString1(s));

	}	
	public static String filterString1(String s) {
		String ns ="";
		
		do {
			char ch = s.charAt(0);
			if (Character.isAlphabetic(ch) || Character.isSpaceChar(ch)) {
				ns += ch;
			}
			s = s.substring(1);
		} while (!s.isEmpty());
		System.out.println(ns);
		return ns;
	}	
	
	public static String filterString(String s) {
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
				str += s.charAt(i);
			}		
		}
		return str;
	}
	
}
