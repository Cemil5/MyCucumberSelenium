package day32_arrayList_part2;

import java.util.Scanner;

public class GroceryListMain {
	
	static GroceryList groceryList = new GroceryList();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		int choice=0;
		
		groceryList.printInstructions();
		
		do {
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				groceryList.printInstructions();
				break;
			case 1:
				printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;	
			case 6:
				quit = true;
				break;	
			}
		} while (!quit);
	}
	
	public static void printGroceryList() {
		groceryList.printGroceryList();
	}
	
	public static void addItem() {
		System.out.println("Enter your grocery item: ");
		groceryList.addGroceryListItem(scanner.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter item number to remove:");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
	}
	
	public static void searchItem() {
		System.out.println("Item to search for:");
		String searchItem = scanner.nextLine();

		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + " in your grocery list");
		} else {
			System.out.println(searchItem + " is not in the grocery list");
		}
	}
}
