package labs.Lab4;

public class Q2 {
/*
 Write a method that accepts an array and check the length of the array first. If the length is more than one, check if the first element and last element are equal. if it is print true, if not print false. If the length is not more than 1, print not valid an array
 */
	public static void main(String[] args) {

		int[] x = {1,2,3}; //= > false
		int[] y = {1,2,3,1}; //= > true
		int[] z = {1,2,1}; //= > true
		int[] k = {1}; //= > not a valid array
		
		array(x);
		array(y);
		array(z);
		array(k);
	}
	
	public static void array(int[] arr) {
		
		if (arr.length>1) {
			if (arr[0] == arr[arr.length-1]) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println("not a valid array");
		}
		
	}

}
