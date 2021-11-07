package replit;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		int input, quarters, dimes, nickels, pennies;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter cents:");
		input = s.nextInt();
		
		quarters = input / 25;
		pennies = input % 25;
		dimes = pennies / 10;
		pennies= pennies % 10;
		nickels = pennies / 5;
		pennies = pennies % 5;
		
		if (input<100&&input>0) {
			System.out.println("Your change is "+ quarters+" quarters, " + dimes+ " dimes, " + nickels + " nickels, and " + pennies + " pennies");
		} else {
			System.out.println("Invalid cents amount");
		}
	}

}
