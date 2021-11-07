package replit;

import java.util.Scanner;

public class SentenceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    String sentence = scan.nextLine();
		    //WRITE YOUR CODE HERE

		System.out.println(sentence.contains(word));
	}

}
