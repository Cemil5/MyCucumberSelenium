package a_live_review.week11_14_08_2021;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		int[] numbers = {100, -10, 200, 40, 50, 0, 1000, 500};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int each : numbers) {
			if (each > max) {
				max = each;
			}
			if (each < min) {
				min = each;
			}
		}
					
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		System.out.println("--------------------------");
		
		int[][] arr2D = { {100,200,300}, {40,5000}, {200, 300, 1000} };
		int max2 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr2D.length; i++) {	// i : index of each single dimensional array
			for (int j = 0; j < arr2D[i].length; j++) { // j : index of elements in single dimensional array
				if (arr2D[i][j] > max2) {
					max2 = arr2D[i][j];
				}
				if (arr2D[i][j] < min2) {
					min2 = arr2D[i][j];
				}
			}
		}
		System.out.println("max2 : " + max2);
		System.out.println("min2 : " + min2);

		
		System.out.println("--------------------------");
		max2 = Integer.MIN_VALUE;
		for (int[] each1D : arr2D) {	// getting each single dimensional array from arr2D
			for (int each : each1D) {	// 
				if (each > max2) {
					max2 = each;
				}
			}
		}
		System.out.println("for each max2 : " + max2);
		
		
	//	int[] numbers = {100, -10, 200, 40, 50, 0, 1000, 500};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));	// [-10, 0, 40, 50, 100, 200, 500, 1000]
		System.out.println(numbers[numbers.length-1]);	// 1000

		
	}

}
