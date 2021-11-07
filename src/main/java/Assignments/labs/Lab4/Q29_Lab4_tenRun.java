package labs.Lab4;

import java.util.Arrays;
/* Write a function that accepts and array. For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10.  */

public class Q29_Lab4_tenRun {

	public static void main(String[] args) {

		int[] x = {2,10,3,4,20,5,6,50,1,2,6,0,7,9};
		System.out.println(Arrays.toString(tenRun(x))); // [2, 10, 10, 10, 20, 20]
		int[] y = {10,1,20,2};
		System.out.println(Arrays.toString(tenRun(y))); // [10, 10, 20, 20]
		
		System.out.println(Arrays.toString(ozzy(x))); // [2, 10, 10, 10, 20, 20]
		System.out.println(Arrays.toString(ozzy(y))); // [10, 10, 20, 20]
	}

	public static int[] tenRun(int[] arr) {
		boolean flag = false;
		int temp =0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == 0) {
				flag = true;
				temp = arr[i];
			} else if (flag) {
				arr[i] = temp;
			}
		}
		return arr;
	}
	
	public static int[] ozzy(int[] arr) {
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == 0) {
				for(int j = i+1; j<arr.length && arr[j] % 10 != 0; j++) {
					arr[j] = arr[i];
				}
			} 
			
		}
		return arr;
	}
}
