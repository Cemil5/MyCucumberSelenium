package replit;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * In mathematics a **factorial** of a positive integer _n_, denoted by _n_!, is the product of all positive integers less than or equal to _n_.  Calculate factorial and output result to the console.
 */
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    long res=1;
	    for (int i=1; i<= n; i++) {
	    	res *=i;
	    }
		System.out.println(res);
		
	}

}
