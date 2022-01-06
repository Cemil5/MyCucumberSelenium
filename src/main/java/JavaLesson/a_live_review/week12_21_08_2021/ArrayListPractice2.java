package JavaLesson.a_live_review.week12_21_08_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
	//	list.addAll("Java", "Python", "C", "C++");
		list.addAll(  Arrays.asList("Java", "Python", "C", "C++", "Java", "Java", "Java")  );
		System.out.println(list);
		
		list.remove("Java");	// removes first Java
		list.removeAll(Arrays.asList("Java"));
		System.out.println(list);	// [Python, C, C++]
		
		list.removeAll(Arrays.asList("C", "C++"));
		System.out.println(list);	// [Python]
		
		
		// reverse
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(10,30,40,70,20,15,25));
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = list1.size()-1; i>=0; i--) {
			list2.add(list1.get(i));
		}
		System.out.println("reversed via for loop" + list2);

		Collections.reverse(list2);
		System.out.println("reversed via method" + list2);


		System.out.println("------------------------------------");

			// removeDuplicates

		String[] arr = {"Mehmet", "Caglar", "Caglar", "Caglar", "Ebubekir", "Huseyin", 
				"Mehmet", "Mehmet", "Mehmet", "Mehmet", "Mehmet", "Mehmet"};
		
		ArrayList <String> names = new ArrayList<>();
		names.addAll( Arrays.asList(arr));
		System.out.println(names);
		
		ArrayList <String> list3 = new ArrayList<>();
		for (String str : names) {
			if (!list3.contains(str)) {
				list3.add(str);
			}
		}
		System.out.println(list3);

		// find only unique names
		
		ArrayList <String> uniq = new ArrayList<>();

		for (String str : names) {
			int count =0;
			for (String s : names) {
				if (s.equals(str)) {
					count++;
				}
			}
			if (count ==1) {
				uniq.add(str);
			}
		}
		System.out.println(uniq);
		
		
		System.out.println("****************************************************************************");

	
	ArrayList<Character> c1 = new ArrayList<>();
	c1.addAll( Arrays.asList('A', 'A', 'B', 'C', 'C', 'D', 'E', 'E', 'E', 'F') );
	
	
	ArrayList<Character> c2 = new ArrayList<>();
	c2 = c1;
	Collections.reverse(c2);
	String s1 = "";
	for (Character character : c2) {
		s1 = s1 + character;
	}
	
	System.out.println(s1);
	
	
	System.out.println("-------------------------------------------------------");
	
	ArrayList <Character> unique1 = new ArrayList<>();
	
	for (Character each : c1) {
		if (c1.indexOf(each) == c1.lastIndexOf(each)) {
			unique1.add(each);
		}
	}
	System.out.println(unique1);
	
	ArrayList<Character> unique2 = new ArrayList<Character>();
	
	for (char each : c1) {
		if (Collections.frequency(c1, each) == 1) {
			unique2.add(each);
		}
	}
	System.out.println(unique2);

	
	System.out.println("-----------------------------------------");
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10, 1,1,1,1,1));
	
	// swap
	Collections.swap(numbers, 3, 8);	// swaps the values of indexNo's
	System.out.println(numbers);		// [1, 2, 3, 9, 5, 6, 7, 8, 4, 10, 1, 1, 1, 1, 1]
	
	// replaceAll
	Collections.replaceAll(numbers, 1, 100);	// finds all '1' and converts to '100' 
	System.out.println(numbers);		// [100, 2, 3, 9, 5, 6, 7, 8, 4, 10, 100, 100, 100, 100, 100]
	
	// reverse
	Collections.reverse(numbers);
	System.out.println(numbers);		// [100, 100, 100, 100, 100, 10, 4, 8, 7, 6, 5, 9, 3, 2, 100]
	
	// max, min
	System.out.println( Collections.max(numbers));	// 100
	System.out.println( Collections.frequency(numbers, 100));	// 6
	System.out.println( Collections.frequency(numbers, Collections.max(numbers)));	// 6
	
	
	}
	
}
/*
 * reverse
 * removeDuplicates
 * unique
 */