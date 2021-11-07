package day15_MethodOverloading_Review;

public class Task69_PrimeNumber {
	/*
	 * A prime number is a number that is evenly divisible only by itself and 1. For example, the number 5 is prime number because it can be evenly divided only by 1 and 5. The number 6, however, is not prime number because it can be divided evenly by 1,2,3,and 6.
Write a method named isPrime which takes an integer as an argument and returns true if the argument is a prime number, or false otherwise.
• Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all
the other even numbers can be divided by 2.
	 */

	public static void main(String[] args) {

		int n = 100;
		for (int i=0; i<n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static boolean isPrime(int num) {
		boolean b = true;
		if (num>1) {
			for (int i=2; i<num; i++) {
				if (num % i ==0) {
					b = false;
					break;
				}
			}
		} else {
			b =false;
		}
		return b;
	}

}
