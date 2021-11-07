package a_live_review.week08_24_07_2021;

import java.util.Scanner;

public class MinAndMax {
	/*
	 * enter 5 numbers
	 * find min and max numbers
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1;
		int min = 2147483647, max=-2147483647;
		
		for (int i=1; i<=5; i++) {
			System.out.println("enter a number");
			n1 = sc.nextInt();
			
			if (i==1) {
				min = n1;
				max = n1;
			} else {
				if (n1 < min) {
					min = n1;
				}
				if (n1 > max) {
					max = n1;
				}
			}
		}
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);

	}

}
