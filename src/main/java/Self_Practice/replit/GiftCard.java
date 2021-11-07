package replit;
import java.util.*;

/*
 * Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output: 
Thank you for your purchase!
Your current balance is: 75$
 */

public class GiftCard {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 String item = input.nextLine();
		 int balance=0;
		 boolean validItem = true;
		 
		 switch (item){
			 case "Blanket":
				 balance = 100 - 60;
				 break;
			 case "Charger": case "Hat":
				 balance = 100 - 25;
				 break;	 
			 case "Headphones":
				 balance = 100 - 30;
				 break;
			 case "Laptop":
				 balance = 100 - 200;
				 break;
			 case "Pants":
				 balance = 100 - 50;
				 break;
			 case "Pillow":
				 balance = 100 - 40;
				 break;
			 case "Smartphone":
				 balance = 100 - 1000;
				 break;
			 case "Socks":
				 balance = 100 - 5;
				 break;
			 case "USB cable":
				 balance = 100 - 10;
				 break;
			default :
				System.out.println("Invalid item!");
				validItem = false;	
		 }
		 
		 if (validItem) {
			 if (balance >= 0 && balance < 100) {
				 System.out.println("Thank you for your purchase!");
				 System.out.println("Your current balance is: "+balance+"$");
			 } else {
			 System.out.println("Sorry, not enough funds on your gift card!");
			 }
		 }
		 
		    
	}

}
