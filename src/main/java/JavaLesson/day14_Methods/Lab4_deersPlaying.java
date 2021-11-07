package day14_Methods;
/*
 * The deers in VA spend most of the day playing. In particular, they play if the temperature is between 60 and 90. Unless it is summer, then the upper limit is 100 instead of 90.
Write a method that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.

deerPlay(70, false); - > true
deerPlay(95, false); - > false
deerPlay(95, true); - > true
 */

public class Lab4_deersPlaying {

	public static void main(String[] args) {

		int temp = 95;
		String season = "Summer";
		boolean s = false;
	
		if (season == "Summer") {
			s = true;
		}
		deersPlaying(temp, s);
	}

	public static void deersPlaying(int temp, boolean isSummer) {
		if (isSummer) {
			if (temp>=60 && temp <=100) {
				System.out.println("true");
			} else {
				System.out.println("false");
			} 
			} else if (temp>=60 && temp <=90) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
}
