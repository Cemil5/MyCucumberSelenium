package replit;

import java.util.Scanner;

public class CaffeineOverDose {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of milligrams in drink:");
		int n=s.nextInt();
		
		System.out.println("It would take about " + (10*1000/n) +" drinks for a lethal overdose.");
		
		
	}

}
