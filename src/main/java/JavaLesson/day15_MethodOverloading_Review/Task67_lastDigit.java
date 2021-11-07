package day15_MethodOverloading_Review;

public class Task67_lastDigit {

	public static void main(String[] args) {
		
		
		if (lastDigit(7,17)){
			System.out.println("Same last digit");
		} else {
			System.out.println("different last digit");
		}
		
	}
	public static boolean lastDigit(int num1, int num2) {
		
		return (num1 %10 == num2 % 10);
	}
	public static boolean lastDigit1(int n1, int n2) {
		if (n1%10 == n2%10) {
			return true;
		} else {
			return false;
		}
		 
	}
}
