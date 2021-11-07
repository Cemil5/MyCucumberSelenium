package replit;

import java.util.*;

public class ScannerInput {
	public static void main(String[] args) {
		
		String item1, item2, item3, report;
		double  price1, price2, price3, totalPrice;
		
		System.out.println("Enter Item1 and its price:");
		item1 = new Scanner(System.in).nextLine(); 
		Scanner in = new Scanner(System.in);
		    price1 = in.nextDouble();
		
		 System.out.println("Enter Item2 and its price:");
			item2 = new Scanner(System.in).nextLine(); 
			Scanner in1 = new Scanner(System.in);
			    price2 = in.nextDouble();
			       
		System.out.println("Enter Item3 and its price:");
					item3 = new Scanner(System.in).nextLine(); 
					Scanner in3 = new Scanner(System.in);
					    price3 = in.nextDouble();
					    
		System.out.println("Item1: " + item1+ " Price: "+price1+", Item2: " + item2+ " Price: "+price2+", Item3: " + item3+ " Price: "+price3+",");			    
		System.out.println("Total price: " + (price1+price2+price3));
		
	}

}
