package replit;

import java.util.Scanner;

public class PartyList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String report="";
		String more="";
		
		do {
			System.out.println("Please enter guest name:");
			String name = input.nextLine();
			report +=name;
			System.out.println("Do you want to enter new guest name:");
			more = input.nextLine();
			if (more.equals("yes")||more.equals("Yes")) {
				report +=", ";
			}
		} while (more.equals("yes")||more.equals("Yes"));
		System.out.println("Guest's list: " + report);
	}

}
