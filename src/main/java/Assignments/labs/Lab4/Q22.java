package labs.Lab4;

public class Q22 {

	public static void main(String[] args) {
		int[] x = {1,4,1}; // = > true
		int[] y = {1,4,1,4}; // = > false
		int[] z = {1,1}; // = > true
		
		System.out.println(checkNum(x));
		System.out.println(checkNum(y));
		System.out.println(checkNum(z));
		
	}

	public static boolean checkNum (int[] arr) {
		
		int con1 = 0;
		int con4 = 0;
		
		for (int num : arr) {
			if (num == 1) {
				con1 ++;
			} else if (num == 4) {
				con4 ++;
			}
		}
		
		if (con1 > con4) {
			return true;
		}
				
		return false;
	}
	
}
