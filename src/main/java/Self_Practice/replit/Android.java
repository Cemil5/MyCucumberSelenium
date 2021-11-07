package replit;
import java.util.*;

public class Android {
	public static void main(String[] args) {
		
		// Scanner input = new Scanner(System.in);
		//    double version = input.nextDouble();
		    
		    //WRITE YOUR CODE HERE:
		double version = 14;    
		    String name = "";
		    
		 if (version == 1.5) {
			 name = "Cupcake";
		 } else if (version == 1.6) {
			 name = "Donut"; 
		 } else if (version == 2.1) {
			 name = "Eclair"; 	 
		 } else if (version == 2.2) {
			 name = "Froyo"; 
		 } else if (version == 2.3) {
			 name = "Gingerbread"; 
		 } else if (version == 3.1) {
			 name = "Honeycomb"; 	 
		 } else if (version == 4.0) {
			 name = "Ice Cream Sandwich"; 		 
		 } else if (version == 4.1) {
			 name = "Jelly Bean"; 
		 } else if (version == 4.4) {
			 name = "KitKat"; 	 
		 } else if (version == 5.0) {
			 name = "Lollipop"; 		 
		 } else if (version == 8.0) {
			 name = "Oreo"; 
		 } else if (version == 9.0) {
			 name = "Pie"; 		 
		 } else {
			 System.out.println("Sorry, I don't know this version!");
		 }
		if (name != "") {
			System.out.println(name); 
		}
	}

}
