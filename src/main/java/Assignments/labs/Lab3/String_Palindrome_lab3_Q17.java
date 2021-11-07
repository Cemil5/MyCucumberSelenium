package labs.Lab3;

public class String_Palindrome_lab3_Q17 {
	
	/*
Write a method that accepts a string and returns true if the string is palindrome.
	 */

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("level") == true);
		System.out.println(isPalindrome("racecar") == true);
		System.out.println(isPalindrome("racecare") == false);
		System.out.println(isPalindrome("wow") == true);
		System.out.println(isPalindrome("top spot") == true);

		
	}
	
	public static boolean isPalindrome(String str) {
		String reversed = "";
		
		str = str.replace(" ", "");
		for (int i=str.length()-1; i>=0;i--) {
			reversed += ""+str.charAt(i);
		}
		
		return str.equalsIgnoreCase(reversed);
	}

}
