package labs.Lab4;

import java.util.Arrays;

public class Q20 {

	public static void main(String[] args) {

		int[] x = {1,2,2}; // = > true
		int[] y = {1, 2, 1,2}; // = > false
		int[] a = {2,1,2}; // = > false
		int[] b = {2,2,1,2}; // = > true
		
		System.out.println(is2Next2(x));
		System.out.println(is2Next2(y));
		System.out.println(is2Next2(a));
		System.out.println(is2Next2(b));
		
	}

	public static boolean is2Next2 (int[] arr) {
		boolean flag = false;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 2 && arr[i+1] == 2) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
}
