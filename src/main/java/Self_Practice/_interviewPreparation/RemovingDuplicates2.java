package _interviewPreparation;
/*
**uniqueChars** is a method that will accept any String and return the String with out any dupclicate characters 
Examples:
uniqueChars("java") ==> "jav"
 */

public class RemovingDuplicates2 {

	public static void main(String[] args) {

		System.out.println(uniqueChars("abcdaabbccdde"));
		
	}
	
	public static String uniqueChars2 (String str) {
		
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
	
	public static String uniqueChars (String str) {
		String result = str.charAt(0)+"";
		for (int i=1; i<str.length();i++) {
			boolean temp = true;
			for (int j=0;j<i;j++) {
				if (str.charAt(i)==str.charAt(j)) {
					temp = false;
					break;
				}
			}
				if (temp) {
					result += str.charAt(i);
				}
		}
		return result;
	}
	
}
