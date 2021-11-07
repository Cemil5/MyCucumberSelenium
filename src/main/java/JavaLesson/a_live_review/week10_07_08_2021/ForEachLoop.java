package a_live_review.week10_07_08_2021;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] str = {"A", "B", "C", "D", "E"};
		
		for (int i =0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		System.out.println("\n----------------------");
		
		for (String s : str) {
			System.out.print(s + " ");
			if (s.equals("C")) {
				break;
			}
		}
		
		System.out.println("\n----------------------");
		
		System.out.println(Arrays.toString(str));
		
		System.out.println("\n----------------------");
		
		// max min with for each loop
		
		int[] arr = {1,2,30,4,5,-25,15,0};
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		
		for (int each : arr) {
			max = Math.max(max, each);
			min = Math.min(min, each);
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
