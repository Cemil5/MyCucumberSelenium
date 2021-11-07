package replit;

import java.util.Scanner;

public class MergeThem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();		// abc
	    String word2 = scan.next(); 	// 123
	    //YOUR CODE HERE
	    String result ="";
	    String result2 ="";
	    String result3 ="";
	    String result4 ="";
	    String result5 ="";
	    
	    if (word1.length() ==3 && word2.length() ==3 ) {
	    	for (int i =0; i<3;i++) {
	    		result += String.valueOf(word1.charAt(i)) + word2.charAt(i);
	    		result2 += word1.charAt(i) + word2.charAt(i);
	    		result3 += word1.charAt(i);
	    		result3 += word2.charAt(i);
	    		result4 += "" + word1.charAt(i) + word2.charAt(i);
	    		result5 += word1.substring(i, i+1) + word2.substring(i, i+1);
	    	}
	    } else {
	    	result = "cannot merge";
	    }    
	    System.out.println("result : " + result);  	// a1b2c3
	    System.out.println("result2 : " + result2);	// 146148150
	    System.out.println("result3 : " + result3); // a1b2c3
	    System.out.println("result4 : " + result4); // a1b2c3
	    System.out.println("result5 : " + result5); // a1b2c3

	}
}
