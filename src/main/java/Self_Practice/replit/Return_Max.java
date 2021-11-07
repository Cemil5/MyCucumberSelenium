package replit;
import java.util.Scanner;
/*
 * Finish the method **max** which has two parameters, x and max.
  -  if **x** is bigger than **max** return `x` 
  -  if **max** is bigger than **x** return `max` 
  -  all other cases return `x`

Example:
max(1,10) -> 10
max(11,5) -> 11
 */

public class Return_Max {

	public static int max(int x, int max){
	    // Code here
		int result=0;
		
		if (x >= max) {
			result = x;
		} else {
			result = max;
		}
		return result;

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		    System.out.println(max(in.nextInt(), in.nextInt()));
	}

}
