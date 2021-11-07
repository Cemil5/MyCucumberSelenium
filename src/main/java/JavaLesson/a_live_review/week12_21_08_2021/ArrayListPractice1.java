package a_live_review.week12_21_08_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

	public static void main(String[] args) {
		
		
		int[] array = new int[5];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
	//	array[5] = 60;	// java.lang.ArrayIndexOutOfBoundsException

		System.out.println(Arrays.toString(array));

		
		System.out.println("-----------------------------------------------");
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(5); // <Integer>(5) optional
		arrayList.add(10);	// 0
		arrayList.add(20);	// 1
		arrayList.add(30);	// 2
		arrayList.add(40);	// 3
		arrayList.add(50);	// 4
		System.out.println(arrayList.equals(array));  	// false
		
		arrayList.add(60);	// 5
		arrayList.add(70);
		arrayList.add(80);
		arrayList.add(90);
		
		System.out.println(arrayList);
		System.out.println(arrayList.toString());	// don't have to call toString() method, automatic.
		System.out.println(arrayList.size());	// 9
	
		// remove the element
		System.out.println(arrayList.remove(3));	// 40
		System.out.println(arrayList.size());		// 8
		System.out.println(arrayList);				// [10, 20, 30, 50, 60, 70, 80, 90]
		
		System.out.println(arrayList.remove(Integer.valueOf(50)));	// true
		System.out.println(arrayList.size());		// 7
		System.out.println(arrayList);				// [10, 20, 30, 60, 70, 80, 90]
		
		// modify the element
		
		System.out.println(arrayList.set(1, 400));	// 20
		System.out.println(arrayList.size());		// 7
		System.out.println(arrayList);				// [10, 400, 30, 60, 70, 80, 90]
		
		// verify if arrayList has 60
		
		boolean r1 = arrayList.contains(60);
		System.out.println(r1); 				// true
		
		// index of
		System.out.println(arrayList.indexOf(60));	// 3
		System.out.println(arrayList.lastIndexOf(60));	// 3
		
		// retrieve an element
		System.out.println(arrayList.get(3));	// 60
		
		System.out.println("-----------------------------------------------");
		
		for (int i=0; i<arrayList.size(); i++) {
			arrayList.set(i, arrayList.get(i)*2);	
		}
		System.out.println(arrayList);		// [20, 800, 60, 120, 140, 160, 180]
		
		int sum = 0;
		for (int each : arrayList) {
			sum += each;
		}
		System.out.println(sum);	// 1480
		
		
		/*
		 * revers
		 * removeDuplicates
		 * unique
		 */

/*		ArrayList<Integer> arrayList1 = new ArrayList<>();
		System.out.println(arrayList1);
		
		arrayList1 = arrayList;
		System.out.println(arrayList1);	*/

	}

}
