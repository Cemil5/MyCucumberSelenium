package day18_readingUserInput;

import java.util.Scanner;

public class Task74_SumNum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int num, sum=0;
		
		do {
			System.out.println("Enter a number: ");
			num = s.nextInt();
			if (num>0) {
				sum +=num;
				System.out.println("num: "+num+" sum: "+ sum);
			}
			
		} while (num>0);
		
	}

}
