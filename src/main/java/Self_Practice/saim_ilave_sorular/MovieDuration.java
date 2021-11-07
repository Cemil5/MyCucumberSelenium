package saim_ilave_sorular;
/*
 * The length of the movie will determine how much it costs.
Use a Scanner object to read the input from the user for how long the movie is and print
out how much the movie will cost.
The length will be given as a decimal as hours.minutes
> 1.0 - 8.99
> 1.5 - 10.50
> 2.0 - 12.99
> 2.5 - 14.50
-> 3 or more - 15.99

 */

import java.util.*;

public class MovieDuration {
	public static void main(String[] args) {
		
		System.out.println("Enter movie duration (as a decimal as hours.minutes");
		Scanner s = new Scanner(System.in); //.useLocale(Locale.US);
		double duration = s.nextDouble();
		double cost =0;
		
		if (duration>1.0) {
			if (duration <= 1.5) {
				cost = 8.99;
			} else if (duration<2.0) {
				cost = 10.50;			
			} else if (duration<2.5) {
				cost = 12.99;
			} else if (duration<3.0 ) {
				cost = 14.50;
			} else if (duration>=3.0) {
				cost = 15.99;
			}
		System.out.println("The movie will cost " + cost);
		} else 
			System.out.println("The movie duration must be at least one hour");

	}

}
