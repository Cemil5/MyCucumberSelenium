package replit;
/*
Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order
 */
public class PrintLettersCombinations {

	public static void main(String[] args) {

		String word = "zyxwv";
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.println(word.substring(i,i+1)+word.substring(j,j+1));
			}
		}
		
	}

}
