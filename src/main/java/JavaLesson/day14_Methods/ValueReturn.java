package day14_Methods;

public class ValueReturn {

	public static void main(String[] args) {
		
	
		System.out.println(sum(2,3));
		
		int v1 = sum(3,4);
		
		System.out.println(v1*5);
		
	}

	public static int sum (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
		//System.out.println(v1);
	}
}
