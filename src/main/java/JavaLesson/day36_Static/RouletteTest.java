package day36_Static;

import java.util.Scanner;

public class RouletteTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		RoulettePocket r = new RoulettePocket(0);
		
		System.out.println(r.getPocketColor(num));
		
		
		
	}

}
