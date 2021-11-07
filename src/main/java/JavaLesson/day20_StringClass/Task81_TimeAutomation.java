package day20_StringClass;

public class Task81_TimeAutomation {

	public static void main(String[] args) {

		String date = "10/10/2019 14:59:00";
		
		timeStamp(date);
	}
	
	public static void timeStamp(String date) {
		String timeStamp="";
		for (int i=0;i<date.length();i++) {
			char ch = date.charAt(i);
			if (ch != '/' && ch != ' ' && ch != ':') {
				timeStamp += ch;
			}
		}
		System.out.println(timeStamp);
		System.out.println(timeStamp1(date));
	}
		public static String timeStamp1(String time) {
		
		time = time.replace("/", "").replace(":", "").replace(" ", "");
		
		return time;
	}

}
