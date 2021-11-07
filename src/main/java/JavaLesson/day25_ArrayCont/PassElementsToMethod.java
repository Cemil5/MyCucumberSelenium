package day25_ArrayCont;

public class PassElementsToMethod {

	public static void main(String[] args) {

		int[] numbers = {5,10,15,20,25,30};
		
		for (int value : numbers) {
			showValue(value);
		}
		printNumbers(numbers);
	}

	public static void showValue(int n) {
		System.out.print(n + " ");
	}
	
	public static void printNumbers(int[] a) {
		System.out.println();
		for (int v : a) {
			System.out.print(v + " ");
		}
	}
}
