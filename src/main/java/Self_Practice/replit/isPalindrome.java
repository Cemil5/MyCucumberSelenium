package replit;
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
public class isPalindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("Noon")); //true
		System.out.println(isPalindrome("I am not palindrome")); // false
		System.out.println(isPalindrome("Nurses Run")); // true);
	}
	
	public static boolean isPalindrome(String check) {
		String reversed ="";
		check = check.toLowerCase();
		check = check.replace(" ", "");
		for (int i=check.length()-1; i>=0;i--) {
			reversed += check.charAt(i);
		}
		return (check.equals(reversed));
	}

}
