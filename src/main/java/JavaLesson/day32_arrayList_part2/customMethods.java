package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		
		System.out.println();
		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList);
		
		
		ArrayList<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		System.out.println(strNums);
		
		ArrayList <Integer> converted = convertedToIntList(strNums);
		System.out.println(converted);
		
	}

	public static ArrayList<Integer> convertedToIntList(ArrayList<String> strNums) {
		ArrayList <Integer> convert = new ArrayList<>();
		
		for(String str : strNums) {
			convert.add(Integer.parseInt(str)+10);
		}
		return convert;
	}

	public static ArrayList<Integer> getRandomList(int num) {
		ArrayList <Integer> randomList= new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < num; i++) {
			randomList.add(r.nextInt(101));
		}
		return randomList;
	}

	public static ArrayList<Integer> getList(int num) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i=1; i<=num; i++) {
			newList.add(i);
		}
		
		return newList;
	}

	public static double sumList(ArrayList<Double> doubleList) {
		double sum = 0;
		for (Double each : doubleList) {
			sum += each;
		}
		
		return sum;
	}

	public static void printList(ArrayList<Integer> numsList) {

		for (Integer each : numsList) {
			System.out.print(each + " ");
		}
	}

}
