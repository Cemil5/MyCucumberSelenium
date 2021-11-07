package replit;
import java.util.*;

public class VehicleRecall {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter vehicle's year:");
		int vehicleYear = s.nextInt();
		
		String message ="";
		
		if ((vehicleYear >=1995 && vehicleYear<=1998) | (vehicleYear >=2001 && vehicleYear<=2002) | (vehicleYear >=2004 && vehicleYear<=2006) | (vehicleYear >=2015 && vehicleYear<=2017)) {
			message ="Your vehicle needs to be recalled!";
		} else {
			message = "Your vehicle is fine, enjoy!";
		}
		System.out.println(message);
		
	}

}
