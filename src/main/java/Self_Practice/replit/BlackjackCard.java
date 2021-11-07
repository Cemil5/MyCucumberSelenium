package replit;
import java.util.*;

public class BlackjackCard {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int house = s.nextInt();
		int player = s.nextInt();
		String message ="";
		
		if (house > player) {
			message ="player loss";
		} else if (house == player) {
			message ="its a tie";
		} else if (house < player && player <25) {
			message ="player win";
		} else {
			message ="player bust";
		}
		System.out.println(message);
		
		
		
	}

}
