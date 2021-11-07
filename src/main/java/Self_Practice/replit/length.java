package replit;

import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Please enter the text:");
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE:
	    System.out.print(word.charAt(0));
	    System.out.println(word.charAt(word.length()-1));


	}

}
