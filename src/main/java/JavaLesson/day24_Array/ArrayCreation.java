package day24_Array;

public class ArrayCreation {

	public static void main(String[] args) {

		// option-1
		int[] numbers;			// declaration
		numbers = new int[30];	// instantiation
		
		// option-2
		
		int[] numbers2 = new int[4];
		float[] numbers3 = new float[100];
		char[] letters = new char[50];
		String words[] = new String[5];
		
				
		System.out.println(numbers[2]); // default value for int
		System.err.println(numbers3[82]); // 0.0
		System.out.println(words[4]);  // null
	//	System.out.println(words[5]); // java.lang.ArrayIndexOutOfBoundsException

		
		int [] scores = new int[5];
		scores[0] = 80;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 100;
		scores[4] = 50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		int avgScore2 = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4])/5;
		System.out.println("average : " + avgScore2);
		
	}
}
