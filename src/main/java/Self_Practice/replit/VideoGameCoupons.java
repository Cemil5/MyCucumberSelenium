package replit;

import java.util.Scanner;

public class VideoGameCoupons {

	public static void main(String[] args) {
		
		int candies=0, gumballs=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of coupons:");
		int coupons = s.nextInt();
		
		if (coupons <3) {
			System.out.println("Not enough coupons");
		} else {
			if (coupons >=10) {
				candies = coupons /10;
				coupons = coupons % 10;
			}
			if (coupons >=3) {
				gumballs = coupons /3;
			}
			System.out.println("Number of Candies: " + candies);
			System.out.println("Number of Gumballs: " + gumballs);
		}
		
	}

}
