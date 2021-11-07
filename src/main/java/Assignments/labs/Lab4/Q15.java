package labs.Lab4;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4}; // = > [4,2,3,1]
		int[] y = {1,2,3}; // = > [3,2,1]
		int[] z = {8,6,7,9,5}; // = > [5,6,7,9,8]
		
		System.out.println(Arrays.toString(modify(x)));
		System.out.println(Arrays.toString(modify(y)));
		System.out.println(Arrays.toString(modify(z)));
	}

	public static int[] modify(int[] arr) {
		
		int num0 = arr[0];
		
		arr[0]= arr[arr.length-1];
		arr[arr.length-1] = num0;
		
		return arr;
	}
	
}
