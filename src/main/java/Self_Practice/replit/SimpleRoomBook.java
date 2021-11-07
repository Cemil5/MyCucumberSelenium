package replit;
import java.util.Scanner;

public class SimpleRoomBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    
	}

	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year) {
		   // your code here 
		   

		  return (isAvailable && (month == 7 ? (day>8 ? true : false):true) && year == 2018);
		  
		  }
}
