package labs.Lab4;

public class Q21 {

	public static void main(String[] args) {

		int[] x = {2, 3, 2, 2, 4, 2}; // = > true
		int[] a = {2, 3, 2, 2, 4, 2, 2}; // = > false
		int[] b = {1, 2, 3, 4}; // = > false
		
		System.out.println(is8(x));
		System.out.println(is8(a));
		System.out.println(is8(b));
		
	}
	
	public static boolean is8 (int [] arr) {
		int sum = 0;
		
		for (int num : arr) {
			if (num == 2) {
				sum += num;
			}
		}
		if (sum == 8) {
			return true;
		}
		
		return false;
	}
}
