package day47_collection_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		
		nums.add(50); 	nums.add(543);	nums.add(1150); nums.add(550); nums.add(570);
		nums.add(93);	nums.add(5000);	nums.add(950);
		
		// Create Iterator object
		// you put the pointer here
		Iterator<Integer> it = nums.iterator();	// special object creation using iterator() method of List Interface
		
		// Call hasNext method
		// hasNext return true, if there is still next value
		// returns false when it reaches the end or empty
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");				// 50 | 543 | 1150 | 550 | 570 | 93 | 5000 | 950 | | 
		}
		
		System.out.println(" ------------------------");
		
		Iterator<Integer> it2 = nums.iterator();			// we set the pointer again

		// What is the difference between for each loop and iterator?
		// we can remove objects while looping
		
		while(it2.hasNext()) {
			int val = it2.next();
			if (val> 1000) {
				it2.remove();
			}
		}
		System.out.println(nums.toString()); 	// [50, 543, 550, 570, 93, 950]
		
		
		
		List<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Boston");
		cities.add("Virginia");
		cities.add("DC");
		
		for(String city : cities) {
			if(city.equals("Boston")) {
				cities.remove(city);	// SİLEMEZ : java.util.ConcurrentModificationException
			}
		}
		
	}

}
