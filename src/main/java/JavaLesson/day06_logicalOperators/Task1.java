package day06_logicalOperators;


public class Task1 {
	public static void main(String[] args) {
		
		int ApplesCount = 20;
		int OrangeCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangeCount || OrangeCount >= PearsCount; // 20 < 30 || 30 >= 30 => T || ---- = T
		System.out.println(comp);
		
	}

}
