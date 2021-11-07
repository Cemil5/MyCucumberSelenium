package labs.Lab4;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fizzArray(4))); //→ [0, 1, 2, 3]
		System.out.println(Arrays.toString(fizzArray(1))); //→ [0]
		System.out.println(Arrays.toString(fizzArray(10))); //→[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
	}

	public static int[] fizzArray (int ln) {
		
		int[] arr = new int[ln]; 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		return arr;
	}
	
}
