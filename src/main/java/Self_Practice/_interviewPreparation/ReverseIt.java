package _interviewPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseIt {

	public static void main(String[] args) {

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
		    
		    
		    
		    int[] arr = { 1, 2, 3, 8, 11, 13 };
			System.out.println(Arrays.toString(reverse(arr)));		// group study
			System.out.println(Arrays.toString(reverse2(arr)));		// group study
	}

	// FIRST WAY
    // reverse any given integer array
    public static int[] reverse(int[] array) {
       
    	int[] result = new int[array.length];
        
    	for (int i = 0; i < result.length; i++) {
            result[i] = array[array.length-1 - i]; // first logic
        }
    	
        return result;
    }

    // SECOND WAY
    public static int[] reverse2(int[] array) {
    	
    	 String str = new String();
        
    	int[] result = new int[array.length];
        
    	for (int i=0, j=array.length-1; i < result.length; i++,j--) { // second logic
            
    		result[i] = array[j];
        }
    	
        return result;
    }
	
}
