package day31_ArrayList;

import java.util.*;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		// Creating an ArrayList
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		// Assigning values to ArrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		// Reading from ArrayList
		
		System.out.println(names.get(0));	//Mike
		System.out.println(names.get(1));	//Smith
		System.out.println(names.get(2));

		System.out.println("Names count : "+ names.size());	//6
		System.out.println("Nums count : "+ nums.size());	//4
		
		System.out.println(names.toString());	// [Mike, Smith, John, Emmy, Evan, Mary]
		
		
		
	}

}
