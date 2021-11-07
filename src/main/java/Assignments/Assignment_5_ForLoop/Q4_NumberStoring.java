package Assignment_5_ForLoop;
/*
 * Write a while loop that lets the user enter a number. The number should be multiplied by 10, and the result stored in the variable product. The loop should iterate as long as product contains a value less than 100.
 */
import java.util.Scanner;
public class Q4_NumberStoring {

	public static void main(String[] args) {
		
		int num = 0, result = 0;
		Scanner scan = new Scanner(System.in);
		while (result < 100){
			System.out.println("Enter a number:");
			num = scan.nextInt();
			result = num*10;
			System.out.println(result);
		}
		
	}

}
