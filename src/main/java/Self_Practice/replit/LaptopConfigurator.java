package replit;

import java.util.Scanner;

public class LaptopConfigurator {

	public static void main(String[] args) {

		double price=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Select screen size:");
		double screenSize = s.nextDouble();
		s.nextLine();
		System.out.println("Select CPU type:");
		String typeOfCPU = s.nextLine();
		System.out.println("Select RAM size:");
		int sizeOfRAM= s.nextInt();
		s.nextLine();
		System.out.println("Select storage type:");
		String typeOfStorage = s.nextLine();
		System.out.println("Enter memory size:");
		int sizeOfMemory= s.nextInt();
		s.nextLine();
		System.out.println("Enter screen resolution:");
		String screenResolution = s.nextLine();
		
		if (screenSize == 13.3) {
			price += 200;
		} else if (screenSize == 15.0) {
			price += 300;
		} else if (screenSize == 17.3) {
			price += 400;
		}
		
		switch (typeOfCPU) {
		case "i3":
			price += 150;
			break;
		case "i5":
			price += 250;
			break;
		case "i7":
			price += 350;
			break;		
		}
		
		price += 50*(sizeOfRAM/4);
		
		switch (typeOfStorage) {
		case "HDD":
			price += 50*(sizeOfMemory/500);
			break;
		case "SSD":
			price += 100*(sizeOfMemory/500);
			break;
		}
		
		switch (screenResolution) {
		case "FULLHD":
			price += 100;
			break;
		case "4K":
			price += 200;
			break;
		}
		
		System.out.println("Laptop price is: $"+price);
	}

}
