package day18_readingUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a byte value:  ");
		
		byte b1 = sc.nextByte();
		
		System.out.println(b1);
		System.out.println(b1*10);
		System.out.println(b1%2);
		System.out.println("Enter a short value: ");
		System.out.println(sc.nextShort());

		int i1 = sc.nextInt();
		long l1 = sc.nextLong()	;
		double d1 = sc.nextDouble();
		boolean bool = sc.nextBoolean();
		
		
		
	}

}
