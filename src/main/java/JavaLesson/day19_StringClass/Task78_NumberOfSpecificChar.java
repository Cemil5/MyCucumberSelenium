package day19_StringClass;

public class Task78_NumberOfSpecificChar {

	public static void main(String[] args) {

		String word = "abcabaaqcabca”";
		char ch = 'a';
		int count =0;
		
		for(int i=0; i<word.length();i++) {
			if (word.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Number of a in this string is: " + count);
	}

}
