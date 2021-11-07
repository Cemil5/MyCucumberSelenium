package basics;
import java.util.*;

public class __RealEstate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DO NOT CHANGE
	    int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
	    //WRITE YOUR CODE HERE
		
		Scanner scan1 = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Enter your property type:");
		houseType = new Scanner(System.in).nextLine();
		
		switch (houseType) {
		case "Condo":
			propertyPrice = 50_000;
			break;
		case "Townhouse":
			propertyPrice = 75_000;
			break;
		case "Single Family Home":
			propertyPrice = 95_000;		
			break;
		default:
	        System.out.println("INVALID ENTRY");
	        break;
		}
		
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();		
		propertyPrice += numberOfBedrooms*30_000;

		
		System.out.println("Do you have a backyard?");
		backyard = scan.nextBoolean();
		if (backyard) {
			if (houseType.equals("Condo")) { 
			System.out.println("Backyard is not available for condo!");
		} else {
			propertyPrice += 5_000;
		}
		}
			
		System.out.println("Do you have garage?");
		garage = scan.nextBoolean();
		System.out.println("How many spots?");
		garageSpots = scan.nextInt();
		if (garage){
			if (garageSpots>0 && garageSpots<=10) {
				propertyPrice += garageSpots*20_000;
			} else {
				System.out.println("Pardon, it's not public parking!");
			}
		}
		
		System.out.println("How close is metro station?");
		metroAccessibility = scan1.nextFloat();
		if (metroAccessibility<=1.0) {
			propertyPrice += 10_000; 
		} else if (metroAccessibility<3.0) {
			propertyPrice += 5_000; 
		}
		
		System.out.println("How close is highway?");
		highwayAccessibility = scan1.nextFloat();
		if (highwayAccessibility<=1.0) {
			propertyPrice += 15_000;
		} else if (highwayAccessibility<5.0) {
			propertyPrice += 8000;
		} else if (highwayAccessibility<=20.0) {
			propertyPrice += 4000;
		}
				
		System.out.println("What's the rating of nearest school?");
		schoolScore = scan1.nextFloat();
		if (schoolScore <=10 && schoolScore>=8) {
			propertyPrice +=45_000;
		} else if (schoolScore <8 && schoolScore>4) {
			propertyPrice +=20_000;
		} else {
			propertyPrice +=5_000;
		}
				
		System.out.println("Does any of your family members smoke?");
		smoking = scan.nextBoolean();		
		if (smoking) {
			propertyPrice -=5_000;
		}
		
		
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: " +propertyPrice+ "$");
		
		
		
	}
}
