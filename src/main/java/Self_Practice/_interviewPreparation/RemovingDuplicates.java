package Self_Practice._interviewPreparation;
/*
**uniqueChars** is a method that will accept any String and return the String without any duplicate characters
Examples:
uniqueChars("java") ==> "jav"
 */

public class RemovingDuplicates {

	public static void main(String[] args) {

		System.out.println(uniqueChars("abcdaabbcaaaacdde"));
		
	}

	public static void muhtar() {

		String str = "aaaabbbbbbcccccccccddddeeeeeffffffffffffaaaaaaaaaa";
		String result = "";

		for (int i=0; i< str.length();i++){ // i: 0, 1, 2,3,4,
			char ch = str.charAt(i);

			if (!result.contains(""+ch)) {	// 'a' ==> "a"
				result += ch;
			}
		}

		System.out.println(result);
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


	public static String uniqueChars2 (String str) {
		
		String result ="";
		String temp ="";
		do {
			temp = str.charAt(0)+"";
			str = str.substring(1);
			str = str.replaceAll(temp, "");
			result += temp;		
		} while (!str.isEmpty());
		
		return result;
		}

}
