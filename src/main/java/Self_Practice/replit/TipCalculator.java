package replit;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {

	
		Scanner s = new Scanner(System.in);
		System.out.println("Split:");
				String split=s.nextLine();
		    System.out.println("Number of people:");
				int numberOfPeople=s.nextInt();
		        System.out.println("Check amount:");

				double checkAmount = s.nextDouble();
				s.nextLine();
		    		System.out.println("Service Quality:");

				String serviceQuality =s.nextLine();
				
				double totalTip =0;
		    String peopleSign="";
		    for (int i=1;i<=numberOfPeople;i++ ){
		      peopleSign+="&";
		    }
				
				switch (serviceQuality) {
				case "Excellent":
					totalTip=checkAmount*0.25;
					break;
				case "Great":
					totalTip=checkAmount*0.20;
					break;
				case "Good":
					totalTip=checkAmount*0.15;
					break;
				case "Fair":
					totalTip=checkAmount*0.10;
					break;
				case "Poor":
					totalTip=checkAmount*0.05;
				}	
			
				System.out.println("Number of people entered: " + peopleSign);
				System.out.println("Total to pay: "+ (checkAmount+totalTip));
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + (checkAmount+totalTip)/numberOfPeople);
				System.out.println("Tip per person: " + totalTip/numberOfPeople);
		
	}

}
