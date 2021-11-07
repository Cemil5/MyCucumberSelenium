package day47_collection_part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(100);
		mySet.add(200);
		mySet.add(300);
		mySet.add(800);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);
		
		System.out.println(mySet.toString());	// [800, 100, 200, 1000, 300]
		System.out.println(mySet.size());		// 5
		
		List<String> list = Arrays.asList("23","23","a","a","bb","jj","q","t","t","t","t","a","a");
		
		Set<String> unique = new LinkedHashSet<>(list);
		unique.add(null);
		
		System.out.println(list.toString());	// [23, 23, a, a, bb, jj, q, t, t, t, t, a, a]
		System.out.println(unique.toString());	// [bb, jj, 23, a, q, t]
		
//		TreeSet<Integer[]> tSet = new TreeSet<>();
//		Integer [] i1 = {10,5,3};
//		Integer [] i2 = {1,5,3};
//		Integer [] i3 = {100,5,3};
//		Integer [] i4 = {50,5,3};
//		
//		tSet.add(i1);
//		tSet.add(i2);	tSet.add(i3);	tSet.add(i4);
//	
//		
//		System.out.println(tSet.toString());
		
		System.out.println("-------------------------------");
		
		TreeSet<String> tSet2 = new TreeSet<>();
		tSet2.add("d");
		tSet2.add("a");
		tSet2.add("z");
		tSet2.add("k");
		tSet2.add("j");
	//	tSet2.add(null);	NullPointerException
		
		
		System.out.println(tSet2.toString()); // [a, d, j, k, z]
	}

}
