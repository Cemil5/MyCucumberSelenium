package day48_collection_part3;

import java.util.HashSet;
import java.util.Set;

import day46_collection.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		// create set collection and add new products
		
	//	Product product = new Product("book", 5.6);
		Set <Product> products = new HashSet<>();
		
		products.add(new Product("book", 5.5));
		products.add(new Product("banana", 5.9));
		products.add(new Product("notebook", 15.5));
		products.add(new Product("magazine", 51.5));

		System.out.println(products.toString());
		// print each product by using for each loop
		for (Product each : products) {
			System.out.println(each);
		}
		for (Product each : products) {
			System.out.println(each.getPrice());
		}
		
		// print each product by using forEach method
		products.forEach(p -> System.out.println(p + " | "));
		
	}
}
