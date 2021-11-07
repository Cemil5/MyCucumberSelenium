package replit;

import java.util.Scanner;

public class middleOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    
	    int length = word.length();
	    String result = "";
	    
	    if (length % 2 ==0) {
	    	if (length >2) {
	    		result = word.substring(length/2-1, length/2) + word.substring(length/2,length/2+1);
	    	} else {
	    		result = word + word;
	    	}
	    } else {
	    	if (length >=3) {
	    		result = word.substring(length/2,length/2+1);
	    	} else {
	    		result = word + word + word;
	    	}
	    }
		System.out.println(result);
	}

	
	
}
