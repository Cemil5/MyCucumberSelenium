package _interviewPreparation;

import java.util.Arrays;

public class Arrays_AddElements_Replit {
/*
Method **addElements** accepts 2 int arrays and adds each element value of two arrays and returns a new array. 
You can assume that each array has 5 elements
 */
	public static void main(String[] args) {
		
		int[] a1 = {10, 40, 50, 3, 1};
		int[] a2 = {11, 0, 500, 44, 1101};
		
		// return array after adding values in the arrays: [21, 40, 550, 47, 1102]
		System.out.println(Arrays.toString(addElements(a1, a2)));
	}

	public static int[] addElements(int[] ints1, int[] ints2) {
		int[] array = new int[ints1.length];
		
		for (int i=0; i<array.length;i++) {
			array[i] = ints1[i] + ints2[i];
		}
		
		return array;
	}
	
}
