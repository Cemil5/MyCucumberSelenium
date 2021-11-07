package replit;

import java.util.Scanner;

public class ReverseIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    String result = "";
		    if (word.length() == 5) {
		    	for (int i=4; i>=0; i--) {
		    		result += word.substring(i, i+1);
		    	}
		    } else if (word.length() < 5) {
		    	result = "Too short!";
		    } else {
		    	result = "Too long!";
		    }
		    
		    System.out.println(result);
	}

}
