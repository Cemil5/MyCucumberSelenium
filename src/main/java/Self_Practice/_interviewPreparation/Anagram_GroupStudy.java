package _interviewPreparation;

public class Anagram_GroupStudy {
	/*
 **_Anagram_** is a word, phrase, or name formed by rearranging the letters of another, such as _cinema_, formed from _iceman_.
 The **isAnagram** method checks if word1 and word2 are anagram to each other then return a boolean.
- each letter in `word1` should appear in `word2` exact number of times
- ignore empty spaces
- make your code case insensitive
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false
	 */

	public static void main(String[] args) {

		System.out.println(isAnagram("listen", "Silent"));
		System.out.println(isAnagram("earth", "heart"));
		System.out.println(isAnagram("star", "rats"));
		System.out.println(isAnagram("hi", "bye"));
		System.out.println(isAnagram("java", "cava"));
		System.out.println(isAnagram("jaava", "java"));
		
	}

	public static boolean isAnagram(String one, String two) {
        
	    // need to check the lengths of the both Strings are same or not
	        if(one.length() != two.length()) {
	            return false;
	        }

	        //remove the letters of one string from two String one by one in a loop
	        for(int i=0; i < one.length(); i++) {
	            two = two.replaceFirst("" + one.charAt(i), "");
	        }

	        //check the two String variable is Empty or not
	        return two.isEmpty();
	    }
	
}
