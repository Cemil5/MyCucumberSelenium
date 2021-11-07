package day25_ArrayCont;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {
		
		System.out.println(findCar(2, "Honda"));
	}
	
	public static String[] createArray(int carSize) {
		Scanner sc = new Scanner (System.in);
		String[] carArray = new String[carSize];
		
		for (int i=0; i<carArray.length; i++) {
			System.out.println("enter car #" + (i+1));
			carArray[i]=sc.next();
			}
		return carArray;
	}
	
	public static boolean findCar(int value, String carName) {
		
		for(String car : createArray(value)) {
			if (car.equalsIgnoreCase(carName)) {
				return true;
			}
		}		
		return false;
	}
}
