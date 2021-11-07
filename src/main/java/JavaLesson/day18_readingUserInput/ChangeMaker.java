package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of change
		// quarter : 25 cents
		// dimes : 10 cents
		// nickles : 5 cents
		// pennies : 1 cents

		Scanner sc = new Scanner(System.in);
		
		int attemp =0;
		int input;
		
		System.out.print("How many cents do you have? ");
		do {
			input = sc.nextInt();
			attemp++;
			if (attemp!=3 && (input<1 || input >100)) {
				System.out.print("You input a wrong amount! Please reenter the amount between 1 - 99 : ");
			}
		} while (attemp<3 && (input > 99 || input < 1));

		if (input>=1 && input <100) {
			change(input);
		} else {
			System.out.println("You tried 3 times, you can not re enter any amount.");
			}
		 
		
	}
		
		public static void change(int amount) {
			int dollars, quarter, dimes, nickles, pennies = amount;
			dollars = pennies / 100;
			pennies = pennies % 100;
			quarter = pennies / 25;
			pennies = pennies % 25;
			dimes = pennies / 10;
			pennies = pennies % 10;
			nickles = pennies / 5;
			pennies = pennies % 5;
			
			System.out.println(amount + " cents : " + dollars + " dollars, "+ quarter + " quarter, "+ dimes + " dimes, " +  nickles + " nickles, " + pennies + " pennies");
			
		}
		
	

}
