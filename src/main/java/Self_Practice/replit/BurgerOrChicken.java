package replit;
import java.util.*;

public class BurgerOrChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String order = s.next();
		
		switch (order){
		case "burger": 
		case "chicken":
			System.out.println("10.0");
			break;
		case "soda":
			System.out.println("2.0");
			break;
		case "fries":
			System.out.println("3.5");
			break;				
		}
		
	}

}
