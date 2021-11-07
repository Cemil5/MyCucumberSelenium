package labs.Lab4;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {

		int[] a = {1,2,3}; //= > [1,2,0]
		int[] b = {2,3,5}; //= > [2,0,5]
		int[] c = {1,2,1}; //= > [1,2,1]
		int[] d = {11,2,13,3,2}; //= > [11,2,13,3,2]
		
		System.out.println(Arrays.toString(replace3(a)));
		System.out.println(Arrays.toString(replace3(b)));
		System.out.println(Arrays.toString(replace3(c)));
		System.out.println(Arrays.toString(replace3(d)));

		
	}
	
	public static int[] replace3(int[] arr) {
		
		for (int i =0; i<arr.length;i++) {
			if (arr[i] == 3 && arr[i-1]==2) {
				arr[i] = 0;
			}
		}
		
		return arr;
	}
	
}
