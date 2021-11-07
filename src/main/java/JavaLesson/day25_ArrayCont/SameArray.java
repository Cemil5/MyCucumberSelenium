package day25_ArrayCont;

public class SameArray {

	public static void main(String[] args) {

		int[] array1 = {2,4,6,8};
		int[] array2 = array1;
		
		array1[0] = 200;
		
		array2[3] = 400;
		
		System.out.println("array1");
		for(int value : array1) {
			System.out.print(value + " ");
		}
		System.out.println("\narray2");
		for(int value : array2) {
			System.out.print(value +  " ");
		}
		
		String s1 = "str";
		String s2 = s1;
		s2 = "2";
		System.out.println("\n"+ s1 + " " +s2);

		showArray1(array2);
	}

	public static void showArray1(int array[]) {
		for (int i : array) {
			System.out.println(i);
		}
	}
	
}
