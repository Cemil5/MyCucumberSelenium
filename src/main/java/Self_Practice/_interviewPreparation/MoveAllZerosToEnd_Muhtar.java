package _interviewPreparation;

import java.util.Arrays;

public class MoveAllZerosToEnd_Muhtar {

	public static void main(String[] args) {
		
		int[] numbers = {1,0,2,0,3,0,4,0}; 
		int[] result = new int[numbers.length]; // {1,2,3,4,0,0,0,0
		int i =0;
		
		for (int each : numbers) {
			if (each !=0 ) {
				result[i++] = each;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
	}

}
