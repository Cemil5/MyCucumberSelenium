package labs.Lab4;

public class Q26 {

	public static void main(String[] args) {
		
		int x[] = {2,1,3,5}; //true
		int y[] = {2,1,2,5}; //false
		int z[] = {2,4,2,5}; //true
		
		System.out.println(count3(x));
		System.out.println(count3(y));
		System.out.println(count3(z));
	}

	public static boolean count3 (int[] arr) {
		
		int counterOdd=0;
		int counterEven=0;
		
		for (int num : arr) {
			if (num % 2 == 0) {
				counterEven++;
			} else {
				counterOdd++;
			}
		}
		if (counterEven == 3 || counterOdd == 3){
			return true;
		}
		
		return false;
	}
	
}
