package replit;
import java.util.*;

public class CalendarMonths {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int day = s.nextInt();
		
		String message ="";
		
		switch (day) {
		case 1:
			message ="Monday";
			break;
		case 2:
			message ="Tuesday";
			break;	
		case 3:
			message ="Wednesday";
			break;	
		case 4:
			message ="Thursday";
			break;	
		case 5:
			message ="Friday";
			break;	
		case 6:
			message ="Saturday";
			break;	
		case 7:
			message ="Sunday";
			break;	
			default:
				message = "Not a valid day";			
		}
		System.out.println(message);
		
		
	}

}
