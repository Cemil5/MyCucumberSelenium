package replit;

import java.util.Scanner;

public class _CarInsurance {

	public static void main(String[] args) {   // Test Case 3 does not pass with this code.

		//DO NOT CHANGE
	    double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");
	    //WRITE YOUR CODE HERE
			System.out.println("Enter your name");
			name = scan.nextLine();
			System.out.println("Do you have a US driver license?");
			String driverLicense = scan.nextLine();
			driverLicense = driverLicense.toLowerCase();
			if (driverLicense.equals("no")) {
				System.out.println("Invalid data!");
				System.exit(0);
			} 
			
			System.out.println("Enter your zip code");
			int zipCode = scan.nextInt();
			if (zipCode == 20910 || zipCode == 20740) {
				premium += 60;
			} else if (zipCode == 22102 || zipCode == 22103) {
				premium += 30;
			} else {
				premium += 50;
			}
			
			scan.nextLine();
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.nextLine();
			vehicleOwnership = vehicleOwnership.toLowerCase();
			if (vehicleOwnership.equals("owned")) {
				premium += 10;
			} else {
				premium += 20;
			}
			
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.nextLine();
			vehicleUsage = vehicleUsage.toLowerCase();
			
			if (vehicleUsage.equals("business")) {
				premium += 50;
			} else if (vehicleUsage.equals("pleasure")) {
				premium += 10;
			} else if (vehicleUsage.equals("commute")) {
				premium += 20;
			}
			
			if (vehicleUsage.equals("business")||vehicleUsage.equals("commute")) { 
				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool = scan.nextInt();
				premium += daysDrivenToWorkOrSchool*5;
				
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool = scan.nextInt();
				premium += milesToWorkOrSchool;
			}
			
			System.out.println("How old are you?");
			int age = scan.nextInt();
			if (age<16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else if (age<18){
				premium = premium*20;
			} else if (age<=21){
				premium = premium*6;
			} else if (age<25){
				premium = premium*2;
			}
			
			System.out.println("How many years you've been driving?");
			int drivingExperience = scan.nextInt();
			if (drivingExperience<=0 || age - drivingExperience <=16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else {
				premium -= drivingExperience*5;
			}
			
			scan.nextLine();
			System.out.println("Have you had any accidents in the last 5 years?");
			vehicleUsage = scan.next();
			vehicleUsage = vehicleUsage.toLowerCase();
			if (vehicleUsage.equals("yes")) {
				System.out.println("How many?");
				accidentsAmount = scan.nextInt();
				premium += premium*0.20*accidentsAmount;
			}
			
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.next();
			continuousInsurance = continuousInsurance.toLowerCase();
			if (continuousInsurance.equals("no")) {
				premium *=2;
			}
			System.out.println("What is the highest level of education you have completed?");
			scan.nextLine();
			education = scan.nextLine();
			education = education.toLowerCase();
			if (education.equals("phd") || education.equals("bachelors") || education.equals("masters")){
				premium -=premium*0.05;
			} else if (education.equals("doctors") ){
				premium -=premium*0.10;
			} else if (education.equals("less than high school") ){
				premium +=premium*0.05;
			}
			
			System.out.println(name + ", here's your quote!");
			System.out.println("Start Your Policy Today For: $" + premium);
			referenceNumber = name.substring(0, 2)+age+name.substring(name.length()-2, name.length())+zipCode;
			education = education.replace(" ", "");
			
			referenceNumber += education;
			referenceNumber = referenceNumber.toUpperCase();
			System.out.println("Reference number: " +referenceNumber);
	
	}

}
