package labs.Lab4;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {
		
		int[] x = {4,5,6}; // = > [0,0,0,0,0,6]
		
		System.out.println(Arrays.toString(doubleLength(x)));
	}

	public static int[] doubleLength(int[] arr) {
		int[] result = new int[arr.length*2];
		
		result[result.length-1] = arr[arr.length-1];
		
		return result;
	}
	
}
