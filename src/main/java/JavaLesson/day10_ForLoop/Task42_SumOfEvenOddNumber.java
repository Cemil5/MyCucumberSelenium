package day10_ForLoop;

public class Task42_SumOfEvenOddNumber {

	public static void main(String[] args) {
		// Write a program that displays sum of even and odd numbers between 1 and 100 excluding 100
		
		int sumEven =0, sumOdd =0;
		
//		for (int i=1 ; i<100; i += 2) {
//			sumOdd += i;
//			sumEven += i-1;
//		}
		
		for (int i=1; i<100; i++) {
			if (i%2 ==0) {
				sumEven +=i;
			} else {
				sumOdd +=i;
			}
		}
		
		
		System.out.println("sum of Odd numbers " + sumOdd);
		System.out.println("sum of Even numbers " + sumEven);

	}

}
