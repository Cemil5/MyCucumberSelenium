package utilities;

public class ArraysUtility {

	// returns the maximum number from integer array
	public static int max(int [] arr) {
		int max = Integer.MIN_VALUE;
		
		for (int each : arr) {
			max = Math.max(each, max);
		}
		return max;
	}
	
	// returns the maximum number from double array
	public static double max(double [] arr) {
		double max = Double.MIN_VALUE;
		
		for (double each : arr) {
			if (each > max) {
				max = each;
			}
		}
		return max;
	}
	
	// returns the minimum number from integer array
	public static int min(int [] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int each : arr) {
			min = Math.min(each, min);
		}
		return min;
	}
	
	// returns the minimum number from double array
	public static double min(double [] arr) {
		double min = Double.MAX_VALUE;
		
		for (double each : arr) {
			min = Math.min(each, min);
		}
		return min;
	}

	// merge two integer arrays
	public static int[] merge(int[] arr1, int[] arr2 ) {
		int[] arr3 = new int[arr1.length+ arr2.length];
		
		int i = 0;
		for (int each : arr1) {
			arr3[i++] = each;
		}
		for (int each : arr2) {
			arr3[i++] = each;
		}
		
		return arr3;
	}
	
	// merge two double arrays
		public static double[] merge(double[] arr1, double[] arr2 ) {
			double[] arr3 = new double[arr1.length+ arr2.length];
			
			int i = 0;
			for (double each : arr1) {
				arr3[i++] = each;
			}
			for (double each : arr2) {
				arr3[i++] = each;
			}
			
			return arr3;
		}
	
	// merge two char arrays
	public static char[] merge(char[] arr1, char[] arr2 ) {
		char[] arr3 = new char[arr1.length+ arr2.length];
		
		int i = 0;
		for (char each : arr1) {
			arr3[i++] = each;
		}
		for (char each : arr2) {
			arr3[i++] = each;
		}
		
		return arr3;
	}
		
	// merge two String arrays
	public static String[] merge(String[] arr1, String[] arr2 ) {
		String[] arr3 = new String[arr1.length+ arr2.length];
		
		int i = 0;
		for (String each : arr1) {
			arr3[i++] = each;
		}
		for (String each : arr2) {
			arr3[i++] = each;
		}
		
		return arr3;
	}
		
		
	// reverse an int array
	public static int[] reverse(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		
		for (int i = arr1.length-1, j=0; i >=0; i--, j++) {
			arr2[j] = arr1[i];
		}
		return arr2;
	}
	
	// returns reverse a double array
	public static double[] reverse(double[] arr1) {
		double[] arr2 = new double[arr1.length];
		
		for (int i = arr1.length-1, j=0; i >=0; i--, j++) {
			arr2[j] = arr1[i];
		}
		return arr2;
	}
	
		// returns reverse an char array
	public static char[] reverse(char[] arr1) {
		char[] arr2 = new char[arr1.length];
		
		for (int i = arr1.length-1, j=0; i >=0; i--, j++) {
			arr2[j] = arr1[i];
		}
		return arr2;
	}
	
		// returns reverse an String array
	public static String[] reverse(String[] arr1) {
		String[] arr2 = new String[arr1.length];
		
		for (int i = arr1.length-1, j=0; i >=0; i--, j++) {
			arr2[j] = arr1[i];
		}
		return arr2;
	}
	
}
