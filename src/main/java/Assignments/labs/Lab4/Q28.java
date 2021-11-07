package labs.Lab4;

import java.util.Arrays;

public class Q28 {

	public static void main(String[] args) {

		 // → [5, 6, 7, 8, 9]
		 // → [11, 12, 13, 14, 15, 16, 17]
		// → [1, 2]
		
		System.out.println(Arrays.toString(fizzArray3(5, 10)));
		System.out.println(Arrays.toString(fizzArray3(11, 18)));
		System.out.println(Arrays.toString(fizzArray3(1, 3)));

		
		
	}
	
	public static int[] fizzArray3(int a, int b) {
		int[] arr = new int[b-a];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = i + a;
			//System.out.println(i);
		}
		
		return arr;
	}
}
