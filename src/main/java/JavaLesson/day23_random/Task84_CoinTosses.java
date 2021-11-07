package day23_random;

import java.util.Random;

public class Task84_CoinTosses {

	public static void main(String[] args) {

		Random rn = new Random();
		
		for (int i=1; i<=10; i++) {
			if (rn.nextBoolean()) {
				System.out.println("Heads");
			} else {
				System.out.println("Tails");
			}
		}
		
	}

}
