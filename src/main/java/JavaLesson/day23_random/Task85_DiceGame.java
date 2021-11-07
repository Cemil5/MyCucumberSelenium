package day23_random;

import java.util.Random;

public class Task85_DiceGame {

	public static void main(String[] args) {

		Random rn = new Random();
		int compWin =0;
		int userWin =0;
		
		for (int i=1; i<=10; i++) {
			int compDice =rn.nextInt(6)+1;
			int userDice =rn.nextInt(6)+1;
			
			if (compDice > userDice) {
				compWin++;
			} else if (compDice < userDice) {
				compDice++;
			}
		}
		
		if (compWin > userWin) {
			System.out.println("computer wins");
		} else if (compWin < userWin) {
			System.out.println("user wins");
		} else {
			System.out.println("tie, no winner");

		}
		
	}
	
}
