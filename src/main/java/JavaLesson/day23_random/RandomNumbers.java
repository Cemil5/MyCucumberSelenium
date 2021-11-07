package day23_random;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextBoolean());
		System.out.println(rn.nextFloat());

		System.out.println(rn.nextInt(2)+10);
		System.out.println(rn.nextInt(1) + 5);

	}

}
