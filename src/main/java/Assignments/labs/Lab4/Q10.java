package labs.Lab4;

public class Q10 {

	public static void main(String[] args) {

		int[] x = {2,3,2};// = > true
		int[] y = {3,5,3}; //= > true
		int[] a = {2,3}; //= > false
		int[] b = {12,20,42}; //= > false
		int[] c = {2,2,2}; //= > false
		
		System.out.println(twice23(x));
		System.out.println(twice23(y));
		System.out.println(twice23(a));
		System.out.println(twice23(b));
		System.out.println(twice23(c));
	}

	public static boolean twice23(int[] arr) {
		
		int count2=0;
		int count3=0;
		
		for (int num : arr) {
			if (num == 2) {
				count2++;
			} else if (num == 3) {
				count3++;
			}
		}
			
		if (count2 ==2 || count3 ==2) {
			return true;
		} else {
			return false;
		}
	}
	
}
