package day14_Methods;

public class Task66_Distance {

	public static void main(String[] args) {
		
		int v1=0;
		double total = distance(100, 5);
		System.out.println("total "+total);
		
		if (distance(100, 5)>400) {
			System.out.println("you spent too much gas");
		} else {
			System.out.println("you spent ok gas");
		}
	}
	
	public static double distance (int speed, int time) {
		int result = speed*time;
		//System.out.println(v1);
		return result;
	}
}
