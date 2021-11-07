package day25_ArrayCont;

import java.util.Random;

public class Task91_RandomValues {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		Random rn = new Random();
		
		for (int i=0;i<10;i++) {
			numbers[i] = rn.nextInt(100);
			System.out.println(i+1 + ": " + numbers[i]);
		}
		
	}

}
