package replit;

import java.util.Scanner;

public class FindMidNumber {

	public static void main(String[] args) {

		int num1, num2, num3, mid=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = s.nextInt();
		System.out.println("Enter second number:");
		num2 = s.nextInt();
		System.out.println("Enter third number:");
		num3 = s.nextInt();
		
		
		if (num1>num2 && num1<num3 || num1>num3 && num1<num2) {
			mid = num1;
		} else if (num2>num1 && num2<num3 || num2>num3 && num2<num1) {
			mid = num2;
		} else if (num3>num1 && num3<num2 || num3>num2 && num3<num1) {
			mid = num3;
		}
		System.out.println("Medium value is: " + mid);
		
	}

}
