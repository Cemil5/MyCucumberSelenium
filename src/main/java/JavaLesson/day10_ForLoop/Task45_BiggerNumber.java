package day10_ForLoop;

public class Task45_BiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 20, num2 = 10, count =5;
		
		for (int i = 1; i <= count; i++) {
			if (num1>num2) {
				System.out.println(num1 + " is bigger.");
			} else if (num1 == num2) {
				System.out.println(num1 + " and " + num2 + " are equal.");
			} else {
				System.out.println(num2 + " is bigger.");
			}
		}

	}

}
