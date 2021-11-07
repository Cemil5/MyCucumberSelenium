package replit;

public class Vowels {

	public static void main(String[] args) {

		String word = "huepopemtul";
		String vowels = "aeiou";
		
		for (int i =0; i<word.length();i++) {
			for (int j =0; j<vowels.length();j++) {
				if (word.charAt(i) == vowels.charAt(j)) {
				System.out.print(word.charAt(i));
				}
			}
		}
		
	}

}
