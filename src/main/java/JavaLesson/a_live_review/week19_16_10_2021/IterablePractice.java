package a_live_review.week19_16_10_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IterablePractice {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,1,1,1,1));
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)<5) {
				list.remove(i);
			//	i--;
			}
		}
		System.out.println(list); // [1, 2, 2, 3, 3, 4, 5, 5, 5, 5, 6, 6, 6, 1, 1]
		
		System.out.println("------------------ Iterable -----------------------------------");
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,1,1,1,1));
		
		Iterator<Integer> it = list2.iterator();
		
		while (it.hasNext()){
			if (it.next()<5) {
				it.remove();
			}
		}
		System.out.println(list2);	// [5, 5, 5, 5, 6, 6, 6]
		
		System.out.println("------------------ Lambda Expression -----------------------------------");

		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,1,1,1,1));
		
		list3.removeIf(p -> p<5);
		
		System.out.println(list3);	// [5, 5, 5, 5, 6, 6, 6]
		
		System.out.println("------------------ forEach / Lambda Expression -----------------------------------");

		Consumer<String> printConsumer= new Consumer<String>() {
		    public void accept(String name) {
		        System.out.println(name);
		    }
		};
		
		list3.forEach(li -> System.out.println(li));
		
		System.out.println("------------------ forEach / Lambda Expression COLLECTION -----------------------------------");

		List<String> names = Arrays.asList("Larry", "Steve", "James");	
		names.forEach(name -> System.out.println(name));	// Larry	Steve	James
		names.forEach(System.out::println);					// Larry	Steve	James
		
		
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");
		
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		
	}

}
