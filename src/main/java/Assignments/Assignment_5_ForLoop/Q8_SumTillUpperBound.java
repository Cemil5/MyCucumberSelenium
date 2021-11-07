package Assignment_5_ForLoop;
/*
 * Write a program to calculate the sum of the numbers from 1 till upper bound.
If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

You should use a while loop.
 */
import java.util.Scanner;
public class Q8_SumTillUpperBound {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter upper bound number:");
		int upperBound = s.nextInt();
		
		int i=0, sum =0;
		while (++i<=upperBound) {
			sum +=i;
		}
		System.out.println("Sum of numbers : " + sum);
	}

}
