package replit;
/*
Your program should ask use to enter items followed by its price. After adding item,  ask user if he wants to add one more item. If so, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items. 

Hint: use do while loop.
 */
import java.util.Scanner;

public class ShoppingList2 {

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
