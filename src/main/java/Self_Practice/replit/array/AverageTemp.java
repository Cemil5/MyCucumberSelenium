package replit.array;

public class AverageTemp {

	public static void main(String[] args) {
		
		double[] temps = {80, 88, 88, 84, 82, 78, 60, 68};
		double sum =0;
		
		for (double each : temps) {
			sum += each; 
		}
		System.out.println(sum/temps.length);
	}

}
