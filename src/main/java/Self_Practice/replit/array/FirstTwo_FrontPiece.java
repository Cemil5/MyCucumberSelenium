package replit.array;

import java.util.Arrays;

public class FirstTwo_FrontPiece {

	public static void main(String[] args) {
		
	//	int[] num = {4, 5, 4, 3, 8};
	//	int[] num = {4, 5};
		int[] num = {4};
		int[] res = new int[2];
		
		if (num.length>2) {
			for (int i =0; i<2; i++) {
				res[i] = num[i];
			}
			System.out.println(Arrays.toString(res));
		} else {
			System.out.println(Arrays.toString(num));
		}
		
	}
	
	
	
}
