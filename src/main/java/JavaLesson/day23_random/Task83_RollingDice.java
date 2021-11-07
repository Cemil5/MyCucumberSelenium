package day23_random;

import java.util.*;

public class Task83_RollingDice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int n1 = rn.nextInt(6)+1;
		int n2 = rn.nextInt(6)+1;
		String str ="y";
				
		do {
			System.out.println("rolling the dices ...");
			System.out.println("Their values are: " + n1 + " " + n2);	
		
			System.out.println("Roll them again (y=yes, n=no)?");
			str = sc.next();
		} while (str.equalsIgnoreCase("y"));
		
	}

}
