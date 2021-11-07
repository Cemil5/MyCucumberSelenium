package labs.Lab4;

public class Q27 {

	public static void main(String[] args) {

		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		
		
		System.out.println(incAdjacent(x));
		System.out.println(incAdjacent(y));
		System.out.println(incAdjacent(z));
	}
	
	public static boolean incAdjacent(int[] arr) {
		
		for (int i = 0; i < arr.length -2; i++) {
			if (arr[i+1] == arr[i]+1 && arr[i+2] == arr[i+1] +1) {
				return true;
			}
		}
		
		return false;
	}
	
}
