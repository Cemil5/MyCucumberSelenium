package labs.Lab4;

public class Q25 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {2,3,10};
		 // Output: 2
		int[] a = {1,2,3};
		int[] b = {2,3,5};
		//Output:3
		System.out.println(differ2(x,y));
		System.out.println(differ2(a,b));
	}
	
	public static int differ2 (int[] arr1, int[] arr2) {
		int counter =0;
		
		if (arr1.length != arr2.length) {
			return counter;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]){
				if (arr2[i]-arr1[i] <= 2)  {
					counter++;
				//	System.out.println(arr1[i] + " " + arr2[i]);
				}	
			}
		}
		
		
		return counter;
	}
	
}
