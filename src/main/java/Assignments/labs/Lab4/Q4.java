package labs.Lab4;

public class Q4 {

	public static void main(String[] args) {

		int[] x = {1,2,3}; //= > 6
		sum(x);
		
	}
	
	public static void sum(int[] num) {
		int result =0;
		
		for (int i : num) {
			result += i;
		}
		System.out.println(result);
	}
	
}
