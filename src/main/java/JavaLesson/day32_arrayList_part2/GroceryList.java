package day32_arrayList_part2;

import java.util.ArrayList;

public class GroceryList {
	
	ArrayList<String> list = new ArrayList<>();
	
	public void printInstructions() {
		System.out.println("\nPress\r\n"
				+ "	 0 - To print choice options.\r\n"
				+ "	 1 - To print the list of grocery items.\r\n"
				+ "	 2 - To add an item to the list.\r\n"
				+ "	 3 - To modify an item in the list.\r\n"
				+ "	 4 - To remove an item from the list.\r\n"
				+ "	 5 - To search an item from the list.\r\n"
				+ "	 6 - To quit the application.");
	}
	
	public void printGroceryList() {
		System.out.println("You have " + list.size() + " items in your grocery list");
		for (int i = 0; i< list.size();i++) {
			System.out.println(i+1 + ". " + list.get(i));
		}
	}
	
	public void addGroceryListItem(String item) {
		list.add(item);
	}
	
	public void modifyGroceryItem(int itemNo, String newItem) {
		list.set(itemNo, newItem);
		System.out.println("Grocery item " + (itemNo+1) + " has been modified");
	}
	
	public void removeGroceryItem(int itemNo) {
		list.remove(itemNo);
		System.out.println("Grocery item " + (itemNo+1) + " has been removed");
	}
	
	public String findItem(String searchItem) {
		int position = list.indexOf(searchItem);
		if (position>=0) {
			return list.get(position);
		} else {
			return null;
		}
	}
	
}
