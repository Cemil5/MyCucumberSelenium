package day36_Static;

public class StaticInit {
	
	static final int NUM_SECONDS_PER_HOURS;
	
	static {
		System.out.println("static init");
		int numSecondPerMinute = 60;
		int numMinutePerHour = 60;
		NUM_SECONDS_PER_HOURS = numSecondPerMinute;	
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;
	
	static {
		one = 1;
		two = 2;
	//	three = 4;	complains because it's final
	//	two = 4;	complains because it's final
		
	}
}
