package replit;

import java.util.Scanner;

public class NumberOfCitizens {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int seniorCitizens = input.nextInt();
		int nonSeniorCitizens = input.nextInt();
		
		System.out.println("What is new citizen's age?");
		int age = input.nextInt();
		
		if (age>=65 && age < 120) {
			seniorCitizens++;
			System.out.println("Senior Citizen");
		} else if (age<65 && age >=0) {
			nonSeniorCitizens++;
			System.out.println("Non-Senior Citizen");
		}
		System.out.println("New seniorCitizens count " + seniorCitizens);
		System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
		
	}

}
