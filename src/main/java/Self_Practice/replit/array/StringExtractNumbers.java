package replit.array;

import java.util.Arrays;

public class StringExtractNumbers {
	/*
Create a method **extractNum** that cleans any non number string from a string it gets and returns the clean string
extractNum("aa2aa3") ==> 23
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
hint: you can use: Character.isDigit() or ascii values
	 */

	public static void main(String[] args) {
		
		System.out.println(extractNum("aa2aa3").equals("23"));
		System.out.println(extractNum("aa10aa").equals("10"));

		
	}
	public static String extractNumToChar(String str) {
		String result = "";
		String [] s = new String[str.length()];
		char[] ch = str.toCharArray(); 
		
		for (int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			
			if ((c >= '0' && c <= '9')) {
				result += ""+c;
			}
		}
		
	
		
		//System.out.println(Arrays.toString(s));
		return result;
	}
	
	public static String extractNum(String str) {
		String result = "";
		String [] s = new String[str.length()];
		
		for (int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			
			if ((c >= '0' && c <= '9')) {
				result += ""+c;
			}
		}
		
	
		
		//System.out.println(Arrays.toString(s));
		return result;
	}
}
