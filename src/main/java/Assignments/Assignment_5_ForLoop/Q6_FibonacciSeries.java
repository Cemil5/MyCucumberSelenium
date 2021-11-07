package Assignment_5_ForLoop;
/*
 * Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
 */
import java.util.Scanner;
public class Q6_FibonacciSeries {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter terms number:");
		int n = s.nextInt();
		
		int first =0, second =1, next=0;
		
		if (n <2) {
			if (n ==0) {
				System.out.println(0);
			} else {
				System.out.println("0 1");
			}
		} else {
			System.out.print("0 1 ");
			for (int i =2;i<=n;i++) {
				next = first + second;
				first = second;
				second = next;
				System.out.print(next + " ");
			}		
		}
	}

}
