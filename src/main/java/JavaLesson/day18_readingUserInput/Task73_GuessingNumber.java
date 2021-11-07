package day18_readingUserInput;

import java.util.Scanner;

public class Task73_GuessingNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
				
		int guess, secretNumber = 8;
		System.out.print("Enter a number between 1 -20: ");
		do {
			guess = s.nextInt();
			if (guess > secretNumber) {
				System.out.print("your guess is too large, guess again ");
			} else if (guess != secretNumber){
				System.out.print("your guess is too small, guess again ");
			}
		} while(guess != secretNumber);
		
		System.out.println("Congrat, you got it");
	}

}
