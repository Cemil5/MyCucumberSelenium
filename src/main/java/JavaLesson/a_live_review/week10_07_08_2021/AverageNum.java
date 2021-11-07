package a_live_review.week10_07_08_2021;

public class AverageNum {

	public static void main(String[] args) {

		int[] num = {1,3,5,7,8};
		
		int sum =0;
		
		for (int each : num) {
			sum += each;
		}
		System.out.println((double)sum/num.length);
	
	
	}

}
