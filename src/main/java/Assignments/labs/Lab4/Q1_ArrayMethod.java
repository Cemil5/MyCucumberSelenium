package labs.Lab4;

public class Q1_ArrayMethod {

	public static void main(String[] args) {
		
		int[] x = {1,2,6}; //= > true
		int[] y = {6,1,2,3}; //= > true
		int[] z = {13,6,1,2,3}; //= > false
		
		System.out.println(array(x));
		System.out.println(array(y));
		System.out.println(array(z));

	}

	public static boolean array(int[] num) {
		boolean result = false;
		
		if (num[0] == 6 || num[num.length-1] == 0) {
			result = true;
		}
		
		
		return result;
	}
	
}
