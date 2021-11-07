package labs.Lab4;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {

		int[] x1 = {1,2}; int[] y1 = {3,4}; //= > [3,4]
		int[] x2 = {5,6}; int[] y2 = {3,8}; //= > equal
		int[] x3 = {1,1}; int[] y3 = {1,0}; //= > [1,1]
		
		System.out.println(largest(x1,y1));
		System.out.println(largest(x2,y2));
		System.out.println(largest(x3,y3));
	}

	public static String largest(int[] arr1, int[] arr2) {
		String str = "";
		int sum1 = 0;
		int sum2 = 0;
		
		for (int num : arr1) {
			sum1 += num;
		}
		for (int num : arr2) {
			sum2 += num;
		}
		
		if (sum1>sum2) {
			str = Arrays.toString(arr1);
		} else if (sum2>sum1) {
			str = Arrays.toString(arr2);
		} else {
			str = "equal";
		}
		
		return str;
	}
	
}
