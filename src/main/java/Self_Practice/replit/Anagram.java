package replit;
/*
 **_Anagram_** is a word, phrase, or name formed by rearranging the letters of another, such as _cinema_, formed from _iceman_.
 The **isAnagram** method checks if word1 and word2 are anagram to each other then return a boolean.

- each letter in `word1` should appear in `word2` exact number of times
- ignore empty spaces
- make your code case insensitive
 */
public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("listen", "Silent")); //  true
		System.out.println(isAnagram("earth", "heart")); // true);
		System.out.println(isAnagram("java", "cava")); // false);
		
	}
	
	public static boolean isAnagram(String word1, String word2) {
		
		word1 = word1.toLowerCase();
		word1 = word1.replace(" ", "");
		word2 = word2.toLowerCase();
		word2 = word2.replace(" ", "");
		
		do {
			String str = word1.charAt(0) + "";
			word1 = word1.substring(1);
			if (word2.contains(str)) {
				word2 = word2.replaceFirst(str, "");
			} else {
				break;
			}
		} while (!word1.isEmpty() && !word2.isEmpty());
		
		return word1.equals(word2);
	}

}
