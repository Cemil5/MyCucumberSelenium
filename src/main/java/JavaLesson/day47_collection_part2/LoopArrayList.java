package day47_collection_part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopArrayList {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		
		nums.add(50); 	nums.add(543);	nums.add(1150); nums.add(550); nums.add(570);
		nums.add(93);	nums.add(5000);	nums.add(950);
		
		List<Integer> nums1 = Arrays.asList(50,60,80,30,100,130,250,20,80);
		
		// looping using for iterator loop
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " | ");	// 50 | 543 | 1150 | 550 | 570 | 93 | 5000 | 950 | 
		}
		
		System.out.println();

		// looping using for each loop
		for (Integer each : nums) {
			System.out.print(each + " | ");			// 50 | 543 | 1150 | 550 | 570 | 93 | 5000 | 950 | 
		}

		
		System.out.println();

		// looping using forEach method. Lambda expression
		nums.forEach(n -> System.out.print(n + " | "));			// 50 | 543 | 1150 | 550 | 570 | 93 | 5000 | 950 | 
		
		System.out.println();
		nums.removeIf(n -> n<500);		// n<500 yerine () ile method bile yazılabilir
		
		nums.forEach(n -> System.out.print(n + " | "));			// 543 | 1150 | 550 | 570 | 5000 | 950 | 

	}

}
