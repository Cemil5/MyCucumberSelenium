package day18_readingUserInput;

import java.util.Scanner;

public class Task72_Sum3number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 number:");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		System.out.println("Sum : " + (num1+num2+num3));
	}

}
