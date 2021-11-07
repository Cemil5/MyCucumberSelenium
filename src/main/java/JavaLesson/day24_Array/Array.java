package day24_Array;

public class Array {

	public static void main(String[] args) {

		int[] myList = {10, 20,30,40,50,100};
		String[] myArray = {"apple","orange","melon"};
		
		myList[1] = 1000;
		
	//	System.out.println(myList[1]);
		
		for (int i=0; i<myList.length;i++) {
			System.out.println(myList[i]);
		}
		
		int sum =0;
		for (int i=0; i<myList.length; i++) {
			sum += myList[i];
		}
		System.out.println("average is : " + sum/myList.length);
	}

}
