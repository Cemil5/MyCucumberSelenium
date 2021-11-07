package day46_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Array_ArrayList {

	public static void main(String[] args) {

		int[] numsArray = {30,40,50,5,6};
		String[] days = new String[7];
		days[0]="Monday";
		
		Object[] obj = {2, "apple", false};
		
		ArrayList<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Collection<Integer> list3 = new ArrayList<>();
		
		list1.add(44);
		list1.add(50);
		list1.add(100);
		
		System.out.println(numsArray[0]);
		System.out.println(list1.get(0));
		
		
	}

}
