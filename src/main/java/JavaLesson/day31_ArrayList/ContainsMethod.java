package day31_ArrayList;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();	
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1);	// [Jan, Feb, Mar, Apr, May]
		
		ArrayList<String> list2 = list1; 
		System.out.println(list2); // [Jan, Feb, Mar, Apr, May]
		
		// copy all values from list1
		ArrayList<String> months = new ArrayList<>(list1);
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		months.add("Sep");	
		System.out.println(months); //[Jan, Feb, Mar, Apr, May, Jun, July, Aug, Sep]
		
		System.out.println(months.contains("Jan")); // true
		System.out.println(months.contains("Dec"));	// false

		// how to check if Feb is in second position
		System.out.println(months.indexOf("Feb") == 1);		// true
		System.out.println(months.get(1).equals("Feb"));	// true

		if (months.containsAll(list1)) {
			System.out.println("Months has all list1"); // Months has all list1
		} else {
			System.out.println("Some values are missing");
		}
		
	}

}
