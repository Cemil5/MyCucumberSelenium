package JavaLesson.a_live_review.week10_07_08_2021;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		
		String[] group1 = {"Keziban", "Selami", "Volkan", "Hasan", "Recep"};
		String[] group2 = {"Cemil", "Cem", "Saar"};
		String[] group3 = {"Ahmet","Ali"};
		String[] group4 = {"Kubra","Hatice", "Yakup"};
		
		
		String[][] students = {group1, group2,  {"Ahmet","Ali"}, {"Kubra","Hatice", "Yakup"}};
		
		System.out.println(Arrays.toString(students));
		System.out.println(students.length); // 4
		System.out.println(students[0].length); // 5
		System.out.println(students[0][4]);	//Recep
		System.out.println(students[0][4].length());

		students[0][4] = "Basgan";
		System.out.println(students[0][4]);	//Recep


		// retrieve the members of group3
		System.out.println(students[2]);
		System.out.println(Arrays.toString(students[2]));
		
		// printing multi-dimensional array
		System.out.println(Arrays.deepToString(students));
		
		// retrieve the name Yakup
		System.out.println(students[3][2]);
		
		System.out.println("-------- for loop ---------------");
		
		//					0  1  2     0  1    0  1  2  3
		int[][] arr2D = { {10,20,30}, {40,50}, {60,70,80,90} };
		//						0		1			2
		//System.out.println(arr2D[2][3]);
		
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < arr2D.length; i++) {
			// int [] each1D = arr2D[i];
			//System.out.println(Arrays.toString(each1D));
			System.out.println(Arrays.toString(arr2D[i]));
		}
		
		System.out.println("----- for Each --------------");

		for (int each1D[] : arr2D) {
			for (int element : each1D) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
