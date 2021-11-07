package replit;
import java.util.*;
/*
 * Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550
 */
public class LeasingOffice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Apartments!");
		System.out.println("Number of bedrooms you are interested:");
		
		int numberOfBedrooms = scan.nextInt();
		String message = "";
		
		if (numberOfBedrooms == 1) {
			message = "One Bedroom Selected\nStarting Price: 1100";
		} else if (numberOfBedrooms == 2) {
			message = "Two Bedroom Selected\nStarting Price: 1850";
		} else if (numberOfBedrooms == 3) {
			message = "Three Bedroom Selected\nStarting Price: 2550";
		} else {
			message = "No such Bedrooms available";
		}
		System.out.println(message);

	}

}
