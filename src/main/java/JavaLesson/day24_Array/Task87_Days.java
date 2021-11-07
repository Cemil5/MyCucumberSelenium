package day24_Array;

import java.util.Scanner;

public class Task87_Days {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter day index");
		int dayIndex = sc.nextInt();
		
		String[] dayName = new String[7];
		
		dayName[0] ="Monday";
		dayName[1] ="Tuesday";
		dayName[2] ="Wednesday";
		dayName[3] ="Thursday";
		dayName[4] ="February";
		dayName[5] ="Saturday";
		dayName[6] ="Sunday";
		
		System.out.println("The day name is : "+ dayName[dayIndex]);

	}

}
