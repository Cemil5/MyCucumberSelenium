package replit.arrayList;

import java.util.ArrayList;

public class combineAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(60);
		list1.add(70);
		list1.add(80);
		list1.add(90);
		list1.add(100);

		System.out.println(combineAL(list1, list2));
		
	}
	
	public static ArrayList<Integer> combineAL(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo){
		
		ArrayList<Integer> result = new ArrayList<>();
		
	/*	for (int i=0; i<numbersOne.size();i++) {
			result.add(numbersOne.get(i));
		}
		
		for (int i=0; i<numbersTwo.size();i++) {
			result.add(numbersTwo.get(i));
		}
		
		result.clear(); */
		
		result = numbersOne;
		result.addAll(numbersTwo);
		
		return result;
	}
	

}
