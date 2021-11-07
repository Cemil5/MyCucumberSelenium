package day30_args_wrapperClass;

public class MathClass {

	public static void main(String[] args) {

		double result = Math.pow(4, 2); // 4 �zeri 2
		
		double res2 = Math.sqrt(25); // 5'in karek�k�
		
		final double PI = Math.PI;  // 3,141592
		
		System.out.println(Math.round(4.5)); // 5	en yak�na yuvarla
		System.out.println(Math.round(4.6)); // 5	
		System.out.println(Math.floor(4.6)); // 4.0	altakine yuvarla
		
		System.out.println(Math.ceil(4.2));  // 5.0  �sttekine yuvarla
		
		System.out.println(Math.min(1,5));  // 1	min de�eri bulur
		System.out.println(Math.max(1,5));  // 5	max de�eri bulur
		
	}

}
