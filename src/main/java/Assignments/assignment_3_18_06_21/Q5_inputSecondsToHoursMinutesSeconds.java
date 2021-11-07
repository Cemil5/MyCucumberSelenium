package assignment_3_18_06_21;

public class Q5_inputSecondsToHoursMinutesSeconds {
	public static void main(String[] args) {
		int inputSeconds, hours, minutes, seconds;
		
		inputSeconds = 3695;
		
		hours =  inputSeconds/(60*60);
		minutes = inputSeconds/60 - hours * 60;
		// minutes = inputSeconds % 3600 - hours * 60;
		seconds = inputSeconds % 60;
				
		System.out.println("inputSecond is "+ inputSeconds);
		System.out.println(hours + " hours " + minutes + " minutes and " + seconds + " seconds");
		
	}

}
