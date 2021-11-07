package day06_logicalOperators;

public class Task4 {
	public static void main(String[] args) {
		
		double d1 = 20;
		double d2 = 80;
		double res;
		
		res = (d1 + d2)*25;
		res = res % 40;
		
		System.out.println("Remaining total is equal to 20 or less? " + (res <= 20));
		
		
		
	}

}
