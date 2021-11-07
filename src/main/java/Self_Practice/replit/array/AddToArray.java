package replit.array;

import java.util.Arrays;

public class AddToArray {

	public static void main(String[] args) {

		int[] arr = {1, 5, 77, 8, 2};
		System.out.println(Arrays.toString(add_to_r(arr, 5)));
	}
	public static int[] add_to_r(int[] r,int n) {
		int[] arr = new int[r.length+1];
		
		for (int i = 0; i < r.length; i++) {
			arr[i] = r[i];
		}
		arr[arr.length-1] = n;
		
		return arr;
	}
}
