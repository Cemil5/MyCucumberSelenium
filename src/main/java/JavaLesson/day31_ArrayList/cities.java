package day31_ArrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");

		
		System.out.println(cities.toString());
		
		for (String each : cities) {				// print with for each 
			System.out.print(each + ", ");
		}
		
		System.out.println();
		for (int i=0; i<cities.size(); i++) {		// print with for iterator 
			System.out.print(cities.get(i) + " ");
		}
		System.out.println("----------------------");
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");
		
		System.out.println(cities.toString());
		
		cities.add(0, "Arlington");
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		cities.add(2, "Ankara");
		System.out.println(cities.toString());
		
		System.out.println("----------------------");
		
		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);					// 1
		
		System.out.println(cities.indexOf("Bursa"));	// -1
		
		
		cities.clear();
		System.out.println(cities.isEmpty());
	}

}
