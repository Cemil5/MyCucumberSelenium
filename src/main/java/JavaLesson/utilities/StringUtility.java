package utilities;

import java.util.Arrays;

public class StringUtility {

	
	// reverses any given string
	public static String reverse(String word) {
		String result ="";
		
		for (int i = word.length()-1 ; i>=0; i--) {
			char ch = word.charAt(i);
			result += ch;
		}
		return result;
	}
	
	// checks if the string is palindrome, returns true/false	
	public static boolean isPalindrome(String word) {
				
		return reverse(word).equalsIgnoreCase(word);
	}
	
	// removes the duplicates from the given string
	public static String removeDup(String str) {
		String result = "";
		
		for (String each : str.split("")) {
			if (!result.contains(each)) {
				result += each;
			}
		}
		return result;
	}

	// finds if a word is anagram (silent & listen)
	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	// finds the frequency of the char in a string
	public static int frequency(String str, char ch) {
		int count =0;
		
		for (char each : str.toCharArray()) {
			if (each == ch) {
				count++;
			}
		}
		return count;
	}
	
	// counts the frequency of letters
	public static String frequencyOfChars(String str) {
		String result = "";
		for (char each : removeDup(str).toCharArray()) {
			result = result + each + frequency(str, each);
		}
		return result;
	}
	
	// find the unique chars from string
	public static String unique(String str) {
		String result ="";
		
		for (char each : str.toCharArray()) {
			if (StringUtility.frequency(str, each) == 1) {	// refers to frequency method above
				result += each;
			}
		}
		return result;
	}
}
