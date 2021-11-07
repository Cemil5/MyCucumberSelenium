package Self_Practice._interviewPreparation;
/*
 * Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
 */
import java.util.Scanner;
public class __FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter terms number:");
		int termsNumber = scan.nextInt();
		
		System.out.println("group");
		group(termsNumber);
		
		System.out.println("--------------------");
		
		System.out.println("mySolution");
		mySolution(termsNumber);
		
		System.out.println("--------------------");

		System.out.println("recursion");
		mySolution(termsNumber);
		
	}
	
	public static void group(int count) {	
		int num1 =0, num2 =1, temp =0;
		System.out.print(num1 + " ");
		for(int i=1; i<count; i++) {
			System.out.print(num2 + " ");
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}
	}
	
	public static void recursion(int count) {
		int num1 =0, num2 =1, temp=0;
		System.out.print(num1 + " ");
		if (count > 1) {
			System.out.print(num2 + " ");
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			recursion(count--);
		}
	}
	
	public static void mySolution(int termsNumber) {	
		int num1 =0, num2 =1, temp=0;
		
		if (termsNumber <= 1) {
			System.out.println(0);
		} else {
			System.out.print("0 1 ");
			for (int i =2;i<termsNumber;i++) {
				temp = num1 + num2;
				num1 = num2;
				num2 = temp;
				System.out.print(temp + " ");
			}		
		}
	}
	
}
