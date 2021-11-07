package replit;
import java.util.*;

public class TernaryConditionalOperator {

	public static void main(String[] args) {
		/*
		 * Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:

Display x if x is greater **than** or equal to 5
Display -x if x is less **than** 5
		 */
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		System.out.println(x > 5 ? x : -x);

	}

}
