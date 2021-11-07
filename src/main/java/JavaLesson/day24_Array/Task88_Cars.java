package day24_Array;

import java.util.*;

public class Task88_Cars {

	public static void main(String[] args) {

		String[] cars = new String[7];
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";
		
		int price =0;
		
		Random rn = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an index number to choose your dream car:");
		int index = sc.nextInt();
		switch (index) {
			case 0: case 1: case 2:
				price = rn.nextInt(20_001)+20_000;
				break;
			case 3:
				price = rn.nextInt(30_001)+50_000;
				break;
			case 4:
				price = rn.nextInt(50_001)+100_000;
				break;
			default:
				System.out.println("invalid index");	
		}
		
		
		System.out.println("your dream car : " + cars[index] + " and price : " + price);
		
		
	}

}
