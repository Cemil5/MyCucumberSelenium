package JavaLesson.a_live_review.week10_07_08_2021;

import java.util.Arrays;

public class Multi3DArrays {

	public static void main(String[] args) {
		
		
		int [][] arr2D = { {1,2}, {3,4,5} };
		
				//			   0  2   0  1 2   
			  //			 0                   2	
		int [][][] arr3D = { { {1,2}, {3,4,5} }, { {6,7}, {8,9,10} } };
			//					  0			    		1
		System.out.println(arr3D.length); // 2
		System.out.println(arr3D[0].length); //2
		
		System.out.println(Arrays.deepToString(arr3D));
		
		// retrieve 2 dimensional array { {6,7}, {8,9,10} } from arr3D
		System.out.println(Arrays.deepToString(arr3D[1]));
		
		// retrieve 1 dimensional array {3,4,5}  from arr3D
				System.out.println(Arrays.toString(arr3D[0][1]) );
		
		// retrieve data 8 from arr3D 
		System.out.println(arr3D[1][1][0]);
		
		
		// printing by for each loop
		
		for (int[][] each2D : arr3D) {
			System.out.println(Arrays.deepToString(each2D));
		}
		
		for (int[][] each2D : arr3D) {  // iterates the two dimensional arrays in arr3D
			for (int[] each1D : each2D) { // iterates each single dimensional array from each two dimensional array
				for (int element : each1D) { // iterates each elements from each single dimensional array
					System.out.print(element + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		System.out.println("--------------4d array---------");
		
		int [][][][] arr4D = { { { {1,2}, {3,4,5} }, { {6,7}, {8,9,10} } }, 
				{ { {1,2}, {3,4,5} }, { {6,7}, {8,9,10} } }	};
		
		int [][][][] arr4D1 = { { { {1,2}  } }	};
		System.out.println(Arrays.deepToString(arr4D1));
		
		
		for (int[][][] each3D : arr4D) {
			for (int[][] each2D : arr3D) {  // iterates the two dimensional arrays in arr3D
				for (int[] each1D : each2D) { // iterates each single dimensional array from each two dimensional array
					for (int element : each1D) { // iterates each elements from each single dimensional array
						System.out.print(element + " ");
					}
					System.out.println("next 1D array");
				}
				System.out.println();
			}
		}
		
	}

}
