package replit;
/*
**uniqueChars** is a method that will accept any String and return the String with out any dupclicate characters 
Examples:
uniqueChars("java") ==> "jav"
 */

public class RemovingDuplicates {

	public static void main(String[] args) {

		System.out.println(uniqueChars("abcdaabbccdde"));
		
	}
	
	public static String uniqueChars (String str) {
		
		String result ="";
		String temp ="";
		do {
			temp = str.charAt(0)+"";
			str = str.substring(1);
			str = str.replace(temp, "");
			result += temp;		
		} while (!str.isEmpty());
		
		return result;
		}

}
