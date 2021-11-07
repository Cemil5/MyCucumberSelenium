package assignment_3_18_06_21;
/*
 * Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2

      Sample output:

      n1=10
      n2=20

      ----------

      n1=20
      n2=10
 */

public class Q4_SwappingTwoNumbers {

	public static void main(String[] args) {		
		int num1, num2, swap;
		
		num1 = 10;
		num2 = 20;
		System.out.println("Number 1 is " + num1);
		System.out.println("Number 2 is " + num2 +"\n");
		
	//	swap = num2;
	//	num2 = num1;
	//	num1 = swap;
		
	//	num1 = num1 + num2;
	//	num2 = num1 - num2;
	//	num1 = num1 - num2;
		
		
		num2 = (num1 + num2) - (num1 = num2);
		
		System.out.println("After swapping:");
		System.out.println("Number 1 is " + num1);
		System.out.println("Number 2 is " + num2);
		
		
		
	}
}
