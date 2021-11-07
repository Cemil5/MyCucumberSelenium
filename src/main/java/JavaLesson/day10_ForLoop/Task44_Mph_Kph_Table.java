package day10_ForLoop;

public class Task44_Mph_Kph_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final int STARTING_KPH = 60;
		final int MAX_KPH = 130;
		final int INCREMENT = 10;
		double mph;
		
		System.out.println("KPH \t MPH");
		System.out.println("--------------");
	//	for (int kph = 60; kph <=130; kph += 10) {
	//		System.out.println(kph + "\t" + kph*0.6214);
	//	}

		for (int kph=STARTING_KPH; kph<=MAX_KPH;kph+=INCREMENT) {
			mph = kph*0.6214;
			System.out.println(kph + "\t"+mph);
		}
		
		
	}

}
