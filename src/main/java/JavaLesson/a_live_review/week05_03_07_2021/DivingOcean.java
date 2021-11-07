package a_live_review.week05_03_07_2021;

/*
 * You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level

Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%
 */

public class DivingOcean {
	public static void main(String[] args) {
		
		int oxygenLevel = -35;
		String message = "";
		
		if (oxygenLevel > 90 && oxygenLevel <=100 && oxygenLevel>=0) {
			message = "Your tank is full";
		} else if (oxygenLevel > 80) {
			message = "Still okay";
		} else if (oxygenLevel > 70) {
			message = "Don't go too far";
		} else if (oxygenLevel > 60) {
			message = "Start to head back";
		} else if (oxygenLevel > 50) {
			message = "Be careful now you at at 50%";
		} else if (oxygenLevel <50) {
			message = "Less than 50%";
		} else {
			System.out.println("It is not a valid input");
		}
		System.out.println(message);
	}

}
