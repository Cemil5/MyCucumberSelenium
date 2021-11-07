package replit.array;

import java.util.Arrays;

public class FindingMaxLength {

	public static void main(String[] args) {
		
	String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"}; // Outputs: jaaaaavvaaaaaaaaaa
	
	String[] words1 = {"java", "cable", "red", "vivid", "remedy", "grace"}; // Output: red
	maxLength(words);
	firstLastTwo(words);	
	shortestWord(words1);
	}

	private static void shortestWord(String[] str) {
		int countMin = str[0].length();
		int index=0;
		
		for (int i=1; i<str.length;i++) {
			if (str[i].length()<countMin) {
				countMin = str[i].length();
				index =i;
			}
		}
		System.out.println(str[index]);
	}

	public static void firstLastTwo(String[] words) {
		String[] result = new String[words.length];
		
		for (int i=0; i<words.length; i++) {
			result[i] = ""+words[i].charAt(0) + words[i].charAt(words[i].length()-1);
		}
		System.out.println(Arrays.toString(result));
	}
	
	private static void maxLength(String[] words) {
		
		int countMax = 0; 
		int indexM = 0;
		
		for (int i=0; i<words.length; i++) {
			if (words[i].length() > countMax) {
				countMax = words[i].length();
				indexM = i;
			}
		}
		System.out.println(words[indexM]);
		
		
	}
	
	
	
}
