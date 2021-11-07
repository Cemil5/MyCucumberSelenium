package replit;
import java.util.Scanner;

public class Scan3Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  System.out.println("Enter 3 numbers:");
		  int num1, num2, num3, sum;
		  num1 = scan.nextInt();
		  num2 = scan.nextInt();
		  num3 = scan.nextInt();
		  sum = num1 + num2 + num3;
		  System.out.println("Sum of numbers: " + sum);
		  
	}

}
