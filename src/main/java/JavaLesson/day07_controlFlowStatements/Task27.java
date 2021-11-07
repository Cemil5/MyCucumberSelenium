package day07_controlFlowStatements;

public class Task27 {
	public static void main(String[] args) {
		
		int hour = 16;
		
		if (hour<12) {
			System.out.println("Good Morning");
		}
		if (hour>=12 & hour<15) {
			System.out.println("Good Afternoon");
		}
		if (hour>=15) {
			System.out.println("Good Evening");
		}
	}

}
