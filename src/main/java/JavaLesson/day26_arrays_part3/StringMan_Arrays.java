package day26_arrays_part3;

public class StringMan_Arrays {

	public static void main(String[] args) {

		String[] myCars = {"Honda", "Mercedes", "BMW", "Toyota", "Ford"};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[1] == myCars[1]);
		
		System.out.println("------------------");
		
		for (int i=0; i<myCars[0].length();i++) {
			System.out.println(myCars[0].charAt(i));
		}
		
		System.out.println("------------------");

		String str = "It will display the array of the size";
		
		String[] arr = str.split("the");
		
		for (String value : arr) {
			System.out.println(value);
		}
		
	}

}
