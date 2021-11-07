package Self_Practice._interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
**_Palindrome_** is a word, phrase, or sequence that reads the same backward as forward.
>    Example: madam 
So method **isPalindrome** checks the given String and returns true if `check` is palindrome and false if it is not.
- make your conditions case insensitive.  ex: _Civic_ and _civic_ are both palindromes
- make your conditions space insensitive.  _Race car is_ a palindrome even though there is space in between.
Examples:
isPalindrome("Noon") ==> true
isPalindrome("I am not palindrome") ==> false
isPalindrome("wooden") ==> false
isPalindrome("Nurses Run") ==> true
 */
public class __isPalindrome_String {

	public static void main(String[] args) {

		System.err.println("reveresing :");
		System.out.println(isPalindrome("Noon")); //true
		System.out.println(isPalindrome("I am not palindrome")); // false
		System.out.println(isPalindrome("Nurses Run")); // true);
	
		System.out.println("\nlength /2 :");
		System.out.println(isPalindrome1("level") 		== true  ? "passed" : "failed");
		System.out.println(isPalindrome1("racecar") 	== true  ? "passed" : "failed");
		System.out.println(isPalindrome1("racecare") 	== false ? "passed" : "failed");
		System.out.println(isPalindrome1("wow") 		== true  ? "passed" : "failed");
		System.out.println(isPalindrome1("top spot") 	== true  ? "passed" : "failed");

		System.out.println("\nrecursion method :");
		System.out.println(isPalindrome2("level") 		== true  ? "passed" : "failed");
		System.out.println(isPalindrome2("racecar") 	== true  ? "passed" : "failed");
		System.out.println(isPalindrome2("racecare") 	== false ? "passed" : "failed");
		System.out.println(isPalindrome2("wow") 		== true  ? "passed" : "failed");
		System.out.println(isPalindrome2("top spot") 	== true  ? "passed" : "failed");
	}
	
	public static boolean isPalindrome(String str) {	// reversing 
		String reversed ="";
		str = str.replace(" ", "");
		for (int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		return (str.equalsIgnoreCase(reversed));
	}
	
	public static boolean isPalindrome1(String str) {	// length / 2
		str = str.replace(" ", "");
		str = str.toLowerCase();
		for (int i=0; i<(str.length()/2); i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome2(String str) {	// recursion method 
		str = str.replace(" ", "");
		str = str.toLowerCase();
		if (str.length()>1) {
			if (str.charAt(0) != str.charAt(str.length()-1)) {
				return false;
			}
			str = str.substring(1, str.length()-2);
			isPalindrome2(str);
		}
		return true;
	}
	
}
