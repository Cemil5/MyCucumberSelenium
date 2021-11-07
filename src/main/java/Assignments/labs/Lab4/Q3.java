package labs.Lab4;

public class Q3 {

	public static void main(String[] args) {

		int[] x = {1,2,3}; // = >true
		int[] y = {7,3};
		
		int[] x1 = {1,2,3};//= >false
		int[] y1 = {7,3,2};
		
		int[] x3 = {1}; //= > Array1 is not valid
		int[] y3= {7,3};
		
		int[] x4 = {1,2,3}; //= > Array2 is not valid
		int[] y4= {1};
		
		array2 (x, y);
		array2 (x1, y1);
		array2 (x3, y3);
		array2 (x4, y4);

	}
	
	public static void array2 (int[] a1, int[] a2) {
		
		if (a1.length>1 && a2.length>1) {
			if (a1[0] ==a2[0] || a1[a1.length-1] == a2[a2.length-1]) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if (a1.length>1) {
				System.out.println("Array1 is not valid");
			} else {
				System.out.println("Array2 is not valid");
			}
		}
		
		
		
	}
}
