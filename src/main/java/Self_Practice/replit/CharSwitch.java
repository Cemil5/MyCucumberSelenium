package replit;
import java.util.*;

public class CharSwitch {

	public static void main(String[] args) {		
		
		Scanner c= new Scanner(System.in);
		System.out.println("Enter command:");
		char response = c.next().charAt(0);
		
		String message ="";
		switch (response) {
		case 'y':
			message ="Your request is being processed is printed";
			break;
		case 'n':
			message ="Thank you anyway for your consideration is printed";
			break;				
		case 'h':
			message ="Sorry, no help is currently available is printed";
			break;	
		default:
			message="Invalid entry, please try again!";
		}

		System.out.println(message);
		
	}

}
