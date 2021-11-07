package a_live_review.week05_03_07_2021;

/*
 *  Given a letter (char) we want to find out if it's uppercase, lowercase, or not a letter
 */
public class CharacterChecker {
	public static void main(String[] args) {
		
		char letter = 'R';
		
		if (letter >= 65 && letter <= 90) {
			System.out.println(letter + " is uppercase");
		} else if (letter >= 'a' && letter <= 'z') {
			System.out.println(letter + " is lowercase");
		} else {
			System.out.println(letter + " is not a letter");
		}
		
	}

}
