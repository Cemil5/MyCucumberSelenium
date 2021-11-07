package day11_ForWhileLoop;

public class Task53_WhileSumOfEvenNumbers {

	public static void main(String[] args) {
		
		int i = 0, sum=0;
		
		while (i<=100) {
			if (i%2 == 0) {
				sum +=i;
			}
			i +=1;
		}
		System.out.println("sum of even numbers "+sum);

	}

}
