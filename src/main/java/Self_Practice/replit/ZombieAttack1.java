package replit;
import java.util.*;

public class ZombieAttack1 {

	public static void main(String[] args) {
/*
 * A variable **inhabitants** represents a city and its respective populations. City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population. Write a program to loop the city population and make it lose half of its population **until population is zero**.
 */
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    
	    int day =0;
	    
	    while (inhabitants>0) {
	    	System.out.println("Day "+ day+ " ["+ inhabitants+"]");
	    	inhabitants /= 2;
	    	day++;
	    }
		System.out.println("---- EXTINCT ----");
		
	}

}
