package a_live_review.week07_17_07_2021;

public class MethodsPractice {
	
	public static int getAgeInDays (int years) {
		return years * 365;
	}
	
	public static String getAgeInDaysMsg (int years) {
		return years + " years equal to " + getAgeInDays(years) + " days old";
	}
	
	public static String getAllLetters0(boolean isUpperCase, boolean isNormal) {
		String result ="";
		int start=0, finish=0;
		if (isNormal) {
			if (isUpperCase) {
				start = 'A';
				finish = 'Z';
			} else {
				start = 'a';
				finish = 'z';
				}
			for ( ; start<=finish; start++) {
				result += (char)start + " ";
			}
		} else {
			if (isUpperCase) {
				start = 'Z';
				finish = 'A';
			} else {
				start = 'z';
				finish = 'a';
				}
			for ( ; start>=finish; start--) {
				result += (char)start + " ";
			}
		}
		return result;
	}

	public static String getAllLetters(boolean isUpperCase, boolean isNormal) {
		String result ="";
		int start=0, finish=0;
			if (isUpperCase) {
				start = 'A';
				finish = 'Z';
			} else {
				start = 'a';
				finish = 'z';
				}
			
			if (isNormal) {
				for ( ; start<=finish; start++) {
					result += (char)start + " ";
				}
			} else {
				for ( ; finish>=start; finish--) {
					result += (char)finish + " ";
				}
			}
		
		return result;
	}

	
	public static void main(String[] args) {
		System.out.println("10 years equal to " + getAgeInDays(10) + " days old");
		System.out.println(getAgeInDaysMsg(10));
		System.out.println(getAllLetters(true, true));
		System.out.println(getAllLetters(false, true));
		System.out.println(getAllLetters(true, false));
		System.out.println(getAllLetters(false, false));



	}

}
