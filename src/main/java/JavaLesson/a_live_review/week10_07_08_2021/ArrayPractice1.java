package a_live_review.week10_07_08_2021;

public class ArrayPractice1 {

	public static void main(String[] args) {

		String[] students = new String[5]; // index: 0,1,2,3,4
	
		students[0] = "Selda";
		students[1] = "Volkan";
		students[2] = "Hasan";
		students[3] = "Fatma";
	//	students[4] = "Cemil";
	//	students[5] = "Niyazi"; java.lang.ArrayIndexOutOfBoundsException
		
		int [] num = {1, 2,3,4,5};
		
		for (int i=0; i<students.length;i++) { // i represents the indexes of the array
			System.out.print(num[i] + " ");
			System.out.println(students[i] + " ");
		}
		System.out.println("----------------");
		
		// find the max and min numbers . interview question  
		// sort method shouldn't be used during interview
		int [] num1 = {10, 20,3,400,5, -1, 0, -5};
		int max = num1 [0];
		int min = num1 [0];
		
		for (int i=1; i<num1.length; i++) {
			/*if (max < num1[i]) {
				max = num1[i];
			} else if (min > num1[i]) {
				min = num1[i];
			}
			*/
			max = Math.max(num[i], max); // math methods .max and .min
			min = Math.min(num[i], min);
		}
		System.out.println("min : " + min + " max  : " + max);
		
	}

}
