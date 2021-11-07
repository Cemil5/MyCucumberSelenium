package replit;

import java.util.Scanner;

public class SecondsHours {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int inputSeconds, hours, minutes, seconds;
		
		System.out.println("Enter seconds:");
		inputSeconds = s.nextInt();
		seconds = inputSeconds;
		
		hours = seconds / 3600;
		seconds = seconds % 3600;
		
		minutes = seconds / 60;
		seconds = seconds % 60;
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
	}

}
