package _NiceToKnow;

import java.util.Scanner;

public class ShoppingList2_Replit {

	public static void main(String[] args) {

		String item, countinue, shoppingListReport="";
		double price, totalPrice=0;
		int count=1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.nextLine();
			price = scan.nextDouble();
			shoppingListReport +="Item"+ count + ": " + item + " Price: " + price;
			totalPrice += price;
			scan.nextLine();
			System.out.println("Add one more item?");
			countinue = scan.nextLine();
			if (countinue.equals("yes")) {
				count++;
				shoppingListReport +=", ";
			}
		} while (countinue.equals("yes"));
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice);
		
	}	

}
