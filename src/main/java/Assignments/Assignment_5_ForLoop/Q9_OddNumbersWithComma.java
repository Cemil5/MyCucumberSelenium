package Assignment_5_ForLoop;
/*
 * Write a program for the following logic:
Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
 */
import java.util.Scanner;

public class Q9_OddNumbersWithComma {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter upper bound number:");
		int upperBound = s.nextInt();
		s.close();
		
		int i=0;
		
		while (++i<=upperBound) {
			if (i%2 ==1) {
				if (i<upperBound && i != (upperBound-1)) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
		
		}
		
	}

}
