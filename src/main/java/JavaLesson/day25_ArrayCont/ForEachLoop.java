package day25_ArrayCont;

public class ForEachLoop {

	public static void main(String[] args) {

		String [] products = {"Timberland", "Shirt", "Watch", "Bag", "Shoes"};
		double[]  prices = {120.0, 12.99, 300,25, 67.89};
		
		
		// normal for loop practice
		for (int i=0; i<products.length; i++) {
			System.out.print(products[i] + " : ");
			System.out.println(prices[i]);

		} 
		
		// print products in reverse order
		for (int i=products.length-1; i>=0; i--) {
			System.out.print(products[i] + " : ");
			System.out.println(prices[i]);

		}
	
		
		System.out.println("----- for each loop practice ----");
		
		for (String prod : products) {
			System.out.print(prod+ ": ");
		}
		for (double price : prices) {
			System.out.println(price);
		} 
	}

}
