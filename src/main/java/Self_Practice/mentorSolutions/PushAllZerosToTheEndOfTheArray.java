package mentorSolutions;

import java.util.Arrays;

/*
 * Push all the zero’s in the array to the end 
 * and all the one’s to the beginning of the Array

array:

{1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0} → {1, 1, 1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}
 */


public class PushAllZerosToTheEndOfTheArray {
	
public static void main(String[] args) {
		
		int[] firstArray = {1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0};
		
		int[] secondArray = new int[firstArray.length];
		
		int start = 0;
		int end = secondArray.length - 1;
		
		for (int i = 0; i < secondArray.length; i++) {
			
			if (firstArray[i] == 1) {			
				secondArray[start] = firstArray[i];
				start++;
			
			} else if (firstArray[i] == 0) {				
				secondArray[end] = firstArray[i];
				end--;
			}
		}
		
		for (int i = 0; i < firstArray.length; i++) {
			
			if (firstArray[i] != 1 && firstArray[i] != 0) {
				secondArray[start] = firstArray[i];
				start++;
			}
		
		}
		
		System.out.println(Arrays.toString(firstArray) + "\n");
		System.out.println(Arrays.toString(secondArray));
		
	}
	
}
