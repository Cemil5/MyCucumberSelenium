package day27_Array_Cont;

public class Task95 {

	public static void main(String[] args) {

		int[][] scores = { {68,75,54,80}, {100,64,20,50}, {10,35,40,90} };
		
		int sum =0;
		
		for (int i=0; i< scores[0].length;i++) {
			sum += scores[0][i];
		}
		
		System.out.println((double)sum/(scores[0].length));
		
		sum =0;
		for (int i=0; i< scores.length;i++) {
			sum += scores[i][0];
		}
		System.out.println((double)sum/scores.length);
	}

}
