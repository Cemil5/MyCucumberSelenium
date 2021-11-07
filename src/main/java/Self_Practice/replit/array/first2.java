package replit.array;

import java.util.Arrays;
import java.util.Scanner;

public class first2 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    
	    String[] result = new String[words.length];
			
			for (int i=0; i<words.length; i++) {
				result[i] = ""+words[i].charAt(0) + words[i].charAt(words[i].length()-1);
			}
			System.out.println(Arrays.toString(result));
	   
		
	}

}
