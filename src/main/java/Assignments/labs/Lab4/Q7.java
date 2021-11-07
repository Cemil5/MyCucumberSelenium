package labs.Lab4;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {}; //= > [1,3]
		int[] a = {7,4,6,2};
		int[] b = {}; //= > [7,2]
		
		System.out.println(Arrays.toString(firstLast(x, y)));
		System.out.println(Arrays.toString(firstLast(a, b)));
		
	//	x = new int[5];
	//	System.out.println(Arrays.toString(x));
	}

	public static int[] firstLast (int[] arr1, int[] arr2) {
		
		arr2 = new int[2];
		arr2[0] = arr1[0];
		arr2[1] = arr1[arr1.length-1];
		return arr2;
	}
	
}
