package replit;
import java.util.Scanner;
public class PrintLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);	
		
	    char i = start;
	    while (i<=end) {
	    	System.out.print(i);
	    	i++;
	    }
		
	}

}
