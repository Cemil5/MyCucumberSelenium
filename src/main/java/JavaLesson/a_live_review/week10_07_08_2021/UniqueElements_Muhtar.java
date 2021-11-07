package a_live_review.week10_07_08_2021;

public class UniqueElements_Muhtar {

	public static void main(String[] args) {

		int[] arr = {1,1,2,3,3,4,5,5}; 
		
		// frequency of 1
		for (int element : arr) {
			
			int count =0;
			for (int each : arr) {
				if (each == element) {
					count++;
				}
			}
			
			if (count == 1) {
				System.out.print(element + " ");
			}
		}
		
		
	}

}
