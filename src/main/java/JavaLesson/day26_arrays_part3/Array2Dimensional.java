package day26_arrays_part3;

public class Array2Dimensional {

	public static void main(String[] args) {

		int[][] scores = new int[3][]; // row number (3) is mandatory
		
		System.out.println(scores); // [[I@182decdb
		System.out.println(scores[0]); // null

	//	System.out.println(scores[1][1]); // throws error
		
		int[][] num = new int[3][4];
		
		// first row
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[0][2]);
		System.out.println(num[0][3]);

		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[0][3] = 40;
		
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[0][2]);
		System.out.println(num[0][3]);
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++){
				num[i][j]=i+j;
			}
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++){
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
